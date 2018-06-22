(ns portkey.awsgen
  (:require [clojure.spec.alpha :as spec]
    [cheshire.core :as json]
    [clojure.java.io :as io]
    [net.cgrand.xforms :as x]
    [clojure.string :as str]
    [portkey.aws :as aws]
    [clj-http.client :as http]
    [clojure.string :as str]
    [clojure.pprint]
    [clojure.java.classpath :as cp]))

#_ (def all-apis 
     (->> (java.io.File. "resources/aws-sdk-core/apis/")
       file-seq
       (filter #(= "api-2.json" (.getName ^java.io.File %)))
       (map #(with-open [i (io/reader %)] (json/parse-stream i)))))

(defmulti ^:private shape-to-spec (fn [ns [name {:strs [type]}]] type))

(defn- gen-shape-spec [ns [name shape :as e]]
  (let [form (shape-to-spec ns e)]
    (if (and (seq? form) (= 'do (first form)))
      `(~@(butlast form) ; includes do
         (spec/def ~(keyword ns (aws/dashed name)) ~(last form)))
      `(spec/def ~(keyword ns (aws/dashed name)) ~form))))

(defmacro strict-strs [& {:keys [req opt]}]
  `(spec/and
     (spec/every
       (spec/or 
         ~@(mapcat (fn [[field spec]]
                     [(keyword field)
                      `(spec/tuple #{~field} ~spec)]) (concat req opt)))
       :kind map?)
     (fn [m#]
       (every? #(contains? m# %) [~@(keys req)]))))

;; :portkey.awsgen/shape is a strict (it fails to validate when unexpected attributes)
;; retro spec 
(defmulti shape-type-spec #(get % "type"))
(spec/def ::shape (spec/multi-spec shape-type-spec #(assoc %1 "type" %2)))

(defmethod shape-to-spec :default [ns [name _ :as kv]]
  (throw (ex-info (str "unsupported shape " name) {:shape kv})))

(defmethod shape-type-spec "structure" [_]
  (strict-strs
    :req {"type" string?
          "members" (spec/map-of string? 
                      (strict-strs
                        :req {"shape" string?}
                        :opt {"location" #{"uri" "querystring" "header" "headers" "statusCode"}
                              "locationName" string?
                              "queryName" string?
                              "deprecated" boolean?
                              "idempotencyToken" boolean?
                              "xmlNamespace"
                              (strict-strs :req {"uri" string?}) ; TODO validate
                              "xmlAttribute" boolean?
                              "box" boolean?
                              "jsonValue" boolean?
                              "jsonvalue" boolean?
                              "streaming" boolean?
                              "flattened" boolean?}))}
    :opt {"required" (spec/coll-of string?)
          "error" (strict-strs
                    :req {"httpStatusCode" int?}
                    :opt {"code" string? "senderFault" boolean?})
          "exception" boolean?
          "fault" boolean?
          "payload" string?
          "deprecated" boolean?
          "locationName" string?
          "sensitive" boolean?
          "wrapper" boolean?
          "xmlOrder" (spec/coll-of string?)
          "xmlNamespace"
          (strict-strs :req {"uri" string?} ; TODO validate
            :opt {"prefix" string?})}))

(defmethod shape-to-spec "structure" [ns [name {:strs [members required payload deprecated error exception]}]]
  (let [spec-names 
        (into {} (for [[k {:strs [shape]}] members]
                   [k (keyword (if (not= shape k) (str ns "." (aws/dashed name)) ns) k)]))
        locations
        (into {} (for [[k {:strs [locationName location]}] members
                       :when (and locationName (nil? location))]
                   [locationName k]))]
    `(do
       ~@(for [[k {:strs [shape] :as v}] members
               :when (not= shape k)]
           `(spec/def ~(keyword (str ns "." (aws/dashed name)) (aws/dashed k)) (spec/and ~(keyword ns (aws/dashed shape))))) ; spec/and is a hack to delay resolution
       (aws/json-keys :req-un ~(into [] (map spec-names) required)
         :opt-un ~(into []  (comp (remove (set required)) (map spec-names))
                    (keys members))
         :locations ~locations))))

(defmethod shape-type-spec "list" [_]
  (strict-strs
    :req {"type" string?
          "member" (strict-strs :req {"shape" string?}
                     :opt {"locationName" string?})}
    :opt {"max" int?
          "min" int?
          "deprecated" boolean?
          "flattened" boolean?
          "sensitive" boolean?}))

(defmethod shape-to-spec "list" [ns [name {{:strs [shape]} "member" :strs [min max]}]]
  `(spec/and
     (spec/coll-of ~(keyword ns (aws/dashed shape)) ~@(when min `[:min-count ~min]) ~@(when max `[:max-count ~max]))
     (spec/conformer identity #(if (sequential? %) % [%])))) ; HAL ❤️

(defmethod shape-type-spec "boolean" [_]
  (strict-strs :req {"type" string?}
    :opt {"box" boolean?}))

(defmethod shape-to-spec "boolean" [ns [name _]] `boolean?)

(defmethod shape-type-spec "map" [_]
  (strict-strs
    :req {"type" string?
          "key" (strict-strs :req {"shape" string?} :opt {"locationName" string?})
          "value" (strict-strs :req {"shape" string?} :opt {"locationName" string?})}
    :opt {"sensitive" boolean?
          "max" int?
          "min" int?
          "flattened" boolean?
          "locationName" string?}))

(defmethod shape-to-spec "map" [ns [name {:strs [key value sensitive]}]]
  `(spec/map-of ~(keyword ns (aws/dashed (key "shape"))) ~(keyword ns (aws/dashed (value "shape")))))

(defmethod shape-type-spec "string" [_]
  (strict-strs
    :req {"type" string?}
    :opt {"max" int?
          "min" int?
          "pattern" string?
          "enum" (spec/coll-of string?)
          "sensitive" boolean?}))

(defmethod shape-to-spec "string" [ns [name {:strs [min max sensitive pattern enum]}]] 
  (if enum
    `(spec/conformer
       (let [m# ~(into {} (mapcat (fn [s] [[s s] [(keyword (aws/dashed s)) s]])) enum)]
         (fn [s#] (m# s# ::spec/invalid)))
       (comp keyword aws/dashed))
    `(spec/and string?
       ~@(when min [`(fn [s#] (<= ~min (count s#)))])
       ~@(when max [`(fn [s#] (< (count s#) ~max))])
       ~@(when pattern [`(fn [s#] (re-matches ~(re-pattern pattern) s#))]))))

(defmethod shape-type-spec "blob" [_]
  (strict-strs
    :req {"type" string?}
    :opt {"streaming" boolean?
          "max" int?
          "min" int?
          "sensitive" boolean?}))

(defmethod shape-to-spec "blob" [ns [name {:strs [streaming sensitive]}]]
  `(spec/and bytes? (spec/conformer aws/base64-encode aws/base64-decode)))

(defmethod shape-type-spec "long" [_]
  (strict-strs
    :req {"type" string?}
    :opt {"max" int?
          "min" int?}))

(defmethod shape-to-spec "long" [ns _] `int?)

(defmethod shape-type-spec "integer" [_]
  (strict-strs
    :req {"type" string?}
    :opt {"max" int?
          "min" int?
          "box" boolean?
          "deprecated" boolean?}))

(defmethod shape-to-spec "integer" [ns [name {:strs [min max]}]]
  `(spec/and int? ~@(when min [`#(<= ~min %)]) ~@(when max [`#(<= % ~max)])))

(defmethod shape-type-spec "timestamp" [_]
  (strict-strs :req {"type" string?}
    :opt {"timestampFormat" #{"iso8601"}})) ; TODO pattern

(defmethod shape-to-spec "timestamp" [ns _] `inst?)

(defmethod shape-type-spec "double" [_]
  (strict-strs :req {"type" string?}
    :opt {"min" number?
          "max" number?
          "box" boolean?}))

(defmethod shape-to-spec "double" [ns _] `double?)

(defmethod shape-type-spec "float" [_]
  (strict-strs :req {"type" string?}
    :opt {"min" number?
          "max" number?}))

(defmethod shape-to-spec "double" [ns _] `double?)

(spec/def ::operation
  (strict-strs
    :req {"name" string?
          "http" (strict-strs
                   :req {"method" #{"POST" "DELETE" "GET" "PATCH" "PUT" "HEAD"}
                         "requestUri" string?}
                   :opt {"responseCode" int?})}
    :opt {"input" (strict-strs :req {"shape" string?}
                    :opt {"xmlNamespace"
                          (strict-strs :req {"uri" string?})
                          "locationName" string?}) ; TODO validate
          "output" (strict-strs :req {"shape" string?}
                     :opt {"resultWrapper" string?})
          "idempotent" boolean?
          "errors"
          (spec/coll-of
            (strict-strs :req {"shape" string?}
              :opt {"exception" boolean?
                    "fault" true?
                    "error" (strict-strs
                              :req {"httpStatusCode" int?}
                              :opt {"code" string?, "senderFault" boolean?})}))
          "documentationUrl" string? ; TODO
          "alias" string?
          "authtype" #{"none" "v4-unsigned-body"}
          "deprecated" boolean?}))

#_(str/replace uri #"\{(.*)}" (fn [[_ name]]))

(defn split-line [n line]
  (reduce
   (fn [lines word]
     (if (or (empty? lines)
             (>= (+ (count (last lines)) (count word)) n))
       (conj lines word)
       (update lines (dec (count lines)) str " " word)))
   []
   (str/split line #"\s+")))

(defn split-to-length [n text]
  (str/join
   "\n"
   (mapcat (partial split-line n)
           (str/split text #"\n"))))

(defn format-documentation [doc]
  (let [acc (StringBuilder.)
        block #{"br" "dd" "dt" "p" "h1" "h2" "h3" "h4" "h5"}
        append (fn [text] (.append acc text))
        visitor (reify org.jsoup.select.NodeVisitor
            (head [this node depth]
              (when (instance? org.jsoup.nodes.TextNode node)
                (append (.text node)))
              (when (= "li" (.nodeName node))
                (append "\n *")))
            (tail [this node depth]
              (when (block (.nodeName node))
                (append "\n"))
              (when (and (= "a" (.nodeName node))
                         (not (empty? (.absUrl node "href"))))
                (append (format " (%s)" (.absUrl node "href"))))))]
    (org.jsoup.select.NodeTraversor/traverse visitor (org.jsoup.Jsoup/parseBodyFragment doc))
    (split-to-length 80 (.toString acc))))

(defmulti gen-operation (fn [_
                             {:strs [protocol
                                     jsonVersion]}
                             _
                             _
                             _]
                          (cond-> [protocol]
                            (and
                             (= protocol "json")
                             jsonVersion) (conj jsonVersion))))

(defmethod gen-operation ["rest-json"]
  [ns
   metadata
   {:as operation
    :strs [name errors]
    {input-shape "shape"} "input"
    {output-shape "shape"} "output"
    {:strs [method requestUri responseCode]} "http"}
   shapes
   {:as docs :strs [operations]}]
  (let [error-specs (into {}
                      (map (fn [{:strs [shape] {:strs [httpStatusCode]} "error"}]
                             [shape (keyword ns (aws/dashed shape))]))
                      errors)
        varname (symbol (aws/dashed name))
        input-spec (some->> input-shape aws/dashed (keyword ns))
        output-spec (some->> output-shape aws/dashed (keyword ns))
        input (or (some-> input-shape aws/dashed symbol) '_)
        default-arg (if input-spec (some #(when (spec/valid? input-spec %) %) [[] {}]) {})
        documentation (operations name)]
    (when input-shape
      (aws/conform-or-throw
        (strict-strs ; validate only what we knows how to map
          :req {"type" #{"structure"}
                "members" (spec/map-of string? 
                            (spec/or
                              :atomic
                              (spec/and
                                (strict-strs
                                  :req {"shape" string?}
                                  :opt {"location" #{"uri" "querystring" "header" #_#_"headers" "statusCode"}
                                        "locationName" string?
                                        "deprecated" boolean?})
                                #(= (contains? % "location") (contains? % "locationName")))
                              :querystringmap
                              (strict-strs
                                :req {"shape" string?}
                                :opt {"location" #{"querystring"}})
                              :move
                              (strict-strs
                                :req {"shape" string?}
                                :opt {"locationName" string?})
                              :json-value
                              (strict-strs
                                :req {"shape" string?
                                    "location" #{"header"}
                                    "locationName" string?
                                    "jsonvalue" true?})))}
         :opt {"required" (spec/coll-of string?)
               "payload" string?
               "deprecated" boolean?})
        (shapes input-shape)))
    `(do
       (defn ~varname ; TODO add deprecated flag
         ~@(when documentation
             [(format-documentation documentation)])
         ~@(when default-arg `[([] (~varname ~default-arg))])
         ([~input]
           (aws/-rest-json-call 
             ~(symbol ns "endpoints") 
             ~method ~requestUri ~input ~input-spec
             {:headers ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                       :when (= "header" (member "location"))]
                                   [name [(member "locationName") (member "jsonvalue")]]))
              :uri ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                   :when (= "uri" (member "location"))]
                               [(member "locationName") name]))
              :querystring ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                           :when (= "querystring" (member "location"))]
                                       [(member "locationName") name]))
              :payload ~(get-in shapes [input-shape "payload"])
              :move ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                    :let [locationName (member "locationName")]
                                    :when (when-not (member "location") locationName)]
                                [locationName name]))}
             ~responseCode ~output-spec ~error-specs)))
       (spec/fdef ~varname
         :args ~(if input-spec
                  `(~(if default-arg `spec/? `spec/tuple) ~input-spec)
                  `empty?)
         :ret ~(if output-spec `(spec/and ~output-spec) `true?)))))

(defmethod gen-operation ["json" "1.0"]
  [ns
   {:strs [targetPrefix] :as metadata}
   {:as operation
    :strs [name errors]
    {input-shape "shape"} "input"
    {output-shape "shape"} "output"
    {:strs [method requestUri responseCode]} "http"}
   shapes
   {:as docs :strs [operations]}]
  (let [error-specs (into {}
                      (map (fn [{:strs [shape] {:strs [httpStatusCode]} "error"}]
                             [shape (keyword ns (aws/dashed shape))]))
                      errors)
        varname (symbol (aws/dashed name))
        input-spec (some->> input-shape aws/dashed (keyword ns))
        output-spec (some->> output-shape aws/dashed (keyword ns))
        input (or (some-> input-shape aws/dashed symbol) '_)
        default-arg (if input-spec (some #(when (spec/valid? input-spec %) %) [[] {}]) {})
        documentation (operations name)
        x-amz-target (str targetPrefix "." name)]
    (when input-shape
      (aws/conform-or-throw
        (strict-strs ; validate only what we knows how to map
          :req {"type" #{"structure"}
                "members" (spec/map-of string?
                            (spec/or
                              :atomic
                              (spec/and
                                (strict-strs
                                  :req {"shape" string?}
                                  :opt {"location" #{"uri" "querystring" "header" #_#_"headers" "statusCode"}
                                        "locationName" string?
                                        "deprecated" boolean?})
                                #(= (contains? % "location") (contains? % "locationName")))
                              :querystringmap
                              (strict-strs
                                :req {"shape" string?}
                                :opt {"location" #{"querystring"}})
                              :move
                              (strict-strs
                                :req {"shape" string?}
                                :opt {"locationName" string?})
                              :json-value
                              (strict-strs
                                :req {"shape" string?
                                    "location" #{"header"}
                                    "locationName" string?
                                    "jsonvalue" true?})))}
         :opt {"required" (spec/coll-of string?)
               "payload" string?
               "deprecated" boolean?})
        (shapes input-shape)))
    `(do
       (defn ~varname ; TODO add deprecated flag
         ~@(when documentation
             [(format-documentation documentation)])
         ~@(when default-arg `[([] (~varname ~default-arg))])
         ([~input]
           (aws/-json-call
             ~(symbol ns "endpoints")
             ~method ~x-amz-target ~input ~input-spec
             {:headers ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                       :when (= "header" (member "location"))]
                                   [name [(member "locationName") (member "jsonvalue")]]))
              :uri ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                   :when (= "uri" (member "location"))]
                               [(member "locationName") name]))
              :querystring ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                           :when (= "querystring" (member "location"))]
                                       [(member "locationName") name]))
              :payload ~(get-in shapes [input-shape "payload"])
              :move ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                    :let [locationName (member "locationName")]
                                    :when (when-not (member "location") locationName)]
                                [locationName name]))}
             ~responseCode ~output-spec ~error-specs)))
       (spec/fdef ~varname
         :args ~(if input-spec
                  `(~(if default-arg `spec/? `spec/tuple) ~input-spec)
                  `empty?)
         :ret ~(if output-spec `(spec/and ~output-spec) `true?)))))

(defn gen-api [ns-sym api-resource docs-resource]
  (let [api (json/parse-stream (io/reader api-resource))
        docs (json/parse-stream (io/reader docs-resource))
        {:strs [protocol]
         :as metadata} (get api "metadata")]
    (case protocol
      "rest-json" (for [[k gen] {"shapes" (comp #(doto % eval) gen-shape-spec) ; eval to make specs available right away
                                 "operations" (fn [ns [_ op]] (gen-operation
                                                               ns metadata op (api "shapes") docs))}
                        desc (api k)]
                    (gen (name ns-sym) desc))
      "json" (let [json-version (get metadata "jsonVersion")]
               (case json-version
                 "1.0"
                 (for [[k gen] {"shapes" (comp #(doto % eval) gen-shape-spec) ; eval to make specs available right away
                                "operations" (fn [ns [_ op]] (gen-operation ns metadata op (api "shapes") docs))}
                       desc (api k)]
                   (gen (name ns-sym) desc))
                 (do
                   (binding [*out* *err*] (prn 'skipping ns-sym 'protocol "json" 'protocol-version json-version))
                   [(list 'comment 'TODO 'support "json" 'protocol-version json-version)])))
      (do
        (binding [*out* *err*] (prn 'skipping ns-sym 'protocol protocol))
        [(list 'comment 'TODO 'support protocol)])
      #_"json" ;; 1.1+
      #_"ec2"
      #_"query"
      #_"rest-xml")))

(defn parse-endpoints! [src]
  (let [endpoints (with-open [r (io/reader src)] (json/parse-stream r))]
    (reduce (fn [m [p v]] (assoc-in m p v)) {}
      (for [{:as partition
             :strs [defaults services regions dnsSuffix]} (endpoints "partitions")
            :let [regions (set (keys regions))]
            [service {defaults' "defaults" :strs [endpoints partitionEndpoint]}] services
            :let [defaults (into defaults defaults')]
            region (into regions (keys endpoints))
            :let [desc (or (endpoints region) (endpoints partitionEndpoint))]
            :when desc
            :let [{:strs [hostname sslCommonName protocols credentialScope signatureVersions]} (into defaults desc)
                  protocol (or (some #{"https"} protocols) (first protocols)) ; prefer https
                  credentialScope (into {"service" service "region" region} credentialScope)
                  sslCommonName (or sslCommonName hostname) 
                  env #(case % "{region}" region "{service}" service "{dnsSuffix}" dnsSuffix)
                  hostname (str/replace hostname #"\{(?:region|service|dnsSuffix)}" env)
                  sslCommonName (str/replace sslCommonName #"\{(?:region|service|dnsSuffix)}" env)
                  endpoint (str protocol "://" hostname)
                  signature-version (some->
                                      (or (some (set signatureVersions) ["v4" "s3v4" "v2" "s3"]) ; most recent first
                                        (first signatureVersions))
                                      keyword)]]
        [[service region] {:credential-scope (x/into {} (x/for [[k v] %] [(keyword k) v]) credentialScope)
                           :ssl-common-name sslCommonName :endpoint endpoint :signature-version signature-version}]))))

(defn generate-files! [& [verbose]]
  (let [endpoints (parse-endpoints! "api-resources/aws-sdk-ruby/gems/aws-partitions/partitions.json")
        entries (into []
                      (comp
                       (filter #(re-find #"api-2.json" (.getName ^java.io.File  %)))
                       (x/by-key (fn [^java.io.File f] (-> f .getParentFile .getParentFile .getName))
                                 (comp (x/for [^java.io.File f %]
                                         [(-> f .getParentFile .getName) (.getPath f)])
                                       (x/into (sorted-map))))
                       (x/sort))
                      (file-seq (java.io.File. "api-resources/aws-sdk-ruby/apis/")))
        gen-results (for [[api versions] entries
                          :let [apifile (str/replace api #"[-.]" "_")
                                apins (str/replace api #"[.]" "-")
                                [latest f] (first (rseq versions))]
                          [version api-json] (cons [nil f] versions)
                          :let [[file ns] (if version
                                            [(java.io.File. (str "src/portkey/aws/" apifile "/_" version ".clj"))
                                             (symbol (str "portkey.aws." apins ".-" version))]
                                            [(java.io.File. (str "src/portkey/aws/" apifile ".clj"))
                                             (symbol (str "portkey.aws." apins))])]]
                      (try
                        (prn 'generating api (or version 'LATEST))
                        (with-open [w (io/writer (doto file (-> .getParentFile .mkdirs)))
                                    docs-json (-> api-json io/file .getParentFile (io/file "docs-2.json") java.io.FileInputStream.)
                                    api-json (java.io.FileInputStream. api-json)]
                          (binding [*out* w]
                            (prn (list 'ns ns '(:require [portkey.aws])))
                            (newline)
                            (clojure.pprint/pprint
                             (list 'def 'endpoints
                                   (list 'quote
                                         (or (get endpoints apins
                                                  (get endpoints api))
                                             (throw (ex-info "Cannot find Endpoints!"
                                                             {:api api
                                                              :apins apins}))))))
                            (doseq [form (gen-api ns api-json docs-json)]
                              (newline)
                              (if (and (seq? form) (= 'do (first form)))
                                (run! prn (next form))
                                (prn form)))))
                        {:gen-status :ok}
                        (catch Throwable t
                          (println "Failed to generate" api)
                          (when verbose
                            (println t))
                          {:gen-status :fail :api api :file file})))
        gen-failures (filter #(-> % :gen-status (= :fail)) gen-results)]
    (if (seq gen-failures)
      (do
        (printf "Encountered %d errors while generating, failed for APIs: %s\n"
                (count gen-failures)
                (str/join ", " (map :api gen-failures)))
        (doseq [failure gen-failures]
          (-> failure :file (.delete))))
      (println "Generation OK!"))))
