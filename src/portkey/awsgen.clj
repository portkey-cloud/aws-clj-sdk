(ns portkey.awsgen
  (:require [clojure.spec.alpha :as spec]
    [cheshire.core :as json]
    [clojure.java.io :as io]
    [net.cgrand.xforms :as x]
    [clojure.string :as str]
    [portkey.aws :as aws]
    [clj-http.client :as http]
    [clojure.string :as str]
    [clojure.pprint]))

#_ (def all-apis 
     (->> (java.io.File. "resources/aws-sdk-core/apis/")
       file-seq
       (filter #(= "api-2.json" (.getName ^java.io.File %)))
       (map #(with-open [i (io/reader %)] (json/parse-stream i)))))

(defn- shapes-seq [shape]
  (tree-seq #(and (map? %) (#{"structure" "list" "map"} (% "type")))
    #(case (% "type")
       "structure" (vals (% "members"))
       "list" [(% "member")]
       "map" [(% "key") (% "value")]) shape))

(defn- shapes-by-usage [{:strs [shapes operations] :as api}]
  (let [nested-shape-names (into #{} (comp (mapcat shapes-seq) (keep #(get % "shape")))
                             (vals shapes))
        input-roots (keep #(get-in % ["input" "shape"]) (vals operations))
        output-roots (for [{:strs [errors output]} (vals operations)
                           {:strs [shape]} (cons output errors)
                           :when shape]
                       shape)
        inputs (into #{} (comp (map shapes) (mapcat shapes-seq) (keep #(get % "shape")))
                 input-roots)
        outputs (into #{} (comp (map shapes) (mapcat shapes-seq) (keep #(get % "shape")))
                  output-roots)]
    (when-some [culprit (first (filter #(or (get % "location") (get % "payload")) (mapcat (comp shapes-seq shapes) nested-shape-names)))]
      (throw (ex-info "Attribute payload or location found on nested shape." {:culprit culprit :api api})))
    {:inputs inputs
     :input-roots input-roots
     :outputs outputs
     :output-roots output-roots}))

(defn- shape-type [ns [name {:strs [type]}]] type)

(defmulti ^:private shape-to-spec "AWS shape to clojure spec" shape-type)

(defn- gen-shape-spec [ns [name shape :as e]]
  (let [form (shape-to-spec ns e)]
    (if (and (seq? form) (= 'do (first form)))
      `(~@(butlast form) ; includes do
         (spec/def ~(keyword ns (aws/dashed name)) ~(last form)))
      `(spec/def ~(keyword ns (aws/dashed name)) ~form))))

(defmacro ^:private strict-strs [& {:keys [req opt]}]
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
;; retro spec.
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
                   [k (keyword (if (not= shape k) (str ns "." (aws/dashed name)) ns) (aws/dashed k))]))
        #_#_locations
        (into {} (for [[k {:strs [locationName location]}] members
                       :when (and locationName (nil? location))]
                   [locationName k]))]
    `(do
       ~@(for [[k {:strs [shape] :as v}] members
               :when (not= shape k)]
           `(spec/def ~(keyword (str ns "." (aws/dashed name)) (aws/dashed k)) (spec/and ~(keyword ns (aws/dashed shape))))) ; spec/and is a hack to delay resolution
       (spec/merge
         (spec/keys :req-un ~(into [] (map spec-names) required)
          :opt-un ~(into []  (comp (remove (set required)) (map spec-names)) (keys members)))
         ; this spec is to help catch typos
         (spec/map-of ~(set (vals spec-names)) any?)))))

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

(defmethod shape-to-spec "list" [ns [name {{:strs [shape]} "member" :strs [max]}]]
  `(spec/and
     (spec/coll-of ~(keyword ns (aws/dashed shape)) :max-count ~max)
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

(spec/def ::input-shape
  (strict-strs ; validate only what we knows how to map
    :req {"type" #{"structure"}
          "members" (spec/map-of string? 
                      (spec/or
                        :atomic
                        (spec/and
                          (strict-strs
                            :req {"shape" string?}
                            :opt {"location" #{"uri" "querystring" "header"}
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
                   "deprecated" boolean?}))

(defn gen-input-rest-json [ns shapes {:as operation
                                      :strs [name]
                                      {input-shape "shape"} "input"
                                      {:strs [method requestUri responseCode]} "http"}]
  (let [{:as shape :strs [members]}
        (->> input-shape shapes (aws/conform-or-throw ::input-shape))
        spec (keyword ns (aws/dashed input-shape))
        input (gensym 'input)
        headers (into {} (for [[name member] members
                               :when (= "header" (member "location"))]
                           [(member "locationName") [`(-> ~(-> name aws/dashed keyword) ~input ~@(when (member "jsonvalue") `[json/generate-string aws/base64-encode])) ]])) ; TODO check that the header can't be anything than a string
        uri-params-map (into {} (for [[name member] members
                                      :when (= "uri" (member "location"))]
                                  [(member "locationName") (keyword (aws/dashed name))]))
        query-params (into {} (for [[name member] members
                                    :when (= "querystring" (member "location"))]
                                [(member "locationName") `(~(keyword (aws/dashed name)) ~input)]))
        has-hardcoded-query (re-find #"\?" requestUri)
        uri-expr (concat (if (seq query-params)
                           `(apply str)
                           `(str))
                   (for [[_ lit param] (re-seq #"([^{]+)|\{([^}]+)}" requestUri)]
                     (or lit
                       `(http/url-encode-illegal-characters (~(uri-params-map param) ~input))))
                   (when (seq query-params)
                     [(if has-hardcoded-query "&" "?") `(aws/query-params ~query-params)]))
        payload (some-> (get-in shapes [input-shape "payload"]) aws/dashed keyword)
        moves (for [[name member] members
                    :let [name (-> name aws/dashed keyword) 
                          locationName (some-> "locationName" member aws/dashed keyword)]
                    :when (and (not (member "location")) locationName)]
                `(move ~name ~locationName))]
    `(defn ~(symbol (str "req<-" (aws/dashed name))) [~input]
       (let [~input (aws/conform-or-throw ~spec ~input)]
         {:method ~method
          :headers ~headers
          :uri ~uri-expr
          :body ~(if payload 
                   `(~payload ~input)
                   `(-> ~input
                      ~@(for [k (concat (map second (vals headers)) (vals uri-params-map) (map first (vals query-params)))]
                          `(dissoc ~k))
                      ~@moves))}))))

(defn gen-operation [ns {:as operation
                         :strs [name errors]
                         {input-shape "shape"} "input"
                         {output-shape "shape"} "output"
                         {:strs [method requestUri responseCode]} "http"}
                     shapes]
  (let [error-specs (into {}
                      (map (fn [{:strs [shape] {:strs [httpStatusCode]} "error"}]
                             [shape (keyword ns (aws/dashed shape))]))
                      errors)
        varname (symbol (aws/dashed name))
        input-spec (some->> input-shape aws/dashed (keyword ns))
        output-spec (some->> output-shape aws/dashed (keyword ns))
        input (or (some-> input-shape aws/dashed symbol) '_)
        default-arg (if input-spec (some #(when (spec/valid? input-spec %) %) [[] {}]) {})]
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
                                  :opt {"location" #{"uri" "querystring" "header"}
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
         ~@(when default-arg `[([] (~varname ~default-arg))])
         ([~input]
           (-> ~input aws/conform-or-throw 
             (aws/-rest-json-call 
               ~(symbol ns "endpoints") 
               ~method ~requestUri ~input ~input-spec ~(some->> input-shape aws/dashed (str "req<-") symbol)
               ~responseCode ~output-spec ~error-specs))))
       (spec/fdef ~varname
         :args ~(if input-spec
                  `(~(if default-arg `spec/? `spec/tuple) ~input-spec)
                  `empty?)
         :ret ~(if output-spec `(spec/and ~output-spec) `true?)))))

(defn gen-api [ns-sym resource-name]
  (let [api (json/parse-stream (-> resource-name io/resource io/reader))]
    (case (get-in api ["metadata" "protocol"])
      "rest-json" 
      (let [ns (name ns-sym)
            specs (into [] (map #(doto (gen-shape-spec ns %) eval)) (api "shapes")) ; eval to make specs available right away for determining if 0-arg is supported
            {:keys [outputs output-roots inputs input-roots]} (shapes-by-usage api)
            vars (map (comp symbol portkey.aws/dashed)
                   (concat (map #(str "ser-" %) inputs) (map #(str "req<-" %) input-roots)
                     (map #(str "deser-" %) outputs) (map #(str "resp->" %) output-roots)))
            ops (into [] (map #(gen-operation ns %)) (vals (api "shapes")))]
        
        (concat specs
          (cons `(declare ~@vars) nil)
          ops))
      (do
        (binding [*out* *err*] (prn 'skipping ns-sym 'protocol (get-in api ["metadata" "protocol"])))
        [(list 'comment 'TODO 'support (get-in api ["metadata" "protocol"]))])
      #_"json"
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

(defn generate-files! []
  (let [endpoints (parse-endpoints! "resources/aws-partitions/partitions.json")]
    (->> (java.io.File. "resources/aws-sdk-core/apis/")
      file-seq
      (into []
        (comp
          (filter #(= "api-2.json" (.getName ^java.io.File %)))
          (x/by-key (fn [^java.io.File f] (-> f .getParentFile .getParentFile .getName))
            (comp (x/for [^java.io.File f %]
                    [(-> f .getParentFile .getName) (.getPath f)])
              (x/into (sorted-map))))
          (x/for [[api versions] %
                  :let [apifile (str/replace api #"[-.]" "_")
                        apins (str/replace api #"[.]" "-")
                        [latest f] (first (rseq versions))]
                  [version json] (cons [nil f] versions)
                  :let [_ (prn 'generating api (or version 'LATEST))
                        [_ json] (re-matches #"resources/(.*)" json)
                        [file ns]
                        (if version
                          [(java.io.File. (str "src/portkey/aws/" apifile "/_" version ".clj"))
                           (symbol (str "portkey.aws." apins ".-" version))]
                          [(java.io.File. (str "src/portkey/aws/" apifile ".clj"))
                           (symbol (str "portkey.aws." apins))])]]
            (with-open [w (io/writer (doto file (-> .getParentFile .mkdirs)))]
              (binding [*out* w]
                (prn (list 'ns ns '(:require [portkey.aws])))
                (newline)
                (clojure.pprint/pprint (list 'def 'endpoints (list 'quote (get endpoints apins))))
                (doseq [form (gen-api ns json)]
                  (newline)
                  (if (and (seq? form) (= 'do (first form)))
                    (run! prn (next form))
                    (prn form))))
              file)))))))
