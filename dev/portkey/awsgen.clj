(ns portkey.awsgen
  (:require [clojure.java.io :as io]
            [net.cgrand.xforms :as x]
            [cheshire.core :as json]
            [clojure.spec.alpha :as spec]))

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


;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SHAPES SPEC VALIDATION ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;


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


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; IMPORTANT - UNCATEGORIZED FUNCTIONS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn gen-shape-spec [ns [name shape]]
  (spec/check-asserts true)
  (spec/assert ::shape shape))


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
  (dir json)

  (let [api rest-xml-protocol-route53-api-2-json]
    
    (for [[k gen] {"shapes"     (comp #(doto % eval) gen-shape-spec) ; eval to make specs available right away
                   "operations" (fn [& args])}
          desc    (api k)]
      (gen (name "monnamespece") desc)))
    
  )




