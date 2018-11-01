(ns portkey.awsgen
  (:require [cheshire.core :as json]

            [clojure.java.io :as io]
            [clojure.spec.alpha :as spec]
            [clojure.string :as str]

            [net.cgrand.xforms :as x]

            [portkey.aws :as aws]))


;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                 ___                      ___          _     _                ┃
;; ┃                / __|_ __  ___ __   ___  | _ \__ _ _ _| |_  / |               ┃
;; ┃                \__ \ '_ \/ -_) _| |___| |  _/ _` | '_|  _| | |               ┃
;; ┃                |___/ .__/\___\__|       |_| \__,_|_|  \__| |_|               ┃
;; ┃                    |_|                                                       ┃
;; ┃     There are two blocks of code related to spec, the first one is used      ┃
;; ┃      at compile time. It let us validate that we know all description        ┃
;; ┃                      format from aws api-2.json files.                       ┃
;; ┃     The second block of specs is used at runtime to validate user input.     ┃
;; ┃      We generate spec/def that will be part of the final lib.clj file.       ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

;;;;;;;;;;;;;;;;;;
;; SPEC HELPERS ;;
;;;;;;;;;;;;;;;;;;


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


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; COMPILE TIME SHAPE SPECS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defmulti compile-time-shape-spec #(get % "type"))


(spec/def ::shape (spec/multi-spec compile-time-shape-spec #(assoc %1 "type" %2)))


(defmethod compile-time-shape-spec "string" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"       int?
         "min"       int?
         "pattern"   string?
         "enum"      (spec/coll-of string?)
         "sensitive" boolean?}))


(defmethod compile-time-shape-spec "integer" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"        int?
         "min"        int?
         "box"        boolean?
         "deprecated" boolean?}))


(defmethod compile-time-shape-spec "boolean" [_]
  (strict-strs :req {"type" string?}
               :opt {"box" boolean?}))


(defmethod compile-time-shape-spec "timestamp" [_]
  (strict-strs :req {"type" string?}
               :opt {"timestampFormat" #{"iso8601"}}))


(defmethod compile-time-shape-spec "blob" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"streaming" boolean?
         "max"       int?
         "min"       int?
         "sensitive" boolean?}))


(defmethod compile-time-shape-spec "long" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"min" #(or (pos-int? %) (zero? %))
         "max" int?}))


(defmethod compile-time-shape-spec "double" [_]
  (strict-strs :req {"type" string?}
               :opt {"min" number?
                     "max" number?
                     "box" boolean?}))


(defmethod compile-time-shape-spec "list" [_]
  (strict-strs
   :req {"type"   string?
         "member" (strict-strs :req {"shape" string?}
                               :opt {"locationName" string?})}
   :opt {"max"        int?
         "min"        int?
         "deprecated" boolean?
         "flattened"  boolean?
         "sensitive"  boolean?}))


(defmethod compile-time-shape-spec "map" [_]
  (strict-strs
   :req {"type"  string?
         "key"   (strict-strs :req {"shape" string?} :opt {"locationName" string?})
         "value" (strict-strs :req {"shape" string?} :opt {"locationName" string?})}
   :opt {"sensitive"    boolean?
         "max"          int?
         "min"          int?
         "flattened"    boolean?
         "locationName" string?}))


