(ns portkey.aws.athena (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "athena", "region" "ap-northeast-1"},
    :sslCommonName "athena.ap-northeast-1.amazonaws.com",
    :endpoint "https://athena.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "athena", "region" "eu-west-1"},
    :sslCommonName "athena.eu-west-1.amazonaws.com",
    :endpoint "https://athena.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "athena", "region" "us-east-2"},
    :sslCommonName "athena.us-east-2.amazonaws.com",
    :endpoint "https://athena.us-east-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "athena", "region" "ap-southeast-1"},
    :sslCommonName "athena.ap-southeast-1.amazonaws.com",
    :endpoint "https://athena.ap-southeast-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "athena", "region" "us-west-2"},
    :sslCommonName "athena.us-west-2.amazonaws.com",
    :endpoint "https://athena.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "athena", "region" "us-east-1"},
    :sslCommonName "athena.us-east-1.amazonaws.com",
    :endpoint "https://athena.us-east-1.amazonaws.com"}})

(comment TODO support "json")
