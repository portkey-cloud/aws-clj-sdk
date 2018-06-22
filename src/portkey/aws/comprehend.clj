(ns portkey.aws.comprehend (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "comprehend", :region "eu-west-1"},
    :ssl-common-name "comprehend.eu-west-1.amazonaws.com",
    :endpoint "https://comprehend.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "comprehend", :region "us-east-2"},
    :ssl-common-name "comprehend.us-east-2.amazonaws.com",
    :endpoint "https://comprehend.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "comprehend", :region "us-west-2"},
    :ssl-common-name "comprehend.us-west-2.amazonaws.com",
    :endpoint "https://comprehend.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "comprehend", :region "us-east-1"},
    :ssl-common-name "comprehend.us-east-1.amazonaws.com",
    :endpoint "https://comprehend.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
