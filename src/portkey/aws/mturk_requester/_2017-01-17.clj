(ns portkey.aws.mturk-requester.-2017-01-17 (:require [portkey.aws]))

(def
 endpoints
 '{"sandbox"
   {:credentialScope {"service" "mturk-requester", "region" "sandbox"},
    :sslCommonName "mturk-requester-sandbox.us-east-1.amazonaws.com",
    :endpoint
    "https://mturk-requester-sandbox.us-east-1.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "mturk-requester", "region" "us-east-1"},
    :sslCommonName "mturk-requester.us-east-1.amazonaws.com",
    :endpoint "https://mturk-requester.us-east-1.amazonaws.com"}})

(comment TODO support "json")
