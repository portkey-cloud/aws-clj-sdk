(ns portkey.awssig-test
  "Testing AWS Signature v4 with the official amazon test suite.

  Each test group contains five files  that you can use to validate each
  of the tasks described in  Signature Version 4 Signing Process.  The
  following list describes the contents of each file.

  - file-name.req : the web request to be signed.  
  - file-name.creq : the resulting canonical request.  
  - file-name.sts : the resulting string to sign.  
  - file-name.authz : the Authorization header.  
  - file-name.sreq  : the signed request."
  (:require [clojure.test :refer :all]
            [clojure.java.io :as io]
            [net.cgrand.xforms :as x]
            [clojure.string :as s]
            [portkey.awssig :as sign]
            [clj-http.client :as http]))


;;;;;;;;;;;;;;;;;;;;;;;
;; INPUT TESTS FILES ;;
;;;;;;;;;;;;;;;;;;;;;;;


(def all-req-text-tests
  "Given  the 5  test files  for each  test case  supplied by  Amazon,
  returns a map of test cases with it's file content."
  (into {}
        (comp (remove #(.isDirectory ^java.io.File %))
              (x/by-key #(-> ^java.io.File % .getParentFile .getName)
                        (comp (x/for [file ^java.io.File %
                                      :let [filename (.getName file)
                                            [_ extension] (re-find #"\S+\.(auth|creq|req|sreq|sts)" filename)]]
                                [extension (slurp file)])
                              (x/reduce conj {}))))
        (file-seq (java.io.File. "resources/aws-sig-v4-test-suite/"))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; RAW HTTP REQUEST TO RING REQUEST ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn- req-text->req-map
  "Transform  a  raw text  request  from  AWS  test  suite to  a  ring
  request."
  [req]
  (let [[_ request-method full-uri protocol headers+body] (re-find #"(?s)([A-Z]+)\s(.+)\s(HTTP/1\.1)\n(.*)" req)
        headers (for [[_ header value] (re-seq #"(?s)(\S+):(.*?\n(?:[\t ].*?\n)*)" (str headers+body "\n"))]
                  [header (s/trim-newline value)])
        body (re-find #"Param1=value1" headers+body)
        [_ uri query-string] (re-find #"(?s)([\S&&[^?]]+)\??(\S+)?" full-uri)]
    (cond->
        {:request-method request-method
         :uri full-uri
         :protocol protocol}
      (not (or (empty? headers) (nil? headers))) (assoc :headers
                                                        (into {}
                                                              (x/by-key (comp (interpose ",")
                                                                              x/str))
                                                              headers))
      (not (nil? body)) (assoc :body body)
      (not (nil? query-string)) (assoc :query-string query-string :uri uri)
      true (as->
               req-map
               (assoc req-map :server-name (get-in req-map [:headers "Host"]))
             (update req-map :headers dissoc "Host")))))


;;;;;;;;;;;;;;;;
;; TEST SUITE ;;
;;;;;;;;;;;;;;;;


(deftest canonical-request
  (doseq [[test-name {:strs [auth creq req sreq sts]}] all-req-text-tests]
    (is (let [req (req-text->req-map req)
              signing-info (sign/building-signing-information req nil)]
          (= creq (sign/sigv4-canonical-request req nil signing-info)))
        (str "Test " test-name " is failing to transform a request to a canonical request."))))


(deftest string-to-sign
  (doseq [[test-name {:strs [auth creq req sreq sts]}] all-req-text-tests]
    (is (let [req (req-text->req-map req)
              creds {:region "us-east-1"
                     :service "service"}
              signing-info (sign/building-signing-information req creds)]
          (= sts (->> signing-info
                      (sign/sigv4-canonical-request req creds)
                      (sign/sigv4-string-to-sign signing-info))))
        (str "Test " test-name " is failing to create the string to sign."))))


(deftest authorization-header
  (doseq [[test-name {:strs [auth creq req sreq sts]}] all-req-text-tests]
    (is (let [req (req-text->req-map req)
              creds {:region "us-east-1"
                     :service "service"
                     :access-key "AKIDEXAMPLE"
                     :secret-key "wJalrXUtnFEMI/K7MDENG+bPxRfiCYEXAMPLEKEY"}
              signing-info (sign/building-signing-information req creds)]
          (= auth (->> signing-info
                       (sign/sigv4-canonical-request req creds)
                       (sign/sigv4-string-to-sign signing-info)
                       (sign/sigv4-authorization-headers creds signing-info))
             (str "Test " test-name " is failing to create the authorization headers"))))))


