(ns portkey.aws.health.-2016-08-04 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credentialScope {"service" "health", "region" "us-east-1"},
    :sslCommonName "health.us-east-1.amazonaws.com",
    :endpoint "https://health.us-east-1.amazonaws.com"}})

(comment TODO support "json")
