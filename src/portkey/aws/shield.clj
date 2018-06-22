(ns portkey.aws.shield (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "shield", :region "us-east-1"},
    :ssl-common-name "Shield.us-east-1.amazonaws.com",
    :endpoint "https://shield.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
