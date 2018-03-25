(ns portkey.awssig
  "Functions to sign AWS requests."
  (:require [clojure.string :as str]
    [net.cgrand.xforms :as x]
    [net.cgrand.xforms.rfs :as rf]
    [clj-http.util :as codec]))

(def x-amz-date-formatter
  (java.time.format.DateTimeFormatter/ofPattern "yyyyMMdd'T'HHmmss'Z'"))

(defn trim-all [x]
  (str/replace x #"(^ *)|( *$)|( *(?= ))" ""))

(defn canonical-headers [headers]
  (into (sorted-map)
    (comp
      (x/for [[k v] %
              :let [k (str/lower-case k)]
              v (if (coll? v) v [v])]
        [k (trim-all v)]) ; despite s3 documentation it's trim-all and not trim even for s3 
      (x/by-key
        (comp (interpose ",")
          (x/reduce rf/str))))
    headers))

(defn hex-string [^bytes bytes]
  (let [digits "0123456789abcdef"]
    (str (areduce bytes i sb (StringBuilder.)
           (-> sb
             (.append (.charAt digits (bit-and 15 (bit-shift-right (aget bytes i) 4))))
             (.append (.charAt digits (bit-and 15 (aget bytes i)))))))))

(defprotocol Streamable
  (^java.io.InputStream stream [_]))

(extend-protocol Streamable
  nil
  (stream [s]
    (java.io.ByteArrayInputStream. (byte-array 0)))
  String
  (stream [s]
    (-> s (.getBytes "UTF-8") java.io.ByteArrayInputStream.))
  org.apache.http.HttpEntity
  (stream [e] (.getContent e)))

(extend (Class/forName "[B")
  Streamable
  {:stream (fn [bs]
             (java.io.ByteArrayInputStream. bs))})

(defn sha-256 [x]
  (with-open [s (stream x)]
    (let [buffer (byte-array (* 16 1024))
          md (java.security.MessageDigest/getInstance "SHA-256")]
      (loop []
        (let [n (.read s buffer)]
          (if (neg? n)
            (hex-string (.digest md))
            (do
              (.update md buffer 0 n)
              (recur))))))))

(defn hmac-sha-256
  [^bytes secret ^String s]
  (-> (javax.crypto.Mac/getInstance "HmacSHA256")
    (doto (.init (javax.crypto.spec.SecretKeySpec. secret "HmacSHA256")))
    (.doFinal (.getBytes s "ASCII"))))

(defn- normalize [^String path]
  (-> path java.net.URI. .normalize .getPath))

(defn sigv4 [{:keys [request-method uri headers body query-string] :as req}
             {:keys [secret-key access-key region service token payload]}]
  (let [payload (or (when (= service "s3") payload) :signed)
        content-hash (case payload
                       :unsigned "UNSIGNED-PAYLOAD"
                       :chunked (throw (ex-info "Unsupported chunked payload" {}))
                       :signed (sha-256 body))
        headers (cond-> headers token (assoc "X-Amz-Security-Token" token))
        canonical-headers (cond-> (canonical-headers headers)
                            (not= "s3" service) (dissoc "x-amz-security-token"))
        extra-headers (cond-> {}
                        (= "s3" service) (assoc "x-amz-content-sha256" content-hash)
                        (not (canonical-headers "host"))
                        (assoc "host" (:server-name req))
                        (not (or (canonical-headers "date") (canonical-headers "x-amz-date")))
                        (assoc "x-amz-date" (.format (java.time.LocalDateTime/now (java.time.ZoneId/of "Z")) x-amz-date-formatter)))
        headers (into headers extra-headers)
        {:strs [date x-amz-date] :as canonical-headers} (into canonical-headers extra-headers)
        
        signed-headers (str/join ";" (keys canonical-headers))
        x-amz-date (or x-amz-date (->> date (.parse java.time.format.DateTimeFormatter/RFC_1123_DATE_TIME)
                                    (.format x-amz-date-formatter)))
        date (subs x-amz-date 0 8)

        canonical-request
        (str (str/upper-case (name request-method)) "\n"
          (cond
            (= uri "") "/"
            (= service "s3") uri
            :else (normalize uri)) "\n"
          (->> (str/split (or query-string "") #"&")
            (keep #(re-matches #"([^=]+)=?(.*)" %))
            sort
            (map (fn [[_ q v]] (str q "=" v)))
            (str/join "&")) "\n"
          (transduce
            (x/for [[header value] %, s [header ":" value "\n"]] s)
            rf/str
            canonical-headers)
          "\n" ; extra blank line
          signed-headers "\n"
          content-hash)
        canonical-request-hash (sha-256 canonical-request)
        credential-scope (str date "/" region "/" service "/aws4_request")
        string-to-sign (str "AWS4-HMAC-SHA256\n" x-amz-date "\n" credential-scope "\n" canonical-request-hash)
        signing-key
        (-> (str "AWS4" secret-key)
          (.getBytes "ASCII")
          (hmac-sha-256 date)
          (hmac-sha-256 region)
          (hmac-sha-256 service)
          (hmac-sha-256 "aws4_request"))
        signature (hex-string (hmac-sha-256 signing-key string-to-sign))
        auth (str "AWS4-HMAC-SHA256 Credential=" access-key "/" credential-scope
               ", SignedHeaders=" signed-headers ", Signature=" signature)
        headers (assoc headers "Authorization" auth)]
    (assoc req :headers headers)))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Signing a request v2
;; https://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/HMACAuth.html#REST_RESTAuth

(def x-amz-date-formatter-sign-2
  (java.time.format.DateTimeFormatter/ofPattern "yyyy-MM-dd'T'HH:mm:ss'Z'"))

(defn- hmac-sha-256-sign2
   [^bytes secret ^String s]
   (-> (javax.crypto.Mac/getInstance "HmacSHA256")
         (doto (.init (javax.crypto.spec.SecretKeySpec. secret "HmacSHA256")))
         (.doFinal (.getBytes s "UTF8"))))

(defn- base64-encode [bytes] (.encodeToString (java.util.Base64/getEncoder) bytes))

(defn- utf8-natural-byte-cmp
   "Sort the UTF-8 query string components by parameter name with natural byte ordering.
   I wonder if it really matters for the input we deal with"
   [^String a ^String b]
   (let [sa a sb b
         a (.getBytes a "UTF8")
         b (.getBytes b "UTF8")
         n (min (alength a) (alength b))]
        (loop [i 0]
          (if (< i n)
            (let [r (- (aget a i) (aget b i))]
               (if (zero? r)
                 (recur (inc i))
                 r))
            (- (alength a) (alength b))))))

(defn- create-canonicalized-query-string-v2
   "Step 1 : Create a canonicalized query-string for building the signature v2."
   [& {:keys [query-params]}]
   (x/str
     (comp
       (x/sort-by key utf8-natural-byte-cmp)
       (x/for [[k v] %]
              (str (codec/url-encode k) "=" (codec/url-encode v)))
       (interpose "&"))
     query-params))

(defn- create-string-to-sign-v2
   "Step 2 : Gather request information before signing."
   [verb host uri qs]
   (str verb "\n" host "\n" uri "\n" qs))

(defn- create-base-64-hmac-signature
   "Step 3 : Sign the string with hmac-signature and base-encode-64 it."
   [secret-key string-to-sign]
   (-> secret-key
       (.getBytes "UTF8")
       (hmac-sha-256-sign2 string-to-sign)
       base64-encode))

(defn sigv2
    [{:keys [request-method uri form-params query-string server-name version] :as req}
     {:keys [secret-key access-key region service token payload] :as o}]
    (let [qp (-> (if (= "GET" request-method) query-string form-params)
                 (assoc "AWSAccessKeyId" access-key
                        "SignatureVersion" "2"
                        "SignatureMethod" "HmacSHA256"
                        "Timestamp" (.format (java.time.LocalDateTime/now (java.time.ZoneId/of "Z")) x-amz-date-formatter-sign-2)
                     ;; @todo: change that hardcoded version
                        "Version" (if (string? version) version "LATEST")))
          body (->> qp
                    (create-canonicalized-query-string-v2 :query-params)
                    (create-string-to-sign-v2 request-method server-name uri)
                    (create-base-64-hmac-signature secret-key)
                    (assoc qp "Signature")
                    (update req
                            (if (= "GET" request-method) :query-params :form-params)
                            #(conj %1 %2)))]
      (update body :request-method #(keyword (clojure.string/lower-case %)))))