;;@NOTE - @dupuchba : the structure aws type is always at the root of
;;a payload if present
(defmethod compile-time-shape-spec "structure" [_]
  (strict-strs
   :req {"type"    string?
         "members" (spec/map-of string? 
                                (strict-strs
                                 :req {"shape" string?}
                                 :opt {"location"                         #{"uri" "querystring" "header" "headers" "statusCode"}
                                       "locationName"                     string?
                                       "queryName"                        string?
                                       "deprecated"                       boolean?
                                       "eventpayload"                     boolean? ;; @TODO : validate what it does - rest-xml protocol / S3
                                       "idempotencyToken"                 boolean?
                                       "xmlNamespace"
                                       (strict-strs :req {"uri" string?}) ; TODO validate
                                       "xmlAttribute"                     boolean?
                                       "box"                              boolean?
                                       "jsonValue"                        boolean?
                                       "jsonvalue"                        boolean?
                                       "streaming"                        boolean?
                                       "flattened"                        boolean?}))}
   :opt {"required"     (spec/coll-of string?)
         "error"        (strict-strs
                         :req {"httpStatusCode" int?}
                         :opt {"code" string? "senderFault" boolean?})
         "exception"    boolean?
         "fault"        boolean?
         "payload"      string?
         "event"        boolean? ;; @TODO: validate what it does ! WTF !!! rest-xml protocol / s3
         "eventstream"  boolean? ;; @TODO: validate what it does ! rest-xml protocol / s3
         "deprecated"   boolean?
         "locationName" string?
         "sensitive"    boolean?
         "wrapper"      boolean?
         "xmlOrder"     (spec/coll-of string?)
         "xmlNamespace"
         (strict-strs :req {"uri" string?} ; TODO validate
                      :opt {"prefix" string?})}))


(defn assert-shape-spec
  "Assert a shape. This function is here to fail when AWS introduce new
  element into it's description api-2.json that we don't know yet"
  [[name shape :as element]]
  (spec/check-asserts true)
  (spec/assert ::shape shape)
  element)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SHAPE TYPE RUNTIME SPEC ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn runtime-spec-name
  "Returns name spec given it's ns and shape name"
  [ns name]
  (keyword ns (aws/dashed name)))


(defmulti ^:private runtime-shape-type-spec
  "Takes a shape and retuns a spec (as unevaluated code)."
  (fn [ns [name {:strs [type]}]] type))


(defmethod runtime-shape-type-spec :default [ns [name {:strs [type]} :as kv]]
  (throw (ex-info (str "runtime-shape-type-spec exception : unsupported type " type " for shape with name : " name) {:shape kv})))


