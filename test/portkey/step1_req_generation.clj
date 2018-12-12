(ns portkey.step1-req-generation
  (:require [cheshire.core :as json]
            [clojure.java.io :as io]
            [clojure.test :refer :all]
            [net.cgrand.xforms :as x]
            [portkey.aws :as aws]
            [portkey.awsgen :as gen :refer :all]))


(defmacro deftest-aws-ser [name {:keys [description-schema shape-to-test apply-on-protocols inputs expected-result]}]  
  `(deftest ~name
     (doseq [protocol# ~apply-on-protocols
             input#    ~inputs
             :let      [description-schema# (assoc-in ~description-schema ["metadata" "protocol"] protocol#)
                        _#                  (doseq [shape# (keys (description-schema# "shapes"))]
                                              (eval (gen/generate-serialization-declare shape#)))
                        ser-fns#            (into {}
                                                  (map (fn [[sh#]]
                                                         [sh# (eval (gen/generate-serialization-function description-schema# sh#))]))
                                                  (get description-schema# "shapes"))
                        serialization-fun#  (ser-fns# ~shape-to-test)]]
       (is (= ~expected-result (serialization-fun# input#))))))


;;;;;;;;;;;;;;;;;
;; STRING TYPE ;;
;;;;;;;;;;;;;;;;;


(deftest-aws-ser string-enum-test
  {:description-schema {"shapes" {"CertificateSource"
                                  {"type" "string", "enum" ["cloudfront" "iam" "acm"]}}}
   :shape-to-test      "CertificateSource"
   :apply-on-protocols ["query"]
   :inputs             [:iam "iam"]
   :expected-result    #:http.request.field {:value "iam"
                                             :shape "CertificateSource"}})

(deftest-aws-ser string-enum-when-not-input-not-correct
  {:description-schema {"shapes" {"CertificateSource"
                                  {"type" "string", "enum" ["cloudfront" "iam" "acm"]}}}
   :shape-to-test      "CertificateSource"
   :apply-on-protocols ["query"]
   :inputs             ["d" "foo"]
   :expected-result    #:http.request.field {:value nil
                                             :shape "CertificateSource"}})


(deftest-aws-ser string-pattern
  {:description-schema {"shapes" {"ShapeName"
                                  {"type" "string", "pattern" "\\d{4}-\\d{2}-\\d{2}"}}}
   :shape-to-test      "ShapeName"
   :apply-on-protocols ["query"]
   :inputs             ["1987-08-01"]
   :expected-result    #:http.request.field {:shape "ShapeName"
                                             :value "1987-08-01"}})


;; @TODO - @dupuchba : handle sensitive case


;;;;;;;;;;;;;;;;;;
;; INTEGER TYPE ;;
;;;;;;;;;;;;;;;;;;


(deftest-aws-ser integer-box
  {:description-schema {"shapes" {"ShapeName"
                                  {"type" "integer", "box" true, "max" 25, "min" 0}}}
   :shape-to-test      "ShapeName"
   :apply-on-protocols ["query"]
   :inputs             [1]
   :expected-result    #:http.request.field {:shape "ShapeName"
                                             :value 1}})


(deftest-aws-ser list-0
  {:description-schema {"shapes" {"ShapeName"
                                  {"type"      "list",
                                   "member"    {"shape"        "MemberShape"
                                                "locationName" "MemberShape"}
                                   #_#_"flattened" true}

                                  "MemberShape"
                                  {"type" "integer"}}}
   :shape-to-test      "ShapeName"
   :apply-on-protocols ["query"]
   :inputs             [[1 2]]
   :expected-result    #:http.request.field {:value [#:http.request.field{:value         1
                                                                          :shape         "MemberShape"
                                                                          :location-name "MemberShape"}
                                                     #:http.request.field{:value         2
                                                                          :shape         "MemberShape"
                                                                          :location-name "MemberShape"}]
                                             :shape "ShapeName"
                                             :type  "list"}})



(deftest-aws-ser structure-0
  {:description-schema {"shapes" {"ShapeName1"
                                  {"type" "structure",
                                   "members"
                                   {"DefaultValue"  {"shape" "Double"},
                                    "ReturnEnabled" {"shape" "Boolean"}}}
                                  "Double"
                                  {"type" "double"}
                                  "Boolean"
                                  {"type" "boolean"}}}
   :shape-to-test      "ShapeName1"
   :apply-on-protocols ["query"]
   :inputs             [{:default-value  123
                         :return-enabled false}]
   :expected-result    #:http.request.field {:value [#:http.request.field{:value 123
                                                                          :shape "Double"
                                                                          :name  "DefaultValue"}
                                                     #:http.request.field{:value false
                                                                          :shape "Boolean"
                                                                          :name  "ReturnEnabled"}]
                                             :shape "ShapeName1"
                                             :type  "structure"}})


