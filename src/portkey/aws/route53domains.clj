(ns portkey.aws.route53domains (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "route53domains", :region "us-east-1"},
    :ssl-common-name "route53domains.us-east-1.amazonaws.com",
    :endpoint "https://route53domains.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
