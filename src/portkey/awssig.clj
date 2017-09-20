(ns portkey.awssig
  "Functions to sign AWS requests."
  (:require [clojure.string :as str]
    [net.cgrand.xforms :as x]
    [net.cgrand.xforms.rfs :as rf]))

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
        [k (trim-all v)])
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

(defn sigv4 [{:keys [request-method uri headers body query-string] :as req}
             {:keys [secret-key access-key region service]}]
  (let [{:strs [date x-amz-date] :as canonical-headers} (canonical-headers headers)
        [canonical-headers req] ; ensure host
        (if (canonical-headers "host")
          [canonical-headers req]
          (let [host (:server-name req)]
            [(assoc canonical-headers "host" host)
             (assoc-in req [:headers "Host"] host)]))
        [canonical-headers req] ; ensure date
        (if (or (canonical-headers "date") (canonical-headers "x-amz-date"))
          [canonical-headers req]
          (let [date (.format (java.time.LocalDateTime/now (java.time.ZoneId/of "Z")) x-amz-date-formatter)]
            [(assoc canonical-headers "x-amz-date" date)
             (assoc-in req [:headers "X-Amz-Date"] date)]))
        signed-headers (str/join ";" (keys canonical-headers))
        x-amz-date (or x-amz-date (->> date (.parse java.time.format.DateTimeFormatter/RFC_1123_DATE_TIME)
                                    (.format x-amz-date-formatter)))
        date (subs x-amz-date 0 8)
        canonical-request
        (str request-method "\n"
          (if (= uri "") "/" uri) "\n"
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
            (sha-256 body))
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
               ", SignedHeaders=" signed-headers ", Signature=" signature)]
    (assoc-in req [:headers "Authorization"] auth)))

