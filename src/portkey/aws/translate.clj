(ns portkey.aws.translate (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-2"
   {:credential-scope {:service "translate", :region "us-east-2"},
    :ssl-common-name "translate.us-east-2.amazonaws.com",
    :endpoint "https://translate.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "translate", :region "us-west-2"},
    :ssl-common-name "translate.us-west-2.amazonaws.com",
    :endpoint "https://translate.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "translate", :region "us-east-1"},
    :ssl-common-name "translate.us-east-1.amazonaws.com",
    :endpoint "https://translate.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
