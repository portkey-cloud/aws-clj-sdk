(ns portkey.aws.servicediscovery (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope
    {:service "servicediscovery", :region "eu-west-1"},
    :ssl-common-name "servicediscovery.eu-west-1.amazonaws.com",
    :endpoint "https://servicediscovery.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "servicediscovery", :region "us-east-2"},
    :ssl-common-name "servicediscovery.us-east-2.amazonaws.com",
    :endpoint "https://servicediscovery.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "servicediscovery", :region "us-west-2"},
    :ssl-common-name "servicediscovery.us-west-2.amazonaws.com",
    :endpoint "https://servicediscovery.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "servicediscovery", :region "us-east-1"},
    :ssl-common-name "servicediscovery.us-east-1.amazonaws.com",
    :endpoint "https://servicediscovery.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
