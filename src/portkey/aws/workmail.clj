(ns portkey.aws.workmail (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "workmail", :region "eu-west-1"},
    :ssl-common-name "workmail.eu-west-1.amazonaws.com",
    :endpoint "https://workmail.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "workmail", :region "us-west-2"},
    :ssl-common-name "workmail.us-west-2.amazonaws.com",
    :endpoint "https://workmail.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "workmail", :region "us-east-1"},
    :ssl-common-name "workmail.us-east-1.amazonaws.com",
    :endpoint "https://workmail.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
