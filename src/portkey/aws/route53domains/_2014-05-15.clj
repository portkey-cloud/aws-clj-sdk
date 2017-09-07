(ns portkey.aws.route53domains.-2014-05-15 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credentialScope
    {"service" "route53domains", "region" "us-east-1"},
    :sslCommonName "route53domains.us-east-1.amazonaws.com",
    :endpoint "https://route53domains.us-east-1.amazonaws.com"}})

(comment TODO support "json")
