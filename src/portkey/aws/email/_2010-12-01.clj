(ns portkey.aws.email.-2010-12-01 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope {"service" "email", "region" "eu-west-1"},
    :sslCommonName "email.eu-west-1.amazonaws.com",
    :endpoint "https://email.eu-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "email", "region" "us-west-2"},
    :sslCommonName "email.us-west-2.amazonaws.com",
    :endpoint "https://email.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "email", "region" "us-east-1"},
    :sslCommonName "email.us-east-1.amazonaws.com",
    :endpoint "https://email.us-east-1.amazonaws.com"}})

(comment TODO support "query")
