(ns portkey.aws.machinelearning.-2014-12-12 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope
    {"service" "machinelearning", "region" "eu-west-1"},
    :sslCommonName "machinelearning.eu-west-1.amazonaws.com",
    :endpoint "https://machinelearning.eu-west-1.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "machinelearning", "region" "us-east-1"},
    :sslCommonName "machinelearning.us-east-1.amazonaws.com",
    :endpoint "https://machinelearning.us-east-1.amazonaws.com"}})

(comment TODO support "json")
