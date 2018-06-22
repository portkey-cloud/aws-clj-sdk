(ns portkey.aws.machinelearning.-2014-12-12 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope
    {:service "machinelearning", :region "eu-west-1"},
    :ssl-common-name "machinelearning.eu-west-1.amazonaws.com",
    :endpoint "https://machinelearning.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "machinelearning", :region "us-east-1"},
    :ssl-common-name "machinelearning.us-east-1.amazonaws.com",
    :endpoint "https://machinelearning.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
