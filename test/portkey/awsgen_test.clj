  (ns portkey.awsgen-test
  (:require [clojure.test :refer :all]
            [portkey.awsgen :as gen]
            [clojure.spec.alpha :as spec]
            [cheshire.core :as json]
            [clojure.java.io :as io]))

(deftest strict-api-description-validation
  (testing "Ensuring that no new attribute appears in AWS shapes descriptions."
    (doseq [^java.io.File f (file-seq (java.io.File. "resources/aws-sdk-core/apis/"))
            :when (= "api-2.json" (.getName f))
            shape (with-open [i (io/reader f)]
                    (vals (get (json/parse-stream i) "shapes")))]
      (is (spec/valid? ::gen/shape shape))))
  (testing "Ensuring that no new attribute appears in AWS operations descriptions."
    (doseq [^java.io.File f (file-seq (java.io.File. "resources/aws-sdk-core/apis/"))
            :when (= "api-2.json" (.getName f))
            op (with-open [i (io/reader f)]
                 (vals (get (json/parse-stream i) "operations")))]
      (is (spec/valid? ::gen/operation op)))))
