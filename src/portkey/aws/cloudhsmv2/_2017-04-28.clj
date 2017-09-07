(ns portkey.aws.cloudhsmv2.-2017-04-28 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope {"service" "cloudhsmv2", "region" "eu-west-1"},
    :sslCommonName "cloudhsmv2.eu-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "cloudhsmv2", "region" "us-east-2"},
    :sslCommonName "cloudhsmv2.us-east-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "cloudhsmv2", "region" "us-west-2"},
    :sslCommonName "cloudhsmv2.us-west-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "cloudhsmv2", "region" "us-east-1"},
    :sslCommonName "cloudhsmv2.us-east-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-1.amazonaws.com"}})

(comment TODO support "json")
