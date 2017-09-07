(ns portkey.aws
  (:refer-clojure :exclude [cond])
  (:require [clojure.string :as str]
    [clojure.java.io :as io]
    [cheshire.core :as json]
    [aws-sig4.auth :as auth]))

(def ^:dynamic *http-client*)
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

(defn sign-v4 [req {:keys [token] :as aws-opts}]
  (let [auth (-> req
               auth/canonical-request
               (auth/string-to-sign aws-opts)
               (auth/authorization aws-opts)
               :authorization)]
    (cond-> (assoc-in req [:headers "Authorization"] auth)
      token (assoc-in [:headers "X-Amz-Security-Token"] token))))
