(ns portkey.aws.discovery.-2015-11-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credentialScope {"service" "discovery", "region" "us-west-2"},
    :sslCommonName "discovery.us-west-2.amazonaws.com",
    :endpoint "https://discovery.us-west-2.amazonaws.com"}})

(comment TODO support "json")
