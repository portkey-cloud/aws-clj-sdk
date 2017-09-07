(ns portkey.aws.discovery (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credentialScope {"service" "discovery", "region" "us-west-2"},
    :sslCommonName "discovery.us-west-2.amazonaws.com",
    :endpoint "https://discovery.us-west-2.amazonaws.com"}})

(comment TODO support "json")
