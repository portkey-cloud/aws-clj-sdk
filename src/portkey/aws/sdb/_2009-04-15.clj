(ns portkey.aws.sdb.-2009-04-15 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "sdb", "region" "ap-northeast-1"},
    :sslCommonName "sdb.ap-northeast-1.amazonaws.com",
    :endpoint "https://sdb.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "sdb", "region" "eu-west-1"},
    :sslCommonName "sdb.eu-west-1.amazonaws.com",
    :endpoint "https://sdb.eu-west-1.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "sdb", "region" "ap-southeast-2"},
    :sslCommonName "sdb.ap-southeast-2.amazonaws.com",
    :endpoint "https://sdb.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "sdb", "region" "sa-east-1"},
    :sslCommonName "sdb.sa-east-1.amazonaws.com",
    :endpoint "https://sdb.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "sdb", "region" "ap-southeast-1"},
    :sslCommonName "sdb.ap-southeast-1.amazonaws.com",
    :endpoint "https://sdb.ap-southeast-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "sdb", "region" "us-west-2"},
    :sslCommonName "sdb.us-west-2.amazonaws.com",
    :endpoint "https://sdb.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "sdb", "region" "us-east-1"},
    :sslCommonName "sdb.amazonaws.com",
    :endpoint "https://sdb.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "sdb", "region" "us-west-1"},
    :sslCommonName "sdb.us-west-1.amazonaws.com",
    :endpoint "https://sdb.us-west-1.amazonaws.com"}})

(comment TODO support "query")
