(ns portkey.helpers
  (:require [cheshire.core :as json]
            [clojure.java.io :as io]
            [net.cgrand.xforms :as x]))


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

  (require '[portkey.awsgen :as gen])
  (require '[portkey.aws :as aws])
  
  (def-api-2-json "rest-xml")

  rest-xml-protocol-s3-api-2-json

  (gen/shapes-by-usage rest-xml-protocol-s3-api-2-json)

  (let [{:strs [shapes operations] :as api}                  rest-xml-protocol-s3-api-2-json
        {{:strs [method requestUri responseCode]} "http"
         {input-shape-name "shape"
          xmlNamespace     "xmlNamespace"
          locationName     "locationName"}        "input"
         {output-shape-name "shape"}              "output"
         :strs                                    [name errors]
         :as                                      operation} (get-in api ["operations" "DeleteBucket"])]
    
    (let [shapes-seq-fn                    (fn [shape]
                                             (tree-seq #(and (map? %) (#{"structure" "list" "map"} (% "type")))
                                                       #(case (% "type")
                                                          "structure" (vals (% "members"))
                                                          "list"      [(% "member")]
                                                          "map"       [(% "key") (% "value")]) shape))
          shapes-refs                      (into {}
                                                 (x/by-key
                                                  (comp (mapcat shapes-seq-fn) (keep #(get % "shape")) (x/into #{})))
                                                 shapes)
          fixpoint-fn                      (fn [f init]
                                             (let [x (f init)]
                                               (if (= x init)
                                                 init
                                                 (recur f x))))
          reachable-shapes                 (fixpoint-fn (fn [reachable-shapes]
                                                          (x/into {}
                                                                  (x/for [[shape reachables] %]
                                                                    [shape (into reachables (mapcat shapes-refs) reachables)])
                                                                  reachable-shapes))
                                                        shapes-refs)
          inputs                           (into #{} (mapcat reachable-shapes) (vector input-shape-name))
          input-roots                      (into #{} (keep #(get-in % ["input" "shape"]) (vals operations)))
          inputs-fn                        #(into #{} (mapcat reachable-shapes) (vector %))
          input-root-name->request-name-fn #(->> %
                                                 (get (into {}
                                                            (mapcat (fn [ir]
                                                                      (for [[n  {{shape "shape"} "input" :as op}] operations
                                                                            :when                                 (= shape ir)]
                                                                        [ir n])))
                                                            input-roots))
                                                 aws/dashed
                                                 symbol)
          kk-fn                            (fn [type' look-for]
                                             (into {} (comp (filter (fn [[n {look-for-sym look-for
                                                                             type'' "type"}]] (when (= type'' type') look-for-sym)))
                                                            (mapcat (fn [[n o :as kk]]
                                                                      (for [input-root input-roots
                                                                            :when      (contains? (inputs-fn input-root) n)]
                                                                        [look-for (input-root-name->request-name-fn input-root)])))
                                                            (x/by-key (x/into #{})))
                                                   (api "shapes")))]
      (into {} (comp (x/for [a %
                             t #{"map" "structure" "list" "double" "long" "blob" "timestamp" "boolean" "integer" "string"}
                             :let [res (kk-fn t a)]
                             :when (not (empty? res))]
                       [t res])
                     (x/by-key (x/into {})))
            #{"enum" "min" "max"
              "pattern" "sensitive"
              "box" "deprecated"
              "timestampFormat" "streaming"
              "flattened" "key" "value"
              "locationName" "required" "error"
              "exception" "fault" "payload"
              "event" "eventstream" "wrapper"
              "xmlOrder" "xmlNamespace"})))

  

)











(comment

  (defn bwt [^String s]
    (let [n (count s) 
          cmp
          (fn [i j]
            (if (= i j)
              0
              (loop [i (int i) j (int j)]
                (cond
                  (= j n) 1
                  (= i n) -1
                  :else
                  (let [d (- (int (.charAt s i)) (int (.charAt s j)))]
                    (if (zero? d)
                      (recur (inc i) (inc j))
                      d))))))
          suffix-array (sort cmp (range (inc n)))]
      (apply str
             (map (fn [i]
                    (let [i (dec i)]
                      (if (neg? i) \$ (.charAt s i))))
                  suffix-array))))

  (bwt "Baptistedupuch est un gros naze")


  



  )



(comment

  (use 'clojure.repl)
  (require '[portkey.aws.s3 :as s3 :refer :all])
  (require '[clojure.spec.alpha :as spec])
  (require '[clojure.data.xml :as xml])
  

  (source s3/create-bucket)
  (dir xml)
  (xml/emit-str (xml/element :a {:b :c} "a"))

  (spec/describe :portkey.aws.s3/create-bucket-request)

  ;; 2018-10-24 16:22:05,549 - MainThread - botocore.endpoint - DEBUG - Making request for OperationModel(name=CreateBucket) (verify_ssl=True) with params: {'body': '<CreateBucketConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/"><LocationConstraint>eu-west-1</LocationConstraint></CreateBucketConfiguration>', 'url': u'https://s3.eu-west-1.amazonaws.com/sdfdsfojojjsfdt', 'headers': {'User-Agent': 'aws-cli/1.15.45 Python/2.7.14 Darwin/16.7.0 botocore/1.10.45'}, 'context': {'auth_type': None, 'client_region': 'eu-west-1', 'signing': {'bucket': u'sdfdsfojojjsfdt'}, 'has_streaming_input': False, 'client_config': <botocore.config.Config object at 0x10bc81850>}, 'query_string': {}, 'url_path': u'/sdfdsfojojjsfdt', 'method': u'PUT'}

  ;; bucket : "bucket-name"
  ;; :create-bucket-configuration {:location-constraint "eu-west1"}

  (get-in rest-xml-protocol-s3-api-2-json ["shapes" "CreateBucketConfiguration"])
  (get-in rest-xml-protocol-s3-api-2-json ["shapes" "CreateBucketRequest"])

  (s3/create-bucket {:bucket                      "baptistedupuchisawesomeyeahh5"
                     :create-bucket-configuration {:location-constraint "eu-west-1"
                                                   :caca                "pipi"}})

  (sc.api/letsc 1
                (dissoc  req :http.request.configuration/endpoints))

  
  )
