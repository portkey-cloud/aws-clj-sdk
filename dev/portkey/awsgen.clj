(ns portkey.awsgen
  (:require [cheshire.core :as json]

            [clojure.java.io :as io]
            [clojure.spec.alpha :as spec]

            [net.cgrand.xforms :as x]

            [portkey.aws :as aws]))

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


(defmulti shape-type-compile-time-spec #(get % "type"))


(spec/def ::shape (spec/multi-spec shape-type-compile-time-spec #(assoc %1 "type" %2)))


(defmethod shape-type-compile-time-spec "string" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"       int?
         "min"       int?
         "pattern"   string?
         "enum"      (spec/coll-of string?)
         "sensitive" boolean?}))


(defmethod shape-type-compile-time-spec "integer" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"        int?
         "min"        int?
         "box"        boolean?
         "deprecated" boolean?}))


(defmethod shape-type-compile-time-spec "boolean" [_]
  (strict-strs :req {"type" string?}
               :opt {"box" boolean?}))


(defmethod shape-type-compile-time-spec "timestamp" [_]
  (strict-strs :req {"type" string?}
               :opt {"timestampFormat" #{"iso8601"}}))


(defmethod shape-type-compile-time-spec "blob" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"streaming" boolean?
         "max"       int?
         "min"       int?
         "sensitive" boolean?}))


(defmethod shape-type-compile-time-spec "long" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"min" #(or (pos-int? %) (zero? %))
         "max" int?}))


(defmethod shape-type-compile-time-spec "double" [_]
  (strict-strs :req {"type" string?}
               :opt {"min" number?
                     "max" number?
                     "box" boolean?}))


(defmethod shape-type-compile-time-spec "list" [_]
  (strict-strs
   :req {"type"   string?
         "member" (strict-strs :req {"shape" string?}
                               :opt {"locationName" string?})}
   :opt {"max"        int?
         "min"        int?
         "deprecated" boolean?
         "flattened"  boolean?
         "sensitive"  boolean?}))


(defmethod shape-type-compile-time-spec "map" [_]
  (strict-strs
   :req {"type"  string?
         "key"   (strict-strs :req {"shape" string?} :opt {"locationName" string?})
         "value" (strict-strs :req {"shape" string?} :opt {"locationName" string?})}
   :opt {"sensitive"    boolean?
         "max"          int?
         "min"          int?
         "flattened"    boolean?
         "locationName" string?}))


(defmethod shape-type-compile-time-spec "structure" [_]
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


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SHAPE TYPE RUNTIME SPEC ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn spec-name
  "Returns name spec given it's ns and shape name"
  [ns name]
  (keyword ns (aws/dashed name)))


(defmulti ^:private shape-type-runtime-spec
  "Takes a shape and retuns a spec (as unevaluated code)."
  (fn [ns [name {:strs [type]}]] type))


(defmethod shape-type-runtime-spec :default [ns [name {:strs [type]} :as kv]]
  (throw (ex-info (str "shape-type-runtime-spec exception : unsupported type " type " for shape with name : " name) {:shape kv})))


