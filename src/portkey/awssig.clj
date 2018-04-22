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

(defn building-signing-information
  [{:keys [body headers] :as req}
   {:keys [service region payload token]}]
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
        credential-scope (str date "/" region "/" service "/aws4_request")]
    {:signed-headers signed-headers
     :content-hash content-hash
     :canonical-headers canonical-headers
     :date date
     :x-amz-date x-amz-date
     :headers headers
     :credential-scope credential-scope}))

(defn sigv4-canonical-request [{:keys [request-method uri headers body query-string] :as req}
                               {:keys [service token payload] :as creds}
                               {:keys [signed-headers content-hash canonical-headers]}]
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
       content-hash))

(defn sigv4-string-to-sign
  [{:keys [x-amz-date credential-scope]} canonical-request]
  (let [canonical-request-hash (sha-256 canonical-request)]
    (str "AWS4-HMAC-SHA256\n" x-amz-date "\n" credential-scope "\n" canonical-request-hash)))

(defn sigv4-authorization-headers
  [{:keys [region service access-key secret-key]} {:keys [date credential-scope signed-headers]} string-to-sign]
  (let [signing-key (-> (str "AWS4" secret-key)
                        (.getBytes "ASCII")
                        (hmac-sha-256 date)
                        (hmac-sha-256 region)
                        (hmac-sha-256 service)
                        (hmac-sha-256 "aws4_request"))
        signature (hex-string (hmac-sha-256 signing-key string-to-sign))]
    (str "AWS4-HMAC-SHA256 Credential=" access-key "/" credential-scope
         ", SignedHeaders=" signed-headers ", Signature=" signature)))

(defn sigv4 [req creds]
  (let [{:keys [headers] :as sig-info} (building-signing-information req creds)
        headers (->> sig-info
                     (sigv4-canonical-request req creds)
                     (sigv4-string-to-sign sig-info)
                     (sigv4-authorization-headers creds sig-info)
                     (assoc headers "Authorization"))]
    (assoc req :headers headers)))

