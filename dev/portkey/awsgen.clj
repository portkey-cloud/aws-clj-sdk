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
            [clojure.java.classpath :as cp]
            [clojure.string :as s]))


(defn- shapes-seq
  "Takes a shape and returns a sequence of itself and all its nested shapes."
  [shape]
  (tree-seq #(and (map? %) (#{"structure" "list" "map"} (% "type")))
            #(case (% "type")
               "structure" (vals (% "members"))
               "list" [(% "member")]
               "map" [(% "key") (% "value")]) shape))


(defn- fixpoint [f init]
  (let [x (f init)]
    (if (= x init)
      init
      (recur f x))))

(defn- shapes-by-usage
  "Takes an api description and returns a map categoriizing shapes by their usage.
  This map has 4 keys: :inputs, :input-roots, :outputs
  and :output-roots, all mapping to collections of shapes.
  Root shapes are shapes that appear as top-level paylods (including
  errors).
  A shape may appear in several categories."
  [{:strs [shapes operations] :as api}]
  (let [shapes-refs (into {}
                          (x/by-key
                           (comp (mapcat shapes-seq) (keep #(get % "shape")) (x/into #{})))
                          shapes)
        reachable-shapes (fixpoint (fn [reachable-shapes]
                                     (x/into {}
                                             (x/for [[shape reachables] %]
                                               [shape (into reachables (mapcat shapes-refs) reachables)])
                                             reachable-shapes))
                                   shapes-refs)
        input-roots (keep #(get-in % ["input" "shape"]) (vals operations))
        output-roots (for [{:strs [errors output]} (vals operations)
                           {:strs [shape]} (cons output errors)
                           :when shape]
                       shape)
        inputs (into #{} (mapcat reachable-shapes) input-roots)
        outputs (into #{} (mapcat reachable-shapes) output-roots)
        nested-shape-names (into #{} (vals shapes-refs))]
    ; How likely it is that this assertion will break in the future?
    ; I (cgrand) believe this assertion was mostly useful before the req/deser/ser/resp unbundling
    (when-some [culprit (first (filter #(or (get % "location") (get % "payload")) (mapcat (comp shapes-seq shapes) nested-shape-names)))]
      (throw (ex-info "Attribute payload or location found on nested shape." {:culprit culprit :api api})))
    {:inputs inputs
     :input-roots input-roots
     :outputs outputs
     :output-roots output-roots}))

(defmulti ^:private shape-to-spec
  "Takes a shape and retuns a spec (as unevaluated code)."
  (fn [ns [name {:strs [type]}]] type))

(defn- gen-shape-spec [ns [name shape :as e]]
  (spec/assert ::shape shape )
  (let [form (shape-to-spec ns e)]
    (if (and (seq? form) (= `with-prerequisites (first form)))
      `(do
         ~@(butlast (next form)) ; includes do
         (spec/def ~(keyword ns (aws/dashed name)) ~(last form)))
      `(spec/def ~(keyword ns (aws/dashed name)) ~form))))

(defmacro ^:private strict-strs
  "Allows to specify a string-keyed map in a strict manner (any unknown key
   triggers a validation error).
   This brittle behavior is on purpose: strict-strs is meant to be used to
   validate the API json files and we want to know when something new appears
   in a json file."
  [& {:keys [req opt]}]
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
    `(with-prerequisites
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
  `(spec/coll-of ~(keyword ns (aws/dashed shape)) ~@(when min `[:min-count ~min]) ~@(when max `[:max-count ~max]))) ; HAL ❤️

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
    (into {} (mapcat (fn [s] [[s s] [(keyword (aws/dashed s)) s]])) enum)
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

(defmethod shape-to-spec "blob" [ns _] `bytes?)

(defmethod shape-type-spec "long" [_]
  (strict-strs
    :req {"type" string?}
    #_#_:opt {"max" int?
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
  (if (or min max)
    `(spec/int-in ~(or min 'Long/MIN_VALUE) ~(or max 'Long/MAX_VALUE))
    `int?))

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


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; BEGINNING OF PROOF OF CONCEPT FOR SPEC -> SER -> RESP ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn shape-name->ser-name
  "Given a shape name, transorm it to a ser-* name."
  [shape-name]
  (->> shape-name (str "ser-") portkey.aws/dashed symbol))


(defmulti gen-ser-input (fn [shape-name api _]
                          [(get-in api ["metadata" "protocol"]) (get-in api ["shapes" shape-name "type"])]))


(defmethod gen-ser-input :default [shape-name api _]
  (let [mess [(get-in api ["metadata" "protocol"]) (get-in api ["shapes" shape-name "type"])]]
    (throw
     (ex-info (str "unsupported protocol/type for shape : " shape-name)
              {:shape mess}))))


(defmethod gen-ser-input ["rest-json" "integer"] [shape-name api input] input)


(defmethod gen-ser-input ["rest-json" "long"] [shape-name api input] input)


(defmethod gen-ser-input ["query" "integer"] [shape-name api input] input)


(defmethod gen-ser-input ["rest-json" "double"] [shape-name api input] input)


(defmethod gen-ser-input ["query" "double"] [shape-name api input] input)


(defmethod gen-ser-input ["query" "long"] [shape-name api input] input)


(defmethod gen-ser-input ["rest-json" "structure"] [shape-name api input]
  (let [shape  (get-in api ["shapes" shape-name])
        x# (into []
                 (mapcat (fn [[k# {:strs [shape]}]]
                           (let [test-form# `(~(-> k# aws/dashed keyword) ~input)]
                             [test-form# `(assoc ~k# (~(shape-name->ser-name shape) ~test-form#))])))
                 (shape "members"))]
    `(cond-> {}
       ~@x#)))


(defmethod gen-ser-input ["query" "structure"] [shape-name api input]
  (let [shape  (get-in api ["shapes" shape-name])
        x# (into []
                 (mapcat (fn [[k# {:strs [shape]}]]
                           (let [test-form# `(~(-> k# aws/dashed keyword) ~input)]
                             [test-form# `(assoc ~(str shape-name "." k#) (~(shape-name->ser-name shape) ~test-form#))])))
                 (shape "members"))]
    `(cond-> {}
       ~@x#)))


(defmethod gen-ser-input ["query" "string"] [shape-name api input]
  (let [{:strs [enum] :as shape} (get-in api ["shapes" shape-name])]
    (if enum
      (let [m (into {} (mapcat #(vector [% %] [(-> % aws/dashed keyword) %])) enum)]
        (list m input))
      input)))


(defmethod gen-ser-input ["rest-json" "map"] [shape-name api input] input)


(defmethod gen-ser-input ["query" "map"] [shape-name api input]
  `(into {} (comp (map-indexed (fn [idx# [k# v#]]
                                [[(str "entry." (inc idx#) ".key") k#]
                                 [(str "entry." (inc idx#) ".value") v#]]))
                 cat)
        ~input))

(defmethod gen-ser-input ["rest-json" "boolean"] [shape-name api input] input)


(defmethod gen-ser-input ["query" "boolean"] [shape-name api input] input)


(defmethod gen-ser-input ["rest-json" "timestamp"] [shape-name api input] input)


(defmethod gen-ser-input ["query" "timestamp"] [shape-name api input] input)


(defmethod gen-ser-input ["rest-json" "list"] [shape-name api input] input)


(defmethod gen-ser-input ["query" "list"] [shape-name _ input]
  `(into {} (map-indexed (fn [idx# item#] [(str "member." (inc idx#)) item#]) ~input)))


(defmethod gen-ser-input ["rest-json" "blob"] [shape-name api input]
  `(aws/base64-encode ~input))


(defmethod gen-ser-input ["query" "blob"] [shape-name api input]
  `(aws/base64-encode ~input))


(defn gen-ser-fns
  "Given an api description map and a shape name, returns a list
  representing it's serialization function.

  - gen-ser-fns calls a multimethod which dispatch on [protocol type] value.

  For example, the shape TracingConfig from the lambda api is describe
  by the map :

  {type structure, members {Mode {shape TracingMode}}}

  Calling (gen-ser-fns api TracingConfig) will generate this list :

  (clojure.core/defn-
   ser-tracing-config
   [shape-input]
   (clojure.core/cond->
    {}
    (:mode shape-input)
    (clojure.core/assoc Mode (ser-tracing-mode (:mode shape-input)))))"

  [api shape-name]
  (let [varname (shape-name->ser-name shape-name)
        input# (symbol "shape-input")]
    `(defn- ~varname
       [~input#]
       ~(gen-ser-input shape-name api input#))))


;;;;;;;;;;;;;;;
;; REQ PART  ;;
;;;;;;;;;;;;;;;


(defn shape-name->req-name
  "Given a shape name, transorm it to a ser-* name."
  [shape-name]
  (->> shape-name (str "req<-") portkey.aws/dashed symbol))


(defn- input-root-shape->req-map
  "Given an input-root shape map, returns a map of SubShapeName / ser-name-fn.
  Map is sorted by optional/required type and by HTTP configuration, e.g. body/uri/querystring/header.

  For example calling (input-root-shape->req-map (get-in api [shapes CreateFunctionRequest]))

  Will return :

  {:optional
   {:body
    {MemorySize ser-memory-size,
     Environment ser-environment,
     Timeout ser-timeout,
     KMSKeyArn ser-kmskey-arn,
     VpcConfig ser-vpc-config,
     DeadLetterConfig ser-dead-letter-config,
     Tags ser-tags,
     Publish ser-boolean,
     TracingConfig ser-tracing-config,
     Description ser-description}},
   :required
   {:body
    {FunctionName ser-function-name,
     Handler ser-handler,
     Runtime ser-runtime,
     Role ser-role-arn,
     Code ser-function-code}}}"
  [input-shape]
  (let [required-shapes (set (get input-shape "required"))]
    (into {}
          (x/by-key (fn [[k v]] (if (contains? required-shapes k) :required :optional))
                    (comp (map (fn [[k {:strs [shape location locationName]} :as o]]
                                 (let [ser-name (shape-name->ser-name shape)]
                                   (condp = location
                                     "uri" [:uri [k ser-name]]
                                     "querystring" [:query-string [k ser-name]]
                                     "header" [:headers [k ser-name]]
                                     nil [:body [k ser-name]]))))
                          (x/by-key (x/into {}))
                          (x/into {})))
          (get input-shape "members"))))


(defn gen-req-fns
  "Given an api description and a shape-name, returns a list representing
  the request function. Request function is split into HTTP configuration
  type as define by the ring request specification and calls
  serialization functions.

  For example calling (gen-req-fns api TagResourceRequest)

  Will return :

  (clojure.core/defn
   req<-tag-resource-request
   [input240922]
   {:uri {Resource (ser-function-arn (input240922 :resource))},
    :body {Tags (ser-tags (input240922 :tags))}})"
  [api shape-name & {:keys [version]}]
  (let [shape (get-in api ["shapes" shape-name])
        function-input (gensym "input")
        {:keys [optional required]} (input-root-shape->req-map shape)
        optional-part (fn [required-part input]
                        (let [in (into []
                                       (comp (x/for [[request-part value] %
                                                     :let [shape-name ser-name] value]
                                               (let [e# (-> shape-name aws/dashed keyword)]
                                                 `[(contains? ~function-input ~e#) (assoc-in [~request-part ~shape-name] (~ser-name (~function-input ~e#)))]))
                                             cat)
                                       input)]
                          `(cond-> ~required-part
                             ~@in)))
        required-part (into {}
                            (comp (x/for [[loc value] %
                                          :let [shape-name ser-name] value
                                          :let [e# (-> shape-name aws/dashed keyword)]]
                                    [loc [shape-name `(~ser-name (~function-input ~e#)) ]])
                                  (x/by-key (x/into {})))
                            required)
        ;; Because we can't be sure that an input-root is bound to exactly one operation, we pass action-name in the query request for only this protocol
        action-name-input (gensym "action-name")
        init (if version
               (merge-with merge required-part {:body {"Version" version "Action" action-name-input}})
               required-part)
        function-body (cond
                        (and required optional) (let [x (gensym "input")]
                                                  `(let [~x ~init]
                                                     ~(optional-part x optional)))
                        (not (nil? required)) init
                        (not (nil? optional)) (optional-part init optional))
        fn-inputs (if version
                    `[[~action-name-input ~function-input] ~function-body]
                    `[[~function-input] ~function-body])]
    `(defn ~(shape-name->req-name shape-name)
       ~@fn-inputs)))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; END OF PROOF OF CONCEPT WITH : SPEC -> SER -> REQ  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


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

(defn gen-operation [ns {:as operation
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
       (strict-strs           ; validate only what we knows how to map
        :req {"type" #{"structure"}
              "members" (spec/map-of string?
                                     (spec/or
                                      :atomic
                                      (spec/and
                                       (strict-strs
                                        :req {"shape" string?}
                                        :opt {"location" #{"uri" "querystring" "header" #_#_"headers" "statusCode"}
                                              "locationName" string?
                                              "idempotencyToken" boolean? ; see https://docs.aws.amazon.com/connect/latest/APIReference/API_StartOutboundVoiceContact.html
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
    `(with-prerequisites
       (defn ~varname                   ; TODO add deprecated flag
         ~@(when documentation
             [(format-documentation documentation)])
         ~@(when default-arg `[([] (~varname ~default-arg))])
         ([~input]
          (let [req<-input# (~(shape-name->req-name input-shape) ~input)]
            (aws/-rest-json-call
             ~(symbol ns "endpoints")
             ~method ~requestUri req<-input# ~input-spec
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
             ~responseCode ~output-spec ~error-specs))))
       (spec/fdef ~varname
                  :args ~(if input-spec
                           `(~(if default-arg `spec/? `spec/tuple) ~input-spec)
                           `empty?)
                  :ret ~(if output-spec `(spec/and ~output-spec) `true?)))))


(defn gen-operation-query [ns {:as operation
                               :strs [name errors]
                               {input-shape "shape"} "input"
                               {output-shape "shape"} "output"
                               {:strs [method requestUri responseCode]} "http"}
                           shapes
                           {:as docs :strs [operations]}]
  (when input-shape
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
         (strict-strs           ; validate only what we knows how to map
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
         (defn ~varname                   ; TODO add deprecated flag
           ~@(when documentation
               [(format-documentation documentation)])
           ~@(when default-arg `[([] (~varname ~default-arg))])
           ([~input]
            (let [req<-input# (~(shape-name->req-name input-shape) ~name ~input)]
              (aws/-query-call
               ~(symbol ns "endpoints")
               ~method ~requestUri req<-input# ~input-spec
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
               ~responseCode ~output-spec ~error-specs))))
         (spec/fdef ~varname
                    :args ~(if input-spec
                             `(~(if default-arg `spec/? `spec/tuple) ~input-spec)
                             `empty?)
                    :ret ~(if output-spec `(spec/and ~output-spec) `true?))))))



(defn gen-api [ns-sym api-resource docs-resource]
  (let [api (json/parse-stream (io/reader api-resource))
        docs (json/parse-stream (io/reader docs-resource))]
    (case (get-in api ["metadata" "protocol"])
      "rest-json" (let [specs+fns (for [[k gen] {"shapes" (comp #(doto % eval) gen-shape-spec) ; eval to make specs available right away
                                                 "operations" (fn [ns [_ op]] (gen-operation ns op (api "shapes") docs))}
                                        desc (api k)]
                                    (gen (name ns-sym) desc))
                        {:keys [inputs input-roots]} (shapes-by-usage api)
                        ser-vars `(do (declare ~@(for [shape-name inputs]
                                                   (shape-name->ser-name shape-name))))
                        ser-fns `(do ~@(for [shape-name inputs]
                                         (gen-ser-fns api shape-name)))
                        req-fns `(do ~@(for [shape-name input-roots]
                                         (gen-req-fns api shape-name)))]
                    (concat
                     [ser-vars]
                     [ser-fns]
                     [req-fns]
                     specs+fns))
      "query" (let [specs+fns (for [[k gen] {"shapes" (comp #(doto % eval) gen-shape-spec) ; eval to make specs available right away
                                             "operations" (fn [ns [_ op]] (gen-operation-query ns op (api "shapes") docs))}
                                    desc (api k)]
                                (gen (name ns-sym) desc))
                    {:keys [inputs input-roots]} (shapes-by-usage api)
                    ser-vars `(do (declare ~@(for [shape-name inputs]
                                               (shape-name->ser-name shape-name))))
                    ser-fns `(do ~@(for [shape-name inputs]
                                     (gen-ser-fns api shape-name)))
                    req-fns `(do ~@(for [shape-name input-roots
                                         :let [version (get-in api ["metadata" "apiVersion"])]]
                                     (gen-req-fns api shape-name :version version)))]
                (concat
                 [ser-vars]
                 [ser-fns]
                 [req-fns]
                 specs+fns))
      (do
        (binding [*out* *err*] (prn 'skipping ns-sym 'protocol (get-in api ["metadata" "protocol"])))
        [(list 'comment 'TODO 'support (get-in api ["metadata" "protocol"]))]))))

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

(defn generate-files!
  [& {:keys [verbose api-name protocol]
      :or {verbose false api-name nil protocol nil}}]
  (let [endpoints (parse-endpoints! "api-resources/aws-sdk-ruby/gems/aws-partitions/partitions.json")
        entries (into []
                  (comp
                    (x/for [^java.io.File f %
                            :when (-> f .getName (.endsWith "api-2.json"))]
                      [(-> f .getParentFile .getParentFile .getName)
                       [(-> f .getParentFile .getName) (.getPath f)]])
                    (x/by-key (x/into (sorted-map)))
                    (x/sort))
                  (file-seq (java.io.File. "api-resources/aws-sdk-ruby/apis/")))
        gen-results (for [[api versions] entries
                          :let [apifile (str/replace api #"[-.]" "_")
                                apins (str/replace api #"[.]" "-")
                                [latest f] (first (rseq versions))]
                          :when (or (nil? api-name) (= apins api-name))
                          [version api-json] (cons [nil f] versions)
                          :when (or (nil? protocol) (= protocol (get-in (with-open [r (io/reader api-json)] (json/parse-stream r)) ["metadata" "protocol"])))
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
                            (clojure.pprint/pprint (list 'def 'endpoints (list 'quote (get endpoints apins))))
                            (doseq [form (gen-api ns api-json docs-json)]
                              (newline)
                              (if (and (seq? form) (= 'do (first form)))
                                (run! prn (next form))
                                (prn form)))))
                        {:gen-status :ok}
                        (catch Throwable t
                          (println "Failed to generate" api (.getMessage t))
                          (when verbose (println t))
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
