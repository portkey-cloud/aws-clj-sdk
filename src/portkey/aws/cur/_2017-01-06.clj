(ns portkey.aws.cur.-2017-01-06 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "cur", :region "us-east-1"},
    :ssl-common-name "cur.us-east-1.amazonaws.com",
    :endpoint "https://cur.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
