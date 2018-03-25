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
            [net.cgrand.xforms :as x]))

;; 1 - Load the file containing the request
;; 2 - Transform the input stream into a canocical request
;; 3 - Extract sign V4 to make a canonical function
;; 4 - Test the canonical part

;; load all request from amazon test


(defn req-text->req-map
  "Given  a request  from AWS  test*.req, returns  a clj-http  request
  map."
  [input]
  (let [[_ verb uri host date]
        (re-find #"([A-Z]+)\s(\S+).+\nHost:(\S+)\nX-Amz-Date:(\S+)" input)]
    {:request-method verb
     :uri uri
     :host host
     :date date}))

(def all-req-text-tests
  (into []
        (comp
         (filter #(re-find #"\.req$" (.getName %)))
         (map #(slurp %)))
        (file-seq (java.io.File. "resources/aws-sig-v4-test-suite/"))))

(def all-req-map-tests
  (into []
        (map #(req-text->req-map %))
        all-req-text-tests))

(comment

  (refer 'clojure.repl)

  (into []
        (mapcat (fn [req]
                  [[req (req-text->req-map req)]]))
        all-req-text-tests)

  (def input "GET / HTTP/1.1\nHost:example.amazonaws.com\nMy-Header1:value2\nMy-Header1:value2\nMy-Header1:value1\nX-Amz-Date:20150830T123600Z")
  
  (let [[_ & a]
        (re-find #"(?m)([A-Z]+)\s(\S+).+\nHost:(\S+)\n((.*:.*)\n)?" input)]
    a)
  
  ;; returns
  [["GET / HTTP/1.1\nHost:example.amazonaws.com\nMy-Header1:value2\nMy-Header1:value2\nMy-Header1:value1\nX-Amz-Date:20150830T123600Z"
    {:request-method nil, :uri nil, :host nil, :date nil}]
   ["GET / HTTP/1.1\nHost:example.amazonaws.com\nMy-Header1:value1\n  value2\n     value3\nX-Amz-Date:20150830T123600Z"
    {:request-method nil, :uri nil, :host nil, :date nil}]
   ["GET / HTTP/1.1\nHost:example.amazonaws.com\nMy-Header1:value4\nMy-Header1:value1\nMy-Header1:value3\nMy-Header1:value2\nX-Amz-Date:20150830T123600Z"
    {:request-method nil, :uri nil, :host nil, :date nil}]
   ["GET / HTTP/1.1\nHost:example.amazonaws.com\nMy-Header1: value1\nMy-Header2: \"a   b   c\"\nX-Amz-Date:20150830T123600Z"
    {:request-method nil, :uri nil, :host nil, :date nil}]
   ["GET /-._~0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri
     "/-._~0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /ሴ HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/ሴ",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET / HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /?Param1=value1 HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/?Param1=value1",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET / HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /?Param1=value2&Param1=Value1 HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/?Param1=value2&Param1=Value1",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /?Param2=value2&Param1=value1 HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/?Param2=value2&Param1=value1",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /?Param1=value2&Param1=value1 HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/?Param1=value2&Param1=value1",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /?-._~0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz=-._~0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri
     "/?-._~0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz=-._~0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /?ሴ=bar HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/?ሴ=bar",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /example/.. HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/example/..",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /example1/example2/../.. HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/example1/example2/../..",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET // HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "//",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /./ HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/./",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /./example HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/./example",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET //example// HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "//example//",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["GET /example space/ HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "GET",
     :uri "/example",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["POST / HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "POST",
     :uri "/",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["POST / HTTP/1.1\nHost:example.amazonaws.com\nMy-Header1:value1\nX-Amz-Date:20150830T123600Z"
    {:request-method nil, :uri nil, :host nil, :date nil}]
   ["POST / HTTP/1.1\nHost:example.amazonaws.com\nMy-Header1:VALUE1\nX-Amz-Date:20150830T123600Z"
    {:request-method nil, :uri nil, :host nil, :date nil}]
   ["POST / HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "POST",
     :uri "/",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["POST / HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z\nX-Amz-Security-Token:AQoDYXdzEPT//////////wEXAMPLEtc764bNrC9SAPBSM22wDOk4x4HIZ8j4FZTwdQWLWsKWHGBuFqwAeMicRXmxfpSPfIeoIYRqTflfKD8YUuwthAx7mSEI/qkPpKPi/kMcGdQrmGdeehM4IC1NtBmUpp2wUE8phUZampKsburEDy0KPkyQDYwT7WZ0wq5VSXDvp75YU9HFvlRd8Tx6q6fE8YQcHNVXAkiY9q6d+xo0rKwT38xVqr7ZD0u0iPPkUL64lIZbqBAz+scqKmlzm8FDrypNC9Yjc8fPOLn9FX9KSYvKTr4rvx3iSIlTJabIQwj2ICCR/oLxBA=="
    {:request-method "POST",
     :uri "/",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["POST / HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "POST",
     :uri "/",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["POST /?Param1=value1 HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "POST",
     :uri "/?Param1=value1",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["POST /?Param1=value1 HTTP/1.1\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z"
    {:request-method "POST",
     :uri "/?Param1=value1",
     :host "example.amazonaws.com",
     :date "20150830T123600Z"}]
   ["POST / HTTP/1.1\nContent-Type:application/x-www-form-urlencoded\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z\n\nParam1=value1"
    {:request-method nil, :uri nil, :host nil, :date nil}]
   ["POST / HTTP/1.1\nContent-Type:application/x-www-form-urlencoded; charset=utf8\nHost:example.amazonaws.com\nX-Amz-Date:20150830T123600Z\n\nParam1=value1"
    {:request-method nil, :uri nil, :host nil, :date nil}]]

  (re-find #"\.req$" ".req"))

