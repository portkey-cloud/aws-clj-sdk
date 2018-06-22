(ns portkey.aws.health.-2016-08-04 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "health", :region "us-east-1"},
    :ssl-common-name "health.us-east-1.amazonaws.com",
    :endpoint "https://health.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
