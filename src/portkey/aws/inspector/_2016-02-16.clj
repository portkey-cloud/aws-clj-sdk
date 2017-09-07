(ns portkey.aws.inspector.-2016-02-16 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "inspector", "region" "ap-northeast-1"},
    :sslCommonName "inspector.ap-northeast-1.amazonaws.com",
    :endpoint "https://inspector.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "inspector", "region" "eu-west-1"},
    :sslCommonName "inspector.eu-west-1.amazonaws.com",
    :endpoint "https://inspector.eu-west-1.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "inspector", "region" "ap-southeast-2"},
    :sslCommonName "inspector.ap-southeast-2.amazonaws.com",
    :endpoint "https://inspector.ap-southeast-2.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "inspector", "region" "ap-northeast-2"},
    :sslCommonName "inspector.ap-northeast-2.amazonaws.com",
    :endpoint "https://inspector.ap-northeast-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "inspector", "region" "us-west-2"},
    :sslCommonName "inspector.us-west-2.amazonaws.com",
    :endpoint "https://inspector.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "inspector", "region" "us-east-1"},
    :sslCommonName "inspector.us-east-1.amazonaws.com",
    :endpoint "https://inspector.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "inspector", "region" "us-west-1"},
    :sslCommonName "inspector.us-west-1.amazonaws.com",
    :endpoint "https://inspector.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "inspector", "region" "ap-south-1"},
    :sslCommonName "inspector.ap-south-1.amazonaws.com",
    :endpoint "https://inspector.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
