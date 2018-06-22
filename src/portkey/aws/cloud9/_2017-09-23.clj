(ns portkey.aws.cloud9.-2017-09-23 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "cloud9", :region "eu-west-1"},
    :ssl-common-name "cloud9.eu-west-1.amazonaws.com",
    :endpoint "https://cloud9.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloud9", :region "us-east-2"},
    :ssl-common-name "cloud9.us-east-2.amazonaws.com",
    :endpoint "https://cloud9.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloud9", :region "ap-southeast-1"},
    :ssl-common-name "cloud9.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloud9.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloud9", :region "us-west-2"},
    :ssl-common-name "cloud9.us-west-2.amazonaws.com",
    :endpoint "https://cloud9.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloud9", :region "us-east-1"},
    :ssl-common-name "cloud9.us-east-1.amazonaws.com",
    :endpoint "https://cloud9.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
