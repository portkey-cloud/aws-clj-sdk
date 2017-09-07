(ns portkey.aws.cur.-2017-01-06 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credentialScope {"service" "cur", "region" "us-east-1"},
    :sslCommonName "cur.us-east-1.amazonaws.com",
    :endpoint "https://cur.us-east-1.amazonaws.com"}})

(comment TODO support "json")
