(ns portkey.aws.cloudsearch.-2013-01-01 (:require [portkey.aws]))

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

(clojure.core/declare ser-double-array-options)

(clojure.core/declare ser-double)

(clojure.core/declare ser-index-field-type)

(clojure.core/declare ser-field-name-comma-list)

(clojure.core/declare ser-suggester)

(clojure.core/declare ser-lat-lon-options)

(clojure.core/declare ser-text-options)

(clojure.core/declare ser-standard-name)

(clojure.core/declare ser-analysis-scheme)

(clojure.core/declare ser-double-options)

(clojure.core/declare ser-expression)

(clojure.core/declare ser-text-array-options)

(clojure.core/declare ser-int-array-options)

(clojure.core/declare ser-domain-name-list)

(clojure.core/declare ser-dynamic-field-name-list)

(clojure.core/declare ser-analysis-options)

(clojure.core/declare ser-date-array-options)

(clojure.core/declare ser-policy-document)

(clojure.core/declare ser-expression-value)

(clojure.core/declare ser-algorithmic-stemming)

(clojure.core/declare ser-string)

(clojure.core/declare ser-date-options)

(clojure.core/declare ser-field-name)

(clojure.core/declare ser-standard-name-list)

(clojure.core/declare ser-suggester-fuzzy-matching)

(clojure.core/declare ser-dynamic-field-name)

(clojure.core/declare ser-analysis-scheme-language)

(clojure.core/declare ser-long)

(clojure.core/declare ser-literal-array-options)

(clojure.core/declare ser-word)

(clojure.core/declare ser-partition-instance-type)

(clojure.core/declare ser-literal-options)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-index-field)

(clojure.core/declare ser-field-value)

(clojure.core/declare ser-u-int-value)

(clojure.core/declare ser-scaling-parameters)

(clojure.core/declare ser-int-options)

(clojure.core/declare ser-document-suggester-options)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-double-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DoubleArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Double"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-index-field-type [input] #:http.request.field{:value (clojure.core/get {"int" "int", :date "date", :double "double", :literalarray "literal-array", :int "int", :intarray "int-array", :datearray "date-array", "text-array" "text-array", "latlon" "latlon", "text" "text", "int-array" "int-array", "literal-array" "literal-array", :latlon "latlon", :literal "literal", "double" "double", "date" "date", :doublearray "double-array", "double-array" "double-array", :textarray "text-array", "literal" "literal", :text "text", "date-array" "date-array"} input), :shape "IndexFieldType"})

