(ns portkey.aws.fms.-2018-01-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "fms", :region "us-west-2"},
    :ssl-common-name "fms.us-west-2.amazonaws.com",
    :endpoint "https://fms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "fms", :region "us-east-1"},
    :ssl-common-name "fms.us-east-1.amazonaws.com",
    :endpoint "https://fms.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
