(ns portkey.aws.opsworks-cm (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "opsworks-cm", :region "eu-west-1"},
    :ssl-common-name "opsworks-cm.eu-west-1.amazonaws.com",
    :endpoint "https://opsworks-cm.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "opsworks-cm", :region "us-west-2"},
    :ssl-common-name "opsworks-cm.us-west-2.amazonaws.com",
    :endpoint "https://opsworks-cm.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "opsworks-cm", :region "us-east-1"},
    :ssl-common-name "opsworks-cm.us-east-1.amazonaws.com",
    :endpoint "https://opsworks-cm.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