(clojure.core/defn- ser-field-name-comma-list [input] #:http.request.field{:value input, :shape "FieldNameCommaList"})

(clojure.core/defn- ser-suggester [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-standard-name (:suggester-name input)) #:http.request.field{:name "SuggesterName", :shape "StandardName"}) (clojure.core/into (ser-document-suggester-options (:document-suggester-options input)) #:http.request.field{:name "DocumentSuggesterOptions", :shape "DocumentSuggesterOptions"})], :shape "Suggester", :type "structure"}))

(clojure.core/defn- ser-lat-lon-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LatLonOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-text-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TextOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"})) (clojure.core/contains? input :highlight-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :highlight-enabled)) #:http.request.field{:name "HighlightEnabled", :shape "Boolean"})) (clojure.core/contains? input :analysis-scheme) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-word (input :analysis-scheme)) #:http.request.field{:name "AnalysisScheme", :shape "Word"}))))

(clojure.core/defn- ser-standard-name [input] #:http.request.field{:value input, :shape "StandardName"})

(clojure.core/defn- ser-analysis-scheme [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-standard-name (:analysis-scheme-name input)) #:http.request.field{:name "AnalysisSchemeName", :shape "StandardName"}) (clojure.core/into (ser-analysis-scheme-language (:analysis-scheme-language input)) #:http.request.field{:name "AnalysisSchemeLanguage", :shape "AnalysisSchemeLanguage"})], :shape "AnalysisScheme", :type "structure"} (clojure.core/contains? input :analysis-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analysis-options (input :analysis-options)) #:http.request.field{:name "AnalysisOptions", :shape "AnalysisOptions"}))))

(clojure.core/defn- ser-double-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DoubleOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Double"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-expression [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-standard-name (:expression-name input)) #:http.request.field{:name "ExpressionName", :shape "StandardName"}) (clojure.core/into (ser-expression-value (:expression-value input)) #:http.request.field{:name "ExpressionValue", :shape "ExpressionValue"})], :shape "Expression", :type "structure"}))

(clojure.core/defn- ser-text-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TextArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :highlight-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :highlight-enabled)) #:http.request.field{:name "HighlightEnabled", :shape "Boolean"})) (clojure.core/contains? input :analysis-scheme) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-word (input :analysis-scheme)) #:http.request.field{:name "AnalysisScheme", :shape "Word"}))))

(clojure.core/defn- ser-int-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IntArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Long"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-domain-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-name coll) #:http.request.field{:shape "DomainName"}))) input), :shape "DomainNameList", :type "list"})

(clojure.core/defn- ser-dynamic-field-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dynamic-field-name coll) #:http.request.field{:shape "DynamicFieldName"}))) input), :shape "DynamicFieldNameList", :type "list"})

(clojure.core/defn- ser-analysis-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AnalysisOptions", :type "structure"} (clojure.core/contains? input :synonyms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :synonyms)) #:http.request.field{:name "Synonyms", :shape "String"})) (clojure.core/contains? input :stopwords) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stopwords)) #:http.request.field{:name "Stopwords", :shape "String"})) (clojure.core/contains? input :stemming-dictionary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stemming-dictionary)) #:http.request.field{:name "StemmingDictionary", :shape "String"})) (clojure.core/contains? input :japanese-tokenization-dictionary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :japanese-tokenization-dictionary)) #:http.request.field{:name "JapaneseTokenizationDictionary", :shape "String"})) (clojure.core/contains? input :algorithmic-stemming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-algorithmic-stemming (input :algorithmic-stemming)) #:http.request.field{:name "AlgorithmicStemming", :shape "AlgorithmicStemming"}))))

(clojure.core/defn- ser-date-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DateArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-policy-document [input] #:http.request.field{:value input, :shape "PolicyDocument"})

(clojure.core/defn- ser-expression-value [input] #:http.request.field{:value input, :shape "ExpressionValue"})

(clojure.core/defn- ser-algorithmic-stemming [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "minimal" "minimal", :minimal "minimal", "light" "light", :light "light", "full" "full", :full "full"} input), :shape "AlgorithmicStemming"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-date-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DateOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-field-name [input] #:http.request.field{:value input, :shape "FieldName"})

(clojure.core/defn- ser-standard-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-standard-name coll) #:http.request.field{:shape "StandardName"}))) input), :shape "StandardNameList", :type "list"})

(clojure.core/defn- ser-suggester-fuzzy-matching [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "low" "low", :low "low", "high" "high", :high "high"} input), :shape "SuggesterFuzzyMatching"})

(clojure.core/defn- ser-dynamic-field-name [input] #:http.request.field{:value input, :shape "DynamicFieldName"})

(clojure.core/defn- ser-analysis-scheme-language [input] #:http.request.field{:value (clojure.core/get {"nl" "nl", :fr "fr", :ja "ja", :el "el", "pt" "pt", "en" "en", :es "es", "lv" "lv", :pt "pt", :fi "fi", :ga "ga", "ro" "ro", "hy" "hy", "tr" "tr", "it" "it", "el" "el", "fa" "fa", :ca "ca", :ro "ro", :th "th", :tr "tr", :cs "cs", :hu "hu", "id" "id", "fi" "fi", :ko "ko", "ca" "ca", "sv" "sv", "fr" "fr", "eu" "eu", :it "it", "da" "da", "hu" "hu", "de" "de", "hi" "hi", :en "en", :nl "nl", "ru" "ru", :mul "mul", "ga" "ga", "es" "es", :de "de", :id "id", :ar "ar", :zh-hant "zh-Hant", "ja" "ja", :hy "hy", "mul" "mul", "gl" "gl", :ru "ru", :gl "gl", "cs" "cs", "no" "no", "zh-Hans" "zh-Hans", :he "he", :sv "sv", :da "da", "ar" "ar", "bg" "bg", "ko" "ko", :zh-hans "zh-Hans", :bg "bg", :lv "lv", "th" "th", :eu "eu", "he" "he", :hi "hi", :no "no", "zh-Hant" "zh-Hant", :fa "fa"} input), :shape "AnalysisSchemeLanguage"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-literal-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LiteralArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-word [input] #:http.request.field{:value input, :shape "Word"})

(clojure.core/defn- ser-partition-instance-type [input] #:http.request.field{:value (clojure.core/get {:searchm-3medium "search.m3.medium", "search.m3.2xlarge" "search.m3.2xlarge", "search.m3.large" "search.m3.large", "search.m2.xlarge" "search.m2.xlarge", :searchm-1large "search.m1.large", :searchm-2xlarge "search.m2.xlarge", :searchm-3xlarge "search.m3.xlarge", :searchm-1small "search.m1.small", "search.m3.xlarge" "search.m3.xlarge", "search.m1.small" "search.m1.small", "search.m3.medium" "search.m3.medium", "search.m1.large" "search.m1.large", :searchm-22xlarge "search.m2.2xlarge", :searchm-32xlarge "search.m3.2xlarge", :searchm-3large "search.m3.large", "search.m2.2xlarge" "search.m2.2xlarge"} input), :shape "PartitionInstanceType"})

(clojure.core/defn- ser-literal-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LiteralOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-index-field [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dynamic-field-name (:index-field-name input)) #:http.request.field{:name "IndexFieldName", :shape "DynamicFieldName"}) (clojure.core/into (ser-index-field-type (:index-field-type input)) #:http.request.field{:name "IndexFieldType", :shape "IndexFieldType"})], :shape "IndexField", :type "structure"} (clojure.core/contains? input :double-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-array-options (input :double-array-options)) #:http.request.field{:name "DoubleArrayOptions", :shape "DoubleArrayOptions"})) (clojure.core/contains? input :lat-lon-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lat-lon-options (input :lat-lon-options)) #:http.request.field{:name "LatLonOptions", :shape "LatLonOptions"})) (clojure.core/contains? input :text-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-options (input :text-options)) #:http.request.field{:name "TextOptions", :shape "TextOptions"})) (clojure.core/contains? input :double-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-options (input :double-options)) #:http.request.field{:name "DoubleOptions", :shape "DoubleOptions"})) (clojure.core/contains? input :text-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-array-options (input :text-array-options)) #:http.request.field{:name "TextArrayOptions", :shape "TextArrayOptions"})) (clojure.core/contains? input :int-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-int-array-options (input :int-array-options)) #:http.request.field{:name "IntArrayOptions", :shape "IntArrayOptions"})) (clojure.core/contains? input :date-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-array-options (input :date-array-options)) #:http.request.field{:name "DateArrayOptions", :shape "DateArrayOptions"})) (clojure.core/contains? input :date-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-options (input :date-options)) #:http.request.field{:name "DateOptions", :shape "DateOptions"})) (clojure.core/contains? input :literal-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-literal-array-options (input :literal-array-options)) #:http.request.field{:name "LiteralArrayOptions", :shape "LiteralArrayOptions"})) (clojure.core/contains? input :literal-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-literal-options (input :literal-options)) #:http.request.field{:name "LiteralOptions", :shape "LiteralOptions"})) (clojure.core/contains? input :int-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-int-options (input :int-options)) #:http.request.field{:name "IntOptions", :shape "IntOptions"}))))

(clojure.core/defn- ser-field-value [input] #:http.request.field{:value input, :shape "FieldValue"})

(clojure.core/defn- ser-u-int-value [input] #:http.request.field{:value input, :shape "UIntValue"})

(clojure.core/defn- ser-scaling-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ScalingParameters", :type "structure"} (clojure.core/contains? input :desired-instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-partition-instance-type (input :desired-instance-type)) #:http.request.field{:name "DesiredInstanceType", :shape "PartitionInstanceType"})) (clojure.core/contains? input :desired-replication-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-u-int-value (input :desired-replication-count)) #:http.request.field{:name "DesiredReplicationCount", :shape "UIntValue"})) (clojure.core/contains? input :desired-partition-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-u-int-value (input :desired-partition-count)) #:http.request.field{:name "DesiredPartitionCount", :shape "UIntValue"}))))

(clojure.core/defn- ser-int-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IntOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Long"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-document-suggester-options [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-name (:source-field input)) #:http.request.field{:name "SourceField", :shape "FieldName"})], :shape "DocumentSuggesterOptions", :type "structure"} (clojure.core/contains? input :fuzzy-matching) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-suggester-fuzzy-matching (input :fuzzy-matching)) #:http.request.field{:name "FuzzyMatching", :shape "SuggesterFuzzyMatching"})) (clojure.core/contains? input :sort-expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sort-expression)) #:http.request.field{:name "SortExpression", :shape "String"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-availability-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-boolean (input :multi-az)) #:http.request.field{:name "MultiAZ", :shape "Boolean"})]}))

(clojure.core/defn- req-describe-index-fields-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :field-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamic-field-name-list (input :field-names)) #:http.request.field{:name "FieldNames", :shape "DynamicFieldNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-define-analysis-scheme-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-analysis-scheme (input :analysis-scheme)) #:http.request.field{:name "AnalysisScheme", :shape "AnalysisScheme"})]}))

(clojure.core/defn- req-describe-scaling-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-describe-analysis-schemes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :analysis-scheme-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-name-list (input :analysis-scheme-names)) #:http.request.field{:name "AnalysisSchemeNames", :shape "StandardNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-delete-suggester-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-standard-name (input :suggester-name)) #:http.request.field{:name "SuggesterName", :shape "StandardName"})]}))

(clojure.core/defn- req-define-suggester-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-suggester (input :suggester)) #:http.request.field{:name "Suggester", :shape "Suggester"})]}))

(clojure.core/defn- req-delete-expression-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-standard-name (input :expression-name)) #:http.request.field{:name "ExpressionName", :shape "StandardName"})]}))

(clojure.core/defn- req-delete-index-field-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-dynamic-field-name (input :index-field-name)) #:http.request.field{:name "IndexFieldName", :shape "DynamicFieldName"})]}))

(clojure.core/defn- req-describe-availability-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-create-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-define-expression-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-expression (input :expression)) #:http.request.field{:name "Expression", :shape "Expression"})]}))

(clojure.core/defn- req-update-scaling-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-scaling-parameters (input :scaling-parameters)) #:http.request.field{:name "ScalingParameters", :shape "ScalingParameters"})]}))

(clojure.core/defn- req-index-documents-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-delete-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-build-suggesters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-describe-service-access-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-describe-suggesters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :suggester-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-name-list (input :suggester-names)) #:http.request.field{:name "SuggesterNames", :shape "StandardNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-define-index-field-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-index-field (input :index-field)) #:http.request.field{:name "IndexField", :shape "IndexField"})]}))

(clojure.core/defn- req-describe-expressions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :expression-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-name-list (input :expression-names)) #:http.request.field{:name "ExpressionNames", :shape "StandardNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-describe-domains-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :domain-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name-list (input :domain-names)) #:http.request.field{:name "DomainNames", :shape "DomainNameList"}))))

(clojure.core/defn- req-delete-analysis-scheme-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-standard-name (input :analysis-scheme-name)) #:http.request.field{:name "AnalysisSchemeName", :shape "StandardName"})]}))

(clojure.core/defn- req-update-service-access-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-policy-document (input :access-policies)) #:http.request.field{:name "AccessPolicies", :shape "PolicyDocument"})]}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.index-documents-response/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/index-documents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.index-documents-response/field-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/double-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.double-array-options/default-value :portkey.aws.cloudsearch.-2013-01-01.double-array-options/source-fields :portkey.aws.cloudsearch.-2013-01-01.double-array-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.double-array-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.double-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/index-field-type #{"int" :date :double :literalarray :int :intarray :datearray "text-array" "latlon" "text" "int-array" "literal-array" :latlon :literal "double" "date" :doublearray "double-array" :textarray "literal" :text "date-array"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/index-field-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/index-field-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/update-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/domain-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.update-availability-options-request/multi-az (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/update-availability-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01.update-availability-options-request/multi-az] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-index-fields-request/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/dynamic-field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-index-fields-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-index-fields-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-index-fields-request/field-names :portkey.aws.cloudsearch.-2013-01-01.describe-index-fields-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-analysis-scheme-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-scaling-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/api-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.define-index-field-response/index-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/index-field-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-index-field-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.define-index-field-response/index-field] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-analysis-schemes-request/analysis-scheme-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-analysis-schemes-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-analysis-schemes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-analysis-schemes-request/analysis-scheme-names :portkey.aws.cloudsearch.-2013-01-01.describe-analysis-schemes-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-expressions-response/expressions (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/expression-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-expressions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.describe-expressions-response/expressions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/field-name-comma-list (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"\s*[a-z*][a-z0-9_]*\*?\s*(,\s*[a-z*][a-z0-9_]*\*?\s*)*" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/maximum-replication-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.suggester/suggester-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/suggester (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.suggester/suggester-name :portkey.aws.cloudsearch.-2013-01-01/document-suggester-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-suggester-request/suggester-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-suggester-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01.delete-suggester-request/suggester-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/lat-lon-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/default-value :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/source-field :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/return-enabled :portkey.aws.cloudsearch.-2013-01-01.lat-lon-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-options/highlight-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-options/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/word))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/text-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.text-options/default-value :portkey.aws.cloudsearch.-2013-01-01.text-options/source-field :portkey.aws.cloudsearch.-2013-01-01.text-options/return-enabled :portkey.aws.cloudsearch.-2013-01-01.text-options/sort-enabled :portkey.aws.cloudsearch.-2013-01-01.text-options/highlight-enabled :portkey.aws.cloudsearch.-2013-01-01.text-options/analysis-scheme]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.analysis-scheme-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.analysis-scheme-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.analysis-scheme-status/options :portkey.aws.cloudsearch.-2013-01-01.analysis-scheme-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-suggester-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01/suggester] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/standard-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[a-z][a-z0-9_]*" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-expression-request/expression-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-expression-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01.delete-expression-request/expression-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-index-field-request/index-field-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/dynamic-field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-index-field-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01.delete-index-field-request/index-field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.analysis-scheme/analysis-scheme-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.analysis-scheme/analysis-scheme-name :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-language] :opt-un [:portkey.aws.cloudsearch.-2013-01-01/analysis-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.define-analysis-scheme-response/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-analysis-scheme-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.define-analysis-scheme-response/analysis-scheme] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.index-field-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/index-field))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.index-field-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/index-field-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.index-field-status/options :portkey.aws.cloudsearch.-2013-01-01.index-field-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-availability-options-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-availability-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-availability-options-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/create-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-domains-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-status-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/scaling-parameters))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/scaling-parameters-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.scaling-parameters-status/options :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.double-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/double-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.double-options/default-value :portkey.aws.cloudsearch.-2013-01-01.double-options/source-field :portkey.aws.cloudsearch.-2013-01-01.double-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.double-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.double-options/return-enabled :portkey.aws.cloudsearch.-2013-01-01.double-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.expression/expression-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/expression (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.expression/expression-name :portkey.aws.cloudsearch.-2013-01-01/expression-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/field-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/field-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-array-options/highlight-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.text-array-options/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/word))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/text-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.text-array-options/default-value :portkey.aws.cloudsearch.-2013-01-01.text-array-options/source-fields :portkey.aws.cloudsearch.-2013-01-01.text-array-options/return-enabled :portkey.aws.cloudsearch.-2013-01-01.text-array-options/highlight-enabled :portkey.aws.cloudsearch.-2013-01-01.text-array-options/analysis-scheme]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-expression-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01/expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.update-availability-options-response/availability-options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/availability-options-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/update-availability-options-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.update-availability-options-response/availability-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/update-scaling-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01/scaling-parameters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.build-suggesters-response/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/build-suggesters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.build-suggesters-response/field-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/service-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/int-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.int-array-options/default-value :portkey.aws.cloudsearch.-2013-01-01.int-array-options/source-fields :portkey.aws.cloudsearch.-2013-01-01.int-array-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.int-array-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.int-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/index-documents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/disabled-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.list-domain-names-response/domain-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/domain-name-map))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/list-domain-names-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.list-domain-names-response/domain-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/domain-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/created (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/requires-index-documents (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/doc-service (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/service-endpoint))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/deleted (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/search-instance-count (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/instance-count))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/processing (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/search-service (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/service-endpoint))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.domain-status/search-partition-count (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/partition-count))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/domain-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-id :portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01.domain-status/requires-index-documents] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.domain-status/created :portkey.aws.cloudsearch.-2013-01-01/arn :portkey.aws.cloudsearch.-2013-01-01/limits :portkey.aws.cloudsearch.-2013-01-01.domain-status/doc-service :portkey.aws.cloudsearch.-2013-01-01.domain-status/deleted :portkey.aws.cloudsearch.-2013-01-01.domain-status/search-instance-count :portkey.aws.cloudsearch.-2013-01-01.domain-status/processing :portkey.aws.cloudsearch.-2013-01-01.domain-status/search-service :portkey.aws.cloudsearch.-2013-01-01/search-instance-type :portkey.aws.cloudsearch.-2013-01-01.domain-status/search-partition-count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.service-endpoint/endpoint (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/service-url))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/service-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.service-endpoint/endpoint]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/suggester-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/suggester-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/limits (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/maximum-replication-count :portkey.aws.cloudsearch.-2013-01-01/maximum-partition-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/build-suggesters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/dynamic-field-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/dynamic-field-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.analysis-options/synonyms (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.analysis-options/stopwords (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.analysis-options/stemming-dictionary (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.analysis-options/japanese-tokenization-dictionary (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/analysis-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.analysis-options/synonyms :portkey.aws.cloudsearch.-2013-01-01.analysis-options/stopwords :portkey.aws.cloudsearch.-2013-01-01.analysis-options/stemming-dictionary :portkey.aws.cloudsearch.-2013-01-01.analysis-options/japanese-tokenization-dictionary :portkey.aws.cloudsearch.-2013-01-01/algorithmic-stemming]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/partition-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-index-field-response/index-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/index-field-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-index-field-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.delete-index-field-response/index-field] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-availability-options-response/availability-options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/availability-options-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-availability-options-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-availability-options-response/availability-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-service-access-policies-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-service-access-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-service-access-policies-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.option-status/creation-date (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.option-status/update-date (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.option-status/update-version (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/u-int-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.option-status/state (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-state))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.option-status/pending-deletion (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/option-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.option-status/creation-date :portkey.aws.cloudsearch.-2013-01-01.option-status/update-date :portkey.aws.cloudsearch.-2013-01-01.option-status/state] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.option-status/update-version :portkey.aws.cloudsearch.-2013-01-01.option-status/pending-deletion]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/date-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.date-array-options/default-value :portkey.aws.cloudsearch.-2013-01-01.date-array-options/source-fields :portkey.aws.cloudsearch.-2013-01-01.date-array-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.date-array-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.date-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/expression-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/algorithmic-stemming #{"light" "none" :full "minimal" "full" :minimal :light :none})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.suggester-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.suggester-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/suggester-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.suggester-status/options :portkey.aws.cloudsearch.-2013-01-01.suggester-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.define-suggester-response/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/suggester-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-suggester-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.define-suggester-response/suggester] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-suggester-response/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/suggester-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-suggester-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.delete-suggester-response/suggester] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-service-access-policies-response/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-service-access-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.describe-service-access-policies-response/access-policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.date-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/date-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.date-options/default-value :portkey.aws.cloudsearch.-2013-01-01.date-options/source-field :portkey.aws.cloudsearch.-2013-01-01.date-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.date-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.date-options/return-enabled :portkey.aws.cloudsearch.-2013-01-01.date-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-analysis-schemes-response/analysis-schemes (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-analysis-schemes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.describe-analysis-schemes-response/analysis-schemes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[a-z][a-z0-9_]*" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/domain-name-map (clojure.spec.alpha/map-of :portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01/api-version))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.base-exception/code (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/error-code))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.base-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/base-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.base-exception/code :portkey.aws.cloudsearch.-2013-01-01.base-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/standard-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/standard-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/suggester-fuzzy-matching #{"low" "none" "high" :high :low :none})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/domain-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01/domain-status]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-index-fields-response/index-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/index-field-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-index-fields-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.describe-index-fields-response/index-fields] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/dynamic-field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/expression-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/expression-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-language #{"nl" :fr :ja :el "pt" "en" :es "lv" :pt :fi :ga "ro" "hy" "tr" "it" "el" "fa" :ca :ro :th :tr :cs :hu "id" "fi" :ko "ca" "sv" "fr" "eu" :it "da" "hu" "de" "hi" :en :nl "ru" :mul "ga" "es" :de :id :ar :zh-hant "ja" :hy "mul" "gl" :ru :gl "cs" "no" "zh-Hans" :he :sv :da "ar" "bg" "ko" :zh-hans :bg :lv "th" :eu "he" :hi :no "zh-Hant" :fa})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-suggesters-request/suggester-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-suggesters-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-suggesters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-suggesters-request/suggester-names :portkey.aws.cloudsearch.-2013-01-01.describe-suggesters-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.define-expression-response/expression (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/expression-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-expression-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.define-expression-response/expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/literal-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.literal-array-options/default-value :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/source-fields :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.literal-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-analysis-scheme-response/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-analysis-scheme-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.delete-analysis-scheme-response/analysis-scheme] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/word (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\S]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/partition-instance-type #{:searchm-3medium "search.m3.2xlarge" "search.m3.large" "search.m2.xlarge" :searchm-1large :searchm-2xlarge :searchm-3xlarge :searchm-1small "search.m3.xlarge" "search.m1.small" "search.m3.medium" "search.m1.large" :searchm-22xlarge :searchm-32xlarge :searchm-3large "search.m2.2xlarge"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/define-index-field-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01/index-field] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.expression-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/expression))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.expression-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/expression-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.expression-status/options :portkey.aws.cloudsearch.-2013-01-01.expression-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.literal-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/literal-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.literal-options/default-value :portkey.aws.cloudsearch.-2013-01-01.literal-options/source-field :portkey.aws.cloudsearch.-2013-01-01.literal-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.literal-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.literal-options/return-enabled :portkey.aws.cloudsearch.-2013-01-01.literal-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.update-scaling-parameters-response/scaling-parameters (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/scaling-parameters-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/update-scaling-parameters-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.update-scaling-parameters-response/scaling-parameters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.update-service-access-policies-response/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/update-service-access-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.update-service-access-policies-response/access-policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.access-policies-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.access-policies-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/access-policies-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.access-policies-status/options :portkey.aws.cloudsearch.-2013-01-01.access-policies-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-scaling-parameters-response/scaling-parameters (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/scaling-parameters-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-scaling-parameters-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.describe-scaling-parameters-response/scaling-parameters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 3 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 28)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[a-z][a-z0-9\-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-expressions-request/expression-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-expressions-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-expressions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-expressions-request/expression-names :portkey.aws.cloudsearch.-2013-01-01.describe-expressions-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.index-field/index-field-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/dynamic-field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/index-field (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.index-field/index-field-name :portkey.aws.cloudsearch.-2013-01-01/index-field-type] :opt-un [:portkey.aws.cloudsearch.-2013-01-01/double-array-options :portkey.aws.cloudsearch.-2013-01-01/lat-lon-options :portkey.aws.cloudsearch.-2013-01-01/text-options :portkey.aws.cloudsearch.-2013-01-01/double-options :portkey.aws.cloudsearch.-2013-01-01/text-array-options :portkey.aws.cloudsearch.-2013-01-01/int-array-options :portkey.aws.cloudsearch.-2013-01-01/date-array-options :portkey.aws.cloudsearch.-2013-01-01/date-options :portkey.aws.cloudsearch.-2013-01-01/literal-array-options :portkey.aws.cloudsearch.-2013-01-01/literal-options :portkey.aws.cloudsearch.-2013-01-01/int-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-domains-request/domain-names (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-domains-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.describe-domains-request/domain-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-expression-response/expression (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/expression-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-expression-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.delete-expression-response/expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/field-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 0 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.delete-analysis-scheme-request/analysis-scheme-name (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/delete-analysis-scheme-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01.delete-analysis-scheme-request/analysis-scheme-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/maximum-partition-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/search-instance-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.update-service-access-policies-request/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/update-service-access-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01/domain-name :portkey.aws.cloudsearch.-2013-01-01.update-service-access-policies-request/access-policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/option-state #{"Active" :processing "FailedToValidate" :requires-index-documents "RequiresIndexDocuments" :failed-to-validate :active "Processing"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/create-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01/domain-status]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/multi-az clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/u-int-value (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters/desired-instance-type (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters/desired-replication-count (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/u-int-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters/desired-partition-count (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/u-int-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/scaling-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.scaling-parameters/desired-instance-type :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters/desired-replication-count :portkey.aws.cloudsearch.-2013-01-01.scaling-parameters/desired-partition-count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.describe-suggesters-response/suggesters (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/suggester-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/describe-suggesters-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.describe-suggesters-response/suggesters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.int-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/int-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.int-options/default-value :portkey.aws.cloudsearch.-2013-01-01.int-options/source-field :portkey.aws.cloudsearch.-2013-01-01.int-options/facet-enabled :portkey.aws.cloudsearch.-2013-01-01.int-options/search-enabled :portkey.aws.cloudsearch.-2013-01-01.int-options/return-enabled :portkey.aws.cloudsearch.-2013-01-01.int-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch.-2013-01-01/analysis-scheme-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.document-suggester-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.document-suggester-options/fuzzy-matching (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/suggester-fuzzy-matching))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.document-suggester-options/sort-expression (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/document-suggester-options (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.document-suggester-options/source-field] :opt-un [:portkey.aws.cloudsearch.-2013-01-01.document-suggester-options/fuzzy-matching :portkey.aws.cloudsearch.-2013-01-01.document-suggester-options/sort-expression]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.availability-options-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/multi-az))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01.availability-options-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/availability-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.-2013-01-01.availability-options-status/options :portkey.aws.cloudsearch.-2013-01-01.availability-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.-2013-01-01/boolean clojure.core/boolean?)

(clojure.core/defn delete-index-field ([delete-index-field-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-index-field-request delete-index-field-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/delete-index-field-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/delete-index-field-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteIndexField", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-index-field :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/delete-index-field-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/delete-index-field-response))

(clojure.core/defn list-domain-names ([] (list-domain-names {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/list-domain-names-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDomainNames", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception}})))))
(clojure.spec.alpha/fdef list-domain-names :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/list-domain-names-response))

(clojure.core/defn update-service-access-policies ([update-service-access-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-service-access-policies-request update-service-access-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/update-service-access-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/update-service-access-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateServiceAccessPolicies", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception}})))))
(clojure.spec.alpha/fdef update-service-access-policies :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/update-service-access-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/update-service-access-policies-response))

(clojure.core/defn describe-service-access-policies ([describe-service-access-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-service-access-policies-request describe-service-access-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-service-access-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-service-access-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeServiceAccessPolicies", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-service-access-policies :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/describe-service-access-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-service-access-policies-response))

(clojure.core/defn define-analysis-scheme ([define-analysis-scheme-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-define-analysis-scheme-request define-analysis-scheme-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/define-analysis-scheme-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/define-analysis-scheme-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DefineAnalysisScheme", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-analysis-scheme :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/define-analysis-scheme-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/define-analysis-scheme-response))

(clojure.core/defn define-index-field ([define-index-field-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-define-index-field-request define-index-field-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/define-index-field-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/define-index-field-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DefineIndexField", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-index-field :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/define-index-field-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/define-index-field-response))

(clojure.core/defn define-expression ([define-expression-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-define-expression-request define-expression-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/define-expression-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/define-expression-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DefineExpression", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-expression :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/define-expression-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/define-expression-response))

(clojure.core/defn build-suggesters ([build-suggesters-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-build-suggesters-request build-suggesters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/build-suggesters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/build-suggesters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BuildSuggesters", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef build-suggesters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/build-suggesters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/build-suggesters-response))

(clojure.core/defn describe-index-fields ([describe-index-fields-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-index-fields-request describe-index-fields-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-index-fields-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-index-fields-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeIndexFields", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-index-fields :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/describe-index-fields-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-index-fields-response))

(clojure.core/defn create-domain ([create-domain-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-domain-request create-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/create-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/create-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDomain", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-domain :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/create-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/create-domain-response))

(clojure.core/defn define-suggester ([define-suggester-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-define-suggester-request define-suggester-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/define-suggester-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/define-suggester-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DefineSuggester", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-suggester :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/define-suggester-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/define-suggester-response))

(clojure.core/defn delete-expression ([delete-expression-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-expression-request delete-expression-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/delete-expression-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/delete-expression-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteExpression", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-expression :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/delete-expression-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/delete-expression-response))

(clojure.core/defn delete-analysis-scheme ([delete-analysis-scheme-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-analysis-scheme-request delete-analysis-scheme-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/delete-analysis-scheme-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/delete-analysis-scheme-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAnalysisScheme", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-analysis-scheme :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/delete-analysis-scheme-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/delete-analysis-scheme-response))

(clojure.core/defn describe-analysis-schemes ([describe-analysis-schemes-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-analysis-schemes-request describe-analysis-schemes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-analysis-schemes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-analysis-schemes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAnalysisSchemes", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-analysis-schemes :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/describe-analysis-schemes-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-analysis-schemes-response))

(clojure.core/defn describe-domains ([] (describe-domains {})) ([describe-domains-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-domains-request describe-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-domains-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-domains-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDomains", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef describe-domains :args (clojure.spec.alpha/? :portkey.aws.cloudsearch.-2013-01-01/describe-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-domains-response))

(clojure.core/defn update-availability-options ([update-availability-options-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-availability-options-request update-availability-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/update-availability-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/update-availability-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAvailabilityOptions", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.cloudsearch.-2013-01-01/disabled-operation-exception}})))))
(clojure.spec.alpha/fdef update-availability-options :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/update-availability-options-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/update-availability-options-response))

(clojure.core/defn update-scaling-parameters ([update-scaling-parameters-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-scaling-parameters-request update-scaling-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/update-scaling-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/update-scaling-parameters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateScalingParameters", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception}})))))
(clojure.spec.alpha/fdef update-scaling-parameters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/update-scaling-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/update-scaling-parameters-response))

(clojure.core/defn describe-scaling-parameters ([describe-scaling-parameters-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-scaling-parameters-request describe-scaling-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-scaling-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-scaling-parameters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScalingParameters", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-parameters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/describe-scaling-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-scaling-parameters-response))

(clojure.core/defn index-documents ([index-documents-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-index-documents-request index-documents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/index-documents-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/index-documents-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "IndexDocuments", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef index-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/index-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/index-documents-response))

(clojure.core/defn delete-domain ([delete-domain-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-domain-request delete-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/delete-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/delete-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDomain", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception}})))))
(clojure.spec.alpha/fdef delete-domain :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/delete-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/delete-domain-response))

(clojure.core/defn delete-suggester ([delete-suggester-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-suggester-request delete-suggester-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/delete-suggester-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/delete-suggester-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSuggester", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-suggester :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/delete-suggester-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/delete-suggester-response))

(clojure.core/defn describe-availability-options ([describe-availability-options-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-availability-options-request describe-availability-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-availability-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-availability-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAvailabilityOptions", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch.-2013-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.cloudsearch.-2013-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception, "DisabledOperationException" :portkey.aws.cloudsearch.-2013-01-01/disabled-operation-exception}})))))
(clojure.spec.alpha/fdef describe-availability-options :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/describe-availability-options-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-availability-options-response))

(clojure.core/defn describe-expressions ([describe-expressions-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-expressions-request describe-expressions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-expressions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-expressions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeExpressions", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-expressions :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/describe-expressions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-expressions-response))

(clojure.core/defn describe-suggesters ([describe-suggesters-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-describe-suggesters-request describe-suggesters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch.-2013-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.cloudsearch.-2013-01-01/describe-suggesters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch.-2013-01-01/describe-suggesters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSuggesters", :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch.-2013-01-01/base-exception, "InternalException" :portkey.aws.cloudsearch.-2013-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch.-2013-01-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-suggesters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch.-2013-01-01/describe-suggesters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch.-2013-01-01/describe-suggesters-response))
