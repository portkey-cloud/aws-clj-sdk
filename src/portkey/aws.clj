(ns portkey.aws
  (:refer-clojure :exclude [cond])
  (:require [clojure.string :as str]
    [clojure.java.io :as io]
    [clj-http.client :as http]
    [cheshire.core :as json]
    [aws-sig4.auth :as auth]
    [aws-sig4.middleware :as auth-mw]))


(def ^:private ensure-aws-date (auth-mw/wrap-aws-date identity))

(defn- sign-v4 [req credential-scope]
  (let [{:keys [token] :as aws-opts} (into *credentials* credential-scope)
        req (ensure-aws-date req)
        auth (-> req
               auth/canonical-request
               (auth/string-to-sign aws-opts)
               (auth/authorization aws-opts)
               :authorization)]
    (-> req
      (assoc-in [:headers "Authorization"] auth)
      (cond-> token (assoc-in [:headers "X-Amz-Security-Token"] token)))))

(defn wrap-sign [client]
  (fn [{:as req :keys [::credential-scope ::signature-version]}]
    (let [req (dissoc req ::credential-scope ::signature-version)
          req (case signature-version
                :v4 (sign-v4 req credential-scope))]
      (client req))))

(defn sync-http-client [req coerce-resp]
  (http/with-additional-middleware [wrap-sign]
    (let [[tag v] (-> req
                    (assoc :throw-exceptions false)
                    http/request
                    coerce-resp)]
      (case tag
        :result v
        :exception (throw v)))))

(def ^:dynamic *http-client* sync-http-client)
(def ^:dynamic *region*)
(def ^:dynamic ^{:doc "A map with keys :access-key, :secret-key and optionally :token"}
               *credentials*)

(defmacro cond
  ([] nil)
  ([c e & etc]
    (case c
      :let `(let ~e (cond ~@etc))
      :when-let `(when-let ~e (cond ~@etc))
      :when-some `(when-some ~e (cond ~@etc))
      (case (and (vector? c) (some #{:let :some} (keys (meta c))))
        :let `(if-let ~(vary-meta c dissoc :let) ~e (cond ~@etc))
        :some `(if-some ~(vary-meta c dissoc :some) ~e (cond ~@etc))
        `(if ~c ~e (cond ~@etc))))))

(defn credentials!
  "Returns a map with keys :access-key :secret-key or nil."
  []
  (when-some [[a s]
              (cond
               ^:some [id (System/getenv "AWS_ACCESS_KEY_ID")]
               [id (System/getenv "AWS_SECRET_ACCESS_KEY")]

               ^:some [id (System/getProperty "aws.accessKeyId")]
               [id (System/getProperty "aws.secretKey")]

               :let [file (or (some-> (System/getenv "AWS_CREDENTIAL_PROFILES_FILE") java.io.File.)
                            (java.io.File. (System/getProperty "user.home") ".aws/credentials"))
                     profile (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")
                     {:strs [aws_access_key_id aws_secret_access_key]}
                     (when (.exists file)
                       (with-open [rdr (io/reader file)]
                         (into {}
                           (comp
                             (remove #(re-matches #"\s*(?:;.*)?" %))
                             (map str/trim)
                             (drop-while #(not= profile (second (re-matches #"\[\s*(.+?)\s*]" %))))
                             (drop 1)
                             (map #(when-some [[_ k v] (re-matches #"([^\[=][^=]*)=(.*)")] [k v]))
                             (take-while some?))
                           (->> rdr java.io.BufferedReader. line-seq))))]
               (some? aws_access_key_id)
               [aws_access_key_id aws_secret_access_key]
    
               #_(TODO
                   curl "169.254.170.2$AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"
                   {
                    "AccessKeyId" "ACCESS_KEY_ID",
                    "Expiration" "EXPIRATION_DATE",
                    "RoleArn" "TASK_ROLE_ARN",
                    "SecretAccessKey" "SECRET_ACCESS_KEY",
                    "Token" "SECURITY_TOKEN_STRING"
                    }))]
    {:access-key a :secret-key s}))


