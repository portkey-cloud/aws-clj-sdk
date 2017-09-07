(ns portkey.aws.datapipeline.-2012-10-29 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "datapipeline", "region" "ap-northeast-1"},
    :sslCommonName "datapipeline.ap-northeast-1.amazonaws.com",
    :endpoint "https://datapipeline.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "datapipeline", "region" "eu-west-1"},
    :sslCommonName "datapipeline.eu-west-1.amazonaws.com",
    :endpoint "https://datapipeline.eu-west-1.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "datapipeline", "region" "ap-southeast-2"},
    :sslCommonName "datapipeline.ap-southeast-2.amazonaws.com",
    :endpoint "https://datapipeline.ap-southeast-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "datapipeline", "region" "us-west-2"},
    :sslCommonName "datapipeline.us-west-2.amazonaws.com",
    :endpoint "https://datapipeline.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "datapipeline", "region" "us-east-1"},
    :sslCommonName "datapipeline.us-east-1.amazonaws.com",
    :endpoint "https://datapipeline.us-east-1.amazonaws.com"}})

(comment TODO support "json")