(defmethod shape-type-runtime-spec "string" [ns [name {:strs [min max sensitive pattern enum]}]]
  (if enum
    `(spec/def ~(spec-name ns name) ~(into {} (mapcat (fn [s] [[s s] [(keyword (aws/dashed s)) s]])) enum))
    `(spec/def ~(spec-name ns name)
       (spec/and string?
                 ~@(when min [`(fn [s#] (<= ~min (count s#)))])
                 ~@(when max [`(fn [s#] (< (count s#) ~max))])
                 ~@(when pattern [`(fn [s#] (re-matches ~(re-pattern pattern) s#))])))))


(defmethod shape-type-runtime-spec "integer" [ns [name {:strs [min max]}]]
  (if (or min max)
    `(spec/def ~(spec-name ns name) (spec/int-in ~(or min 'Long/MIN_VALUE) ~(or max 'Long/MAX_VALUE)))
    `(spec/def ~(spec-name ns name) int?)))


(defmethod shape-type-runtime-spec "long" [ns [name _]]
  `(spec/def ~(spec-name ns name) int?))


(defmethod shape-type-runtime-spec "double" [ns [name _]]
  `(spec/def ~(spec-name ns name) double?))


(defmethod shape-type-runtime-spec "boolean" [ns [name _]]
  `(spec/def ~(spec-name ns name) boolean?))


;; @TODO : pattern matching
(defmethod shape-type-runtime-spec "timestamp" [ns [name _]]
  `(spec/def ~(spec-name ns name) inst?))


(defmethod shape-type-runtime-spec "structure" [ns [name {:strs [members required payload deprecated error exception]}]]
  (let [spec-names (into {} (for [[k {:strs [shape]}] members]
                              ;; when key name and shape name for
                              ;; some reasons are different, we need
                              ;; prerequisites
                              [k (keyword (if (not= shape k) (str ns "." (aws/dashed name)) ns) k)]))]
    `(do
       ;; we specialy create spec that reference the right spec when
       ;; key and shape name are different. Offcourse, prerequisites
       ;; are only necessary for compound types
       ~@(for [[k {:strs [shape] :as v}] members
               :when                     (not= shape k)]
           `(spec/def ~(keyword (str ns "." (aws/dashed name)) (aws/dashed k)) (spec/and ~(keyword ns (aws/dashed shape))))) ; spec/and is a hack to delay resolution
       (spec/def ~(spec-name ns name)
         (spec/keys :req-un ~(into [] (map spec-names) required)
                    :opt-un ~(into [] (comp (remove (set required)) (map spec-names)) (keys members)))))))


(defmethod shape-type-runtime-spec "list" [ns [name {{:strs [shape]} "member" :strs [min max]}]]
  `(spec/def ~(spec-name ns name)
     (spec/coll-of ~(keyword ns (aws/dashed shape)) ~@(when min `[:min-count ~min]) ~@(when max `[:max-count ~max]))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; IMPORTANT - UNCATEGORIZED FUNCTIONS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn assert-shape-spec
  "Assert a shape. This function is here to fail when AWS introduce new
  element into it's description api-2.json that we don't know yet"
  [[name shape :as element]]
  (spec/check-asserts true)
  (spec/assert ::shape shape)
  element)


;; @TODO : to be renames
(defn aaa
  [ns [name shape :as e]]
  (let [form (shape-type-runtime-spec ns e)]
    form))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; API DESCRIPTION VARS - DEV HELPER ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defmacro def-api-2-json
  "Define a private variable reading the latest api-description file of a
  given protocol."
  [protocol]
  (let [entries               (into []
                                    (comp
                                     (x/for [^java.io.File f %
                                             :when (-> f .getName (.endsWith "api-2.json"))]
                                       [(-> f .getParentFile .getParentFile .getName)
                                        [(-> f .getParentFile .getName) (.getPath f)]])
                                     (x/by-key (x/into (sorted-map)))
                                     (x/sort))
                                    (file-seq (io/as-file "api-resources/aws-sdk-ruby/apis/")))
        api-2-description-def (for [[api versions] entries
                                    :let           [[latest file-path] (first (rseq versions))]
                                    :when          (= protocol (get-in (-> (slurp file-path) json/parse-string) ["metadata" "protocol"]))]
                                `(def ^:private ~(symbol (str protocol "-protocol-" api "-api-2-json"))
                                   (-> (slurp ~file-path) json/parse-string)))]
    (cons 'do api-2-description-def)))



(comment


  (use 'clojure.repl)


  (let [api rest-xml-protocol-route53-api-2-json]
    
    (for [[k gen] {"shapes"     (comp (partial aaa (name "monnamespece")) assert-shape-spec) ; eval to make specs available right away
                   "operations" (fn [& args])}
          desc    (api k)]
      (gen desc)))


    
  )