(defmethod runtime-shape-type-spec "string" [ns [name {:strs [min max sensitive pattern enum]}]]
  (if enum
    `(spec/def ~(runtime-spec-name ns name) ~(into #{} (mapcat (fn [s] [[s s] [(keyword (aws/dashed s)) s]])) enum))
    `(spec/def ~(runtime-spec-name ns name)
       (spec/and string?
                 ~@(when min [`(fn [s#] (<= ~min (count s#)))])
                 ~@(when max [`(fn [s#] (< (count s#) ~max))])
                 ~@(when pattern [`(fn [s#] (re-matches ~(re-pattern pattern) s#))])))))


(defmethod runtime-shape-type-spec "integer" [ns [name {:strs [min max]}]]
  (if (or min max)
    `(spec/def ~(runtime-spec-name ns name) (spec/int-in ~(or min 'Long/MIN_VALUE) ~(or max 'Long/MAX_VALUE)))
    `(spec/def ~(runtime-spec-name ns name) int?)))


(defmethod runtime-shape-type-spec "long" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) int?))


(defmethod runtime-shape-type-spec "double" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) double?))


(defmethod runtime-shape-type-spec "boolean" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) boolean?))


;; @TODO : pattern matching
(defmethod runtime-shape-type-spec "timestamp" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) inst?))


(defmethod runtime-shape-type-spec "blob" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) bytes?))


(defmethod runtime-shape-type-spec "structure" [ns [name {:strs [members required payload deprecated error exception]}]]
  (let [spec-names (into {} (for [[k {:strs [shape]}] members]
                              ;; when key name and shape name for
                              ;; some reasons are different, we need
                              ;; prerequisites
                              [k (keyword (if (not= shape k) (str ns "." (aws/dashed name)) ns) (aws/dashed k))]))]
    `(do
       ;; we specialy create spec that reference the right spec when
       ;; key and shape name are different. Offcourse, prerequisites
       ;; are only necessary for compound types
       ~@(for [[k {:strs [shape] :as v}] members
               :when                     (not= shape k)]
           `(spec/def ~(keyword (str ns "." (aws/dashed name)) (aws/dashed k)) (spec/and ~(keyword ns (aws/dashed shape))))) ; spec/and is a hack to delay resolution
       (spec/def ~(runtime-spec-name ns name)
         (spec/keys :req-un ~(into [] (map spec-names) required)
                    :opt-un ~(into [] (comp (remove (set required)) (map spec-names)) (keys members)))))))


(defmethod runtime-shape-type-spec "list" [ns [name {{:strs [shape]} "member" :strs [min max]}]]
  `(spec/def ~(runtime-spec-name ns name)
     (spec/coll-of ~(keyword ns (aws/dashed shape)) ~@(when min `[:min-count ~min]) ~@(when max `[:max-count ~max]))))


;; @TODO : figure out what sensitive means
(defmethod runtime-shape-type-spec "map" [ns [name {:strs [key value sensitive]}]]
  `(spec/def ~(runtime-spec-name ns name)
     (spec/map-of ~(keyword ns (aws/dashed (key "shape"))) ~(keyword ns (aws/dashed (value "shape"))))))





;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃          ___           _____                  ___          _     ___         ┃
;; ┃         / __| ___ _ _ / / _ \___ __ _   ___  | _ \__ _ _ _| |_  |_  )        ┃
;; ┃         \__ \/ -_) '_/ /|   / -_) _` | |___| |  _/ _` | '_|  _|  / /         ┃
;; ┃         |___/\___|_|/_/ |_|_\___\__, |       |_| \__,_|_|  \__| /___|        ┃
;; ┃                                    |_|                                       ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                To be defined                                 ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SERIALIZATION HELPERS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn shapes-by-usage
  "Takes an api description and returns a map categoriizing shapes by their usage.
  This map has 4 keys: :inputs, :input-roots, :outputs
  and :output-roots, all mapping to collections of shapes.  Root
  shapes are shapes that appear as top-level paylods (including
  errors).  A shape may appear in several categories."
  [{:strs [shapes operations] :as api}]
  (let [shapes-seq-fn      (fn [shape]
                             (tree-seq #(and (map? %) (#{"structure" "list" "map"} (% "type")))
                                       #(case (% "type")
                                          "structure" (vals (% "members"))
                                          "list"      [(% "member")]
                                          "map"       [(% "key") (% "value")]) shape))
        shapes-refs        (into {}
                                 (x/by-key
                                  (comp (mapcat shapes-seq-fn) (keep #(get % "shape")) (x/into #{})))
                                 shapes)
        fixpoint-fn        (fn [f init]
                             (let [x (f init)]
                               (if (= x init)
                                 init
                                 (recur f x))))
        reachable-shapes   (fixpoint-fn (fn [reachable-shapes]
                                          (x/into {}
                                                  (x/for [[shape reachables] %]
                                                    [shape (into reachables (mapcat shapes-refs) reachables)])
                                                  reachable-shapes))
                                        shapes-refs)
        input-roots        (into #{} (keep #(get-in % ["input" "shape"]) (vals operations)))
        output-roots       (into #{} (for [{:strs [errors output]} (vals operations)
                                           {:strs [shape]}         (cons output errors)
                                           :when                   shape]
                                       shape))
        inputs             (into #{} (mapcat reachable-shapes) input-roots)
        outputs            (into #{} (mapcat reachable-shapes) output-roots)
        nested-shape-names (into #{} (vals shapes-refs))]
    ;; @NOTE (@dupuchba) : figure out what master @cgrand did with this culprit stuff 
                                        ; How likely it is that this assertion will break in the future?
                                        ; I (cgrand) believe this assertion was mostly useful before the req/deser/ser/resp unbundling
    (when-some [culprit (first (filter #(or (get % "location") (get % "payload")) (mapcat (comp shapes-seq-fn shapes) nested-shape-names)))]
      (throw (ex-info "Attribute payload or location found on nested shape." {:culprit culprit :api api})))
    {:inputs       inputs
     :input-roots  input-roots
     :outputs      outputs
     :output-roots output-roots}))


(defn shape-name->ser-name
  "Given a shape name, transorm it to a ser-* name."
  [shape-name]
  (->> shape-name (str "ser-") portkey.aws/dashed symbol))


(defn shape-name->req-name
  "Given a shape name, transorm it to a ser-* name."
  [shape-name]
  (->> shape-name (str "req<-") portkey.aws/dashed symbol))


;; @NOTE : Needs way more documentation /cc @dupuchbba
(defmacro defserialization
  "Helper macro that defines a private var named name with a map of {protocol {type fn}}.

  To use it, call like that :

  (QUERY REST-XML integer string [api shape-name input] (string input))"

  [name & args]
  (let [serialization-map-fns (into {}
                                    (comp (x/for [expr %
                                                  :let [[protocols types+args+fn-body]              (split-with symbol? expr)
                                                        [types args+fn-body]                        (split-with string? types+args+fn-body)
                                                        args+fn-body                                (vec args+fn-body)
                                                        [api-sym shape-name-sym input-sym :as args] (if (= 2 (count args+fn-body)) (first args+fn-body) '[api shape-name input])
                                                        fn-body                                     (peek args+fn-body)]
                                                  protocol protocols
                                                  type     types]
                                            [(clojure.string/lower-case (clojure.core/name protocol))
                                             {type `(fn [~api-sym ~shape-name-sym]
                                                      (let [serialization-function-name# (shape-name->ser-name ~shape-name-sym)
                                                            input-symbol#                '~input-sym
                                                            body#                        '~fn-body]
                                                        
                                                        ;; @NOTE : necessary because of the 'method call too large' exception
                                                        (def ^:dynamic *api-description-map* nil)
                                                        
                                                        (binding [*api-description-map* ~api-sym]
                                                          `(defn- ~serialization-function-name# [~input-symbol#]
                                                             ~(eval (list 'let
                                                                          ['~api-sym (symbol "*api-description-map*") '~shape-name-sym ~shape-name-sym input-symbol# '(symbol (name '~input-sym))]
                                                                          body#))))))}])
                                          (x/by-key (x/into {})))
                                    args)]
    `(def ^:private ~name ~serialization-map-fns)))



;;;;;;;;;;;;;;;;;;;;;;;;
;; SERIALIZATION PART ;;
;;;;;;;;;;;;;;;;;;;;;;;;

;; @NOTE - @dupuchba : all compound optionals arguments should be
;; managed here and in the generate-request-function - e.g. : locationName, deprecated, flattened & co
(defserialization aws-serialization-functions
  (QUERY REST-XML "string" "long" "integer" "boolean" "timestamp" [api shape-name input] input)

  (REST-XML "structure" [api shape-name input] (let [shape                       (get-in api ["shapes" shape-name])
                                                     required                    (get-in api ["shapes" shape-name "required"])
                                                     required-function-body-part (into {} (comp (x/for [required-name %
                                                                                                        :let [{:strs [shape locationName] :as sh} (get-in api ["shapes" shape-name "members" required-name])
                                                                                                              ser-name                            (shape-name->ser-name shape)
                                                                                                              dashed-name                         (-> required-name aws/dashed keyword)
                                                                                                              test-form#                          `(~dashed-name ~input)]]
                                                                                                  ;; @NOTE : only usefull at dev. time to check whether all params are recognized
                                                                                                  ;; @TODO - @dupuchba : deprecated not yet supported but we don't care for now
                                                                                                  ;; @TODO - @dupuchba : flattened not yet supported for structure, has to be done fast
                                                                                                  ;; @TODO - @dupuchba : xmlAttribute not yet supported for structure, has to be done fast
                                                                                                  (if (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                                                      #{"shape" "locationName" "deprecated" "flattened" "xmlAttribute"}))
                                                                                                    [(or locationName required-name) (list ser-name test-form#)]
                                                                                                    (throw (ex-info "aws-serialization-functions, field not recognized" {:sh sh
                                                                                                                                                                         :shape-name required-name})))))
                                                                                       required)
                                                     optional-function-body-part (into [] (comp (x/for [[optional-name {:strs [shape locationName] :as sh}] %
                                                                                                        :when (not (contains? (set required) optional-name))
                                                                                                        :let  [ser-name    (shape-name->ser-name shape)
                                                                                                               dashed-name (-> optional-name aws/dashed keyword)
                                                                                                               test-form#  `(~dashed-name ~input)]]
                                                                                                  (if (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                                                      #{"shape" "locationName" "deprecated" "flattened" "xmlAttribute"}))
                                                                                                    `[(contains? ~input ~dashed-name)
                                                                                                      (assoc ~(or locationName optional-name) ~(list ser-name test-form#))]
                                                                                                    (throw (ex-info "aws-serialization-functions, field not recognized" {:sh sh
                                                                                                                                                                         :shape-name optional-name})))
                                                                                                  )
                                                                                                cat)
                                                                                       (get-in api ["shapes" shape-name "members"]))]
                                                 `(cond-> ~required-function-body-part
                                                    ~@optional-function-body-part)))

  (QUERY "list" [api shape-name input] `(into {} (map-indexed (fn [idx# item#] [(str "member." (inc idx#)) item#]) ~input)))

  (REST-XML "list" [api shape-name input] (let [{{:strs [shape locationName]} "member" :as sh
                                                 flattened                    "flattened"
                                                 sensitive                    "sensitive"
                                                 deprecated                   "deprecated"} (get-in api ["shapes" shape-name])]
                                            (when (or sensitive deprecated) (throw (ex-info "Sensitive or deprecated found " {:sh sh})))
                                            `(into []
                                                   (map (fn [~'coll]
                                                          ~(list (shape-name->ser-name shape) 'coll)))
                                                   ~(if flattened
                                                      input
                                                      (list (-> shape-name aws/dashed keyword) input)))))

  (REST-XML "blob" [api shape-name input] `(aws/base64-encode ~input)) ;; @TODO : to implement blob

  (REST-XML "map" [api shape-name input] input)) ;; @TODO : to implement map


(defn generate-serialization-declare
  "Generate declare statement for input shape (other than input-roots)."
  [shape-name]
  `(declare ~(shape-name->ser-name shape-name)))


(defn generate-serialization-function
  "Given an api description file and a shape-name, find and return the
  call of it's serialization function previously defined by the macro
  defserialization."
  [{{:strs [protocol]} "metadata" :as api} shape-name]
  (let [{:strs [type] :as shape} (get-in api ["shapes" shape-name])]
    (if-let [serialization-function (get-in aws-serialization-functions [protocol type])]
      (serialization-function api shape-name)
      (throw (ex-info "There is no serialization function implementing this protocol or type." {:protocol protocol
                                                                                                :type     type})))))

;;;;;;;;;;;;;;;;;;;;;;;;
;; REQUEST GENERATION ;;
;;;;;;;;;;;;;;;;;;;;;;;;


(defn generate-request-function
  "Given an api description and a shape-name, returns a list representing
  the request function. Request function is split into HTTP configuration
  type as define by the ring request specification and calls
  serialization functions."
  [api shape-name]
  (let [required                      (get-in api ["shapes" shape-name "required"])
        request-function-input-symbol (symbol "input")
        required-function-body-part   (into {} (comp (x/for [required-name %
                                                             :let [shape                           (get-in api ["shapes" shape-name "members" required-name])
                                                                   {:strs [shape location] :as sh} shape
                                                                   ser-name                        (shape-name->ser-name shape)
                                                                   dashed-name                     (-> required-name aws/dashed keyword)
                                                                   location                        (if (nil? location)
                                                                                                     (keyword "http.request.configuration" "body")
                                                                                                     (keyword "http.request.configuration" location))]]
                                                       (if (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                           #{"shape" "location" "locationName" "streaming" "xmlNamespace"}))
                                                         ;; @NOTE : locationName is handled at runtime on params-to-body on a per protocol basis
                                                         ;; @NOTE : streaming is handled at runtime on params-to-body for the rest-xml protocol
                                                         ;; @NOTE : xmlNamespace is handled at runtime on params-to-body for the rest-xml protocol
                                                         [location (into {:http.request.field/value      `(~ser-name (~request-function-input-symbol ~dashed-name))
                                                                          :http.request.field/shape-name required-name}
                                                                         (into {}
                                                                               (map (fn [[k v]]
                                                                                      [(keyword "http.request.field" (aws/dashed k)) v]))
                                                                               (dissoc sh "shape" "location")))]
                                                         (throw (ex-info "generate-request-function, field not recognized" {:sh sh}))))
                                                     (x/by-key (x/into [])))
                                            required)
        optional-function-body-part   (into [] (comp (x/for [[optional-name {:strs [shape location] :as sh}] %
                                                             :when (not (contains? (set required) optional-name))
                                                             :let [ser-name    (shape-name->ser-name shape)
                                                                   dashed-name (-> optional-name aws/dashed keyword)
                                                                   location    (if (nil? location)
                                                                                 (keyword "http.request.configuration" "body")
                                                                                 (keyword "http.request.configuration" location))
                                                                   ;; @NOTE : keep this until I am sure payload check is not necessary
                                                                   #_(or (and (nil? location)
                                                                              (= optional-name (get-in api ["shapes" shape-name "payload"]))
                                                                              :body)
                                                                         location)]]
                                                       (if (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                           #{"shape" "location" "locationName" "streaming" "xmlNamespace"}))
                                                         `[(contains? ~request-function-input-symbol ~dashed-name)
                                                           (update-in [~location] (fnil conj []) ~(into {:http.request.field/value      (list ser-name
                                                                                                                                              (list request-function-input-symbol dashed-name))
                                                                                                         :http.request.field/shape-name optional-name}
                                                                                                        (into {}
                                                                                                              (map (fn [[k v]]
                                                                                                                     [(keyword "http.request.field" (aws/dashed k)) v]))
                                                                                                              (dissoc sh "shape" "location"))))]
                                                         (throw (ex-info "generate-request-function field not recognized" {:sh sh}))))
                                                     cat)
                                            (get-in api ["shapes" shape-name "members"]))]
    `(defn- ~(shape-name->req-name shape-name) [~request-function-input-symbol]
       (cond-> ~required-function-body-part
         ~@optional-function-body-part))))




;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃     ___                     _   _                  ___          _     ____   ┃
;; ┃    / _ \ _ __  ___ _ _ __ _| |_(_)___ _ _    ___  | _ \__ _ _ _| |_  |__ /   ┃
;; ┃   | (_) | '_ \/ -_) '_/ _` |  _| / _ \ ' \  |___| |  _/ _` | '_|  _|  |_ \   ┃
;; ┃    \___/| .__/\___|_| \__,_|\__|_\___/_||_|       |_| \__,_|_|  \__| |___/   ┃
;; ┃         |_|                                                                  ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                To be defined                                 ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

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


(defn mime-type
  "Retourne the request mime type given it's protocol."
  [protocol]
  (case protocol
    "rest-xml" {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}))


(defn generate-operation-function
  "This function generates the final defn that the user is going to use.
  The request has been made to build a map representing the http
  request configuration needed to make the request at runtime.

  It calls the req<-* function which is then merged with other http
  request informations from the operation shape."

  ;; @TODO : add the unused informations to the request map => e.g. : xmlNamespace / locationName / documentationUrl / alias / authtype / deprecated
  [api ns [n {{:strs [method requestUri responseCode]} "http"
              {input-shape-name "shape"}               "input"
              {output-shape-name "shape"}              "output"
              :strs                                    [name errors]
              :as                                      operation}]]
  (spec/check-asserts true)
  (spec/assert ::operation operation)
  (let [varname                     (symbol (aws/dashed name))
        input-spec                  (some->> input-shape-name aws/dashed (keyword ns))
        output-spec                 (some->> output-shape-name aws/dashed (keyword ns))
        operation-input             (or (some-> input-shape-name (str "-input") aws/dashed symbol) '_)
        operation-default-arguments (if input-spec (some #(when (spec/valid? input-spec %) %) [[] {}]) {})
        error-specs                 (into {}
                                          (map (fn [{:strs [shape] {:strs [httpStatusCode]} "error"}]
                                                 [shape (keyword ns (aws/dashed shape))]))
                                          errors)
        protocol                    (get-in api ["metadata" "protocol"])
        service-id                  (get-in api ["metadata" "serviceId"])]
    `(do
       (defn ~varname
         ~@(when operation-default-arguments `[([] ~(list varname operation-default-arguments))])
         ([~operation-input]
          (let [request-function-result# ~(if input-shape-name (list (shape-name->req-name input-shape-name) operation-input) {})]
            ;; @TODO : call-to-be-implemented-function needs to be implemented
            (aws/-call-http
             (into request-function-result#
                   {:http.request.configuration/method        ~(-> method str/lower-case keyword)
                    :http.request.configuration/request-uri   ~requestUri
                    :http.request.configuration/response-code ~responseCode
                    :http.request.configuration/endpoints     ~(symbol ns "endpoints")
                    :http.request.configuration/mime-type     ~(mime-type protocol)
                    :http.request.configuration/protocol      ~protocol
                    :http.request.configuration/service-id    ~service-id
                    :http.request.spec/input-spec             ~input-spec
                    :http.request.spec/output-spec            ~output-spec
                    :http.request.spec/error-spec             ~error-specs})))))

       (spec/fdef ~varname
         :args ~(if input-spec
                  `(~(if operation-default-arguments `spec/? `spec/tuple) ~input-spec)
                  `empty?)
         :ret ~(if output-spec `(spec/and ~output-spec) `true?)))))




;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃       _   ___ ___    ___ ___ _  _ ___ ___    _ _____ ___ ___  _  _           ┃
;; ┃      /_\ | _ \_ _|  / __| __| \| | __| _ \  /_\_   _|_ _/ _ \| \| |  ___     ┃
;; ┃     / _ \|  _/| |  | (_ | _|| .` | _||   / / _ \| |  | | (_) | .` | |___|    ┃
;; ┃    /_/ \_\_| |___|  \___|___|_|\_|___|_|_\/_/ \_\_| |___\___/|_|\_|          ┃
;; ┃                                                                              ┃
;; ┃                           ___  _   ___ _____   _ _                           ┃
;; ┃                          | _ \/_\ | _ \_   _| | | |                          ┃
;; ┃                          |  _/ _ \|   / | |   |_  _|                         ┃
;; ┃                          |_|/_/ \_\_|_\ |_|     |_|                          ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; GENERATE API CLJ FILES ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn generate-api-forms
  "This is the root function where you can generate all forms that an
  sdk is going to need namespaced by ns-sym.

  It gather specs + serialization + declares + request + operation
  functions."
  [ns-sym {:strs [operations] :as api}]
  (case (get-in api ["metadata" "protocol"])
    "rest-xml" (let [inputs+inputs-root            (shapes-by-usage api)
                     serialization+request-defns   (for [[k gen]          {:inputs      [generate-serialization-declare
                                                                                         (partial generate-serialization-function api)]
                                                                           :input-roots [(partial generate-request-function api)]}
                                                         gen              gen
                                                         input-shape-name (inputs+inputs-root k)]
                                                     (gen input-shape-name))
                     runtime-specs+operation-defns (for [[k gen] {"shapes"     (comp #(doto % eval) (partial runtime-shape-type-spec (name ns-sym)) assert-shape-spec)
                                                                  ;; @NOTE : eval to make specs available right away
                                                                  "operations" (partial generate-operation-function api (name ns-sym))}
                                                         desc    (api k)]
                                                     (gen desc))]
                 (concat serialization+request-defns
                         runtime-specs+operation-defns))
    (do
      (binding [*out* *err*] (prn 'skipping ns-sym 'protocol (get-in api ["metadata" "protocol"])))
      [(list 'comment 'TODO 'support (get-in api ["metadata" "protocol"]))])))


(defn parse-endpoints! [src]
  (let [endpoints (with-open [r (io/reader src)] (json/parse-stream r))]
    (reduce (fn [m [p v]] (assoc-in m p v)) {}
            (for [{:as   partition
                   :strs [defaults services regions dnsSuffix]}                        (endpoints "partitions")
                  :let                                                                 [regions (set (keys regions))]
                  [service {defaults' "defaults" :strs [endpoints partitionEndpoint]}] services
                  :let                                                                 [defaults (into defaults defaults')]
                  region                                                               (into regions (keys endpoints))
                  :let                                                                 [desc (or (endpoints region) (endpoints partitionEndpoint))]
                  :when                                                                desc
                  :let                                                                 [{:strs [hostname sslCommonName protocols credentialScope signatureVersions]} (into defaults desc)
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
                                 :ssl-common-name  sslCommonName :endpoint endpoint :signature-version signature-version}]))))


(defn generate-files!
  "This function generates all the sdk files (clj) from the api-2.json
  files.

  It's the entry-point of the generation part."
  [& {:keys [verbose api-name protocol]
      :or   {verbose false api-name nil protocol nil}}]
  (let [endpoints    (parse-endpoints! "api-resources/aws-sdk-ruby/gems/aws-partitions/partitions.json")
        entries      (into []
                           (comp
                            (x/for [^java.io.File f %
                                    :when (-> f .getName (.endsWith "api-2.json"))]
                              [(-> f .getParentFile .getParentFile .getName)
                               [(-> f .getParentFile .getName) (.getPath f)]])
                            (x/by-key (x/into (sorted-map)))
                            (x/sort))
                           (file-seq (java.io.File. "api-resources/aws-sdk-ruby/apis/")))
        gen-results  (for [[api versions]     entries
                           :let               [apifile (str/replace api #"[-.]" "_")
                                               apins (str/replace api #"[.]" "-")
                                               [latest f] (first (rseq versions))]
                           :when              (or (nil? api-name) (= apins api-name))
                           [version api-json] (cons [nil f] versions)
                           :when              (or (nil? protocol) (= protocol (get-in (with-open [r (io/reader api-json)] (json/parse-stream r)) ["metadata" "protocol"])))
                           :let               [[file ns] (if version
                                                           [(java.io.File. (str "src/portkey/aws/" apifile "/_" version ".clj"))
                                                            (symbol (str "portkey.aws." apins ".-" version))]
                                                           [(java.io.File. (str "src/portkey/aws/" apifile ".clj"))
                                                            (symbol (str "portkey.aws." apins))])]]
                       (try
                         (prn 'generating api (or version 'LATEST))
                         (with-open [w         (io/writer (doto file (-> .getParentFile .mkdirs)))
                                     ;; @TODO : rework on documentation
                                     ;;docs-json (-> api-json io/file .getParentFile (io/file "docs-2.json") java.io.FileInputStream.)
                                     ]
                           (let [api-json' (json/parse-stream (io/reader (java.io.FileInputStream. api-json)))]
                             (binding [*out* w]
                               (prn (list 'ns ns '(:require [portkey.aws])))
                               (newline)
                               (clojure.pprint/pprint (list 'def 'endpoints (list 'quote (get endpoints apins))))
                               ;; @TODO : rework on documentation.
                               (doseq [form (generate-api-forms ns api-json' #_docs-json)]
                                 (newline)
                                 (if (and (seq? form) (= 'do (first form)))
                                   (run! prn (next form))
                                   (prn form))))))
                         {:gen-status :ok}
                         (catch Throwable t
                           (println "Failed to generate" api (.getMessage t))
                           #_(when verbose (println t))
                           (println t)
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


(comment

  
  (use 'clojure.repl)
  (require '[portkey.helpers :as helpers])
  (helpers/def-api-2-json "rest-xml")
  
  ;; @TODO : spec http.request.configuration
  ;; @TODO : make the call-functions


  ;; go to aws call après
   

  
  (generate-files! :api-name "s3")
  (get-in rest-xml-protocol-s3-api-2-json ["operations" "ListBuckets"])
  
  
                                        ; @TODO : locatioName on root with the object
                                        ; SelectObjectContentRequest, don't know what to do with this one

  (get-in rest-xml-protocol-s3-api-2-json ["shapes" "SelectObjectContentRequest"])

  (require '[portkey.aws.s3 :as s3])




  
  )




