(ns portkey.helpers
  (:require [cheshire.core :as json]
            [clojure.java.io :as io]
            [clojure.string :as str]
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
                                    :let           [api                (str/replace api #"[.]" "-")
                                                    [latest file-path] (first (rseq versions))]
                                    :when          (= protocol (get-in (-> (slurp file-path) json/parse-string) ["metadata" "protocol"]))]
                                `(def ^:private ~(symbol (str protocol "-protocol-" api "-api-2-json"))
                                   (-> (slurp ~file-path) json/parse-string)))]
    (cons 'do api-2-description-def)))


(comment

  (require '[portkey.awsgen :as gen])
  (require '[portkey.aws :as aws])
  (def-api-2-json "query")



  (let [{:strs [shapes operations] :as api}                  query-protocol-iam-api-2-json
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
  (require '[portkey.aws.s3 :as s3 :refer :all]) ;; load all to handle spec/describe & co while working
  (require '[clojure.spec.alpha :as spec])
  (def-api-2-json "ec2")

  (dir s3)

  
  (s3/list-buckets) ;; working get

  
  
  (s3/list-objects {:bucket "testbucketforawsclj34"})

  (s3/create-bucket {:bucket                      "testbucketforawsclj346223"
                     :create-bucket-configuration {:location-constraint "eu-west-1"}})

  ()

  ;; created a bucket

    
  "testbucketforawsclj"

  (s3/put-object {:bucket        "testbucketforawsclj346223"
                  :key           "myobjkey2"
                  :body          (let [f   (io/file "src/portkey/aws.clj")
                                       ary (byte-array (.length f))
                                       is  (java.io.FileInputStream. f)]
                                   (.read is ary)
                                   (.close is)
                                   ary)
                  :metadata      {"a" "b" "baptiste" "dupuch"}
                  :storage-class "ONEZONE_IA"})


  
  (s3/put-object-tagging {:bucket        "testbucketforawsclj34622"
                          :key           "myobjkey2"
                          :tagging
                          {:tag-set
                           [{:key "i", :value "1"}
                            {:key "a", :value "2"}
                            {:key "e", :value "3"}
                            
                            {:key "Y", :value ""}]},}) ;; => automaticaly set the content-md5 header

  
  (s3/get-object-acl {:bucket "testbucketforawsclj346"
                      :key    "myobjkey"})  
  
  (s3/put-bucket-cors {:bucket "testbucketforawsclj346",
                       ;;:contentmd5 "FRSAvvoSmLCNUwBvmSUDRw=="
                       :corsconfiguration
                       {:corsrules
                        [{:allowed-methods
                          ["POST" "GET"]
                          :allowed-origins ["http://google.f"]}]},})


  ;; 2dffe649db8c484ba0c1ba118f090cacc78c0cd90a05515723be21038964cb42

  (s3/put-object-acl {:bucket                "testbucketforawsclj346"
                      :key                   "myobjkey"
                      ;;:acl                   "private"
                      :access-control-policy {:grants
                                              [{:grantee    {:type         "CanonicalUser",
                                                             :display-name "baptiste.dupuche"
                                                             :id           "2dffe649db8c484ba0c1ba118f090cacc78c0cd90a05515723be21038964cb42"},
                                                :permission :full-control}]
                                              :owner {:id "2dffe649db8c484ba0c1ba118f090cacc78c0cd90a05515723be21038964cb42"}}})

  (s3/put-object-acl {:bucket                "testbucketforawsclj346"
                      :key                   "myobjkey"
                      :access-control-policy {:grants
                                              [{:grantee    {:type "CanonicalUser", :email-address "baptiste.dupuch@gmail.com", :display-name "Baptiste Le Boss"},
                                                :permission "FULL_CONTROL"}]
                                              :owner {:id "2dffe649db8c484ba0c1ba118f090cacc78c0cd90a05515723be21038964cb42"}}})




  
  )



(comment

  (require '[portkey.aws.ec2 :as ec2])
  (require '[clojure.spec.alpha :as spec])
  (use 'clojure.repl)

  (get-in ec2-protocol-ec2-api-2-json ["shapes" "Filter"])

  ;; si pas flatten alors ne pas utilisr le location-name

  (dir ec2)
  
  
  (ec2/describe-instances {:instance-ids ["i-016d3bd595243ab32"]
                           :filters
                           [{:values ["i386" "x86_64"], :name "architecture"}
                            {:values ["t2.nano" "t2.micro"], :name "instance-type"}]})

  (ec2/describe-availability-zones
   {:filters
    [{:name "state", :values ["available"]}
     {:name "region-name", :values ["us-east-1"]}]
    #_#_:zone-names ["eu-west-1a" "eu-west-1b"]})


  
  (ec2/create-tags {:resources ["i-016d3bd595243ab32"],
                    :tags
                    [{:key "Helen", :value "Marie-Amiot"}]})
  



  
  )

(comment

  (require '[portkey.aws.sqs :as sqs :refer :all])
  (require '[clojure.spec.alpha :as spec])
  (use 'clojure.repl)

  (dir sqs)

  

  (sqs/untag-queue {:queue-url "http://google.fr"
                    :tag-keys [ "R" "" ""]})

  (sqs/send-message {:queue-url "http://google.fr",
                     :message-body "body",
                     :message-attributes {"KeyNameCACA" {:data-type "String"
                                                         :string-value "StringValueCACA"
                                                         :string-list-values ["A" "B" "C"]}},
                     :delay-seconds 0,})

  )



(comment


  (require '[portkey.aws.monitoring :as cl :refer :all])
  (require '[clojure.spec.alpha :as spec])
  (use 'clojure.repl)



  (dir cl)
  

  (cl/list-metrics {:metric-name "312",
                    :namespace "r",
                    :dimensions
                    [{:name "aa", :value "11"}
                     {:name "bb", :value "22"}],
                    :next-token "S4"})


  )

(comment


  (require '[portkey.aws.elasticloadbalancingv2 :as el :refer :all])
  (require '[clojure.spec.alpha :as spec])
  (use 'clojure.repl)



  (dir el)

    
  (el/create-listener {:load-balancer-arn "",
                       :protocol          :https,
                       :port              2,
                       :default-actions
                       [{:type :authenticateoidc,
                         :authenticate-cognito-config
                         {:user-pool-arn       "",
                          :user-pool-client-id "",
                          :user-pool-domain    "",
                          :session-cookie-name ""
                          :authentication-request-extra-params  {"keyname1" "valuename1"
                                                                 "keyname2" "valuename2"}}}],
                       :ssl-policy        "",
                       :certificates      [{} {} {:certificate-arn ""} {}]})


  )
