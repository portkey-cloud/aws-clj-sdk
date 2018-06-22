(ns portkey.aws.support (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "support", :region "us-east-1"},
    :ssl-common-name "support.us-east-1.amazonaws.com",
    :endpoint "https://support.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
