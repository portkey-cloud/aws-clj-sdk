(ns portkey.aws.discovery.-2015-11-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "discovery", :region "us-west-2"},
    :ssl-common-name "discovery.us-west-2.amazonaws.com",
    :endpoint "https://discovery.us-west-2.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
