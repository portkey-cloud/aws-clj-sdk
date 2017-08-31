(ns portkey.aws.internal.spec
  (:require [clojure.spec.alpha :as spec]
    [cheshire.core :as json]
    [clojure.java.io :as io]))

(spec/def ::TODO #{})

(defn keep-keys [f]
  #(into {} (keep (fn [[k v]] (when-some [k (f k)] [k v]))) %))

(defn dashed [^String s]
  (-> s (.replaceAll "(?<=[a-z0-9])(?=[A-Z]([a-z]|$))|_" "-") .toLowerCase))

(defn- dash-keys [e]
  (cond
    (vector? e)
    (into [] (map dash-keys) e)
    (sequential? e)
    (map dash-keys e)
    (keyword? e)
    (keyword (namespace e) (dashed (name e)))
    :else e))

(defmacro json-keys [& {:keys [req-un opt-un]}]
  (let [to-string (into {} (comp (mapcat flatten) (map (fn [k] [(keyword (dashed (name k))) (name k)]))) [req-un opt-un])
        to-keys (into {} (map (fn [[k v]] [v k])) to-string)]
    `(spec/and
       (spec/keys :req-un ~(dash-keys req-un) :opt-un ~(dash-keys opt-un))
       (spec/conformer (keep-keys ~to-string) (keep-keys ~to-keys)))))

(defmulti ^:private shape-to-spec (fn [ns [name {:strs [type]}]] type))

(defn- shape-spec [ns [name shape :as e]]
  (let [form (shape-to-spec ns e)]
    (if (and (seq? form) (= 'do (first form)))
      `(~@(butlast form) ; includes do
         (spec/def ~(keyword ns (dashed name)) ~(last form)))
      `(spec/def ~(keyword ns (dashed name)) ~form))))

(defmacro defapi [reource-name]
  (let [api (json/parse-stream (-> reource-name io/resource io/reader))
        ns (name (ns-name *ns*))]
    `(do
       ~@(for [shape (api "shapes")]
           (shape-spec ns shape)))))

(defmethod shape-to-spec :default [ns [name _ :as kv]]
  (throw (ex-info (str "unsupported shape " name) {:shape kv})))

(defmethod shape-to-spec "structure" [ns [name {:strs [members required payload deprecated error exception]}]]
  (let [spec-names 
        (into {} (for [[k {:strs [shape] :as v}] members]
                   [k (keyword (if (not= shape k) (str ns "." (dashed name)) ns) k)]))]
    `(do
       ~@(for [[k {:strs [shape] :as v}] members
               :when (not= shape k)]
           `(spec/def ~(keyword (str ns "." (dashed name)) (dashed k)) (spec/and ~(keyword ns (dashed shape))))) ; spec/and is a hack to delay resolution
       (json-keys :req-un ~(into [] (map spec-names) required)
         :opt-un ~(into []  (comp (remove (set required)) (map spec-names))
                    (keys members))))))

(defmethod shape-to-spec "list" [ns [name {{:strs [shape]} "member" :strs [max]}]]
  `(spec/coll-of ~(keyword ns (dashed shape)) :max-count ~max))

(defmethod shape-to-spec "boolean" [ns [name _]] `boolean?)

(defmethod shape-to-spec "map" [ns [name {:strs [key value sensitive]}]]
  `(spec/map-of ~(keyword ns (dashed (key "shape"))) ~(keyword ns (dashed (value "shape")))))

(defmethod shape-to-spec "string" [ns [name {:strs [min max sensitive pattern enum]}]] 
  (if enum
    `(spec/conformer
       (let [m# ~(into {} (mapcat (fn [s] [[s s] [(keyword (dashed s)) s]])) enum)]
         (fn [s#] (m# s# ::spec/invalid)))
       (comp keyword dashed))
    `(spec/and string?
       ~@(when min [`(fn [s#] (<= ~min (count s#)))])
       ~@(when max [`(fn [s#] (< (count s#) ~max))])
       ~@(when pattern [`(fn [s#] (re-matches ~(re-pattern pattern) s#))]))))

; Java 8
(defn base64-encode [bytes] (.encodeToString (java.util.Base64/getEncoder) bytes))
(defn base64-decode [^String s] (.decode (java.util.Base64/getDecoder) s))

(defmethod shape-to-spec "blob" [ns [name {:strs [streaming sensitive]}]]
  (spec/and bytes? (spec/conformer base64-encode base64-decode)))

(defmethod shape-to-spec "long" [ns _] `int?)

(defmethod shape-to-spec "integer" [ns [name {:strs [min max]}]]
  `(spec/and int? ~@(when min [`#(<= ~min %)]) ~@(when max [`#(<= % ~max)])))

(defmethod shape-to-spec "timestamp" [ns _] `inst?)

(defmethod shape-to-spec "double" [ns _] `double?)

