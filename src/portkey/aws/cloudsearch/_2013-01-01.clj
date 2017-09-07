(ns portkey.aws.cloudsearch.-2013-01-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "cloudsearch", "region" "ap-northeast-1"},
    :sslCommonName "cloudsearch.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudsearch.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "cloudsearch", "region" "eu-west-1"},
    :sslCommonName "cloudsearch.eu-west-1.amazonaws.com",
    :endpoint "https://cloudsearch.eu-west-1.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "cloudsearch", "region" "ap-southeast-2"},
    :sslCommonName "cloudsearch.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudsearch.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "cloudsearch", "region" "sa-east-1"},
    :sslCommonName "cloudsearch.sa-east-1.amazonaws.com",
    :endpoint "https://cloudsearch.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "cloudsearch", "region" "ap-southeast-1"},
    :sslCommonName "cloudsearch.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudsearch.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "cloudsearch", "region" "ap-northeast-2"},
    :sslCommonName "cloudsearch.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudsearch.ap-northeast-2.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "cloudsearch", "region" "eu-central-1"},
    :sslCommonName "cloudsearch.eu-central-1.amazonaws.com",
    :endpoint "https://cloudsearch.eu-central-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "cloudsearch", "region" "us-west-2"},
    :sslCommonName "cloudsearch.us-west-2.amazonaws.com",
    :endpoint "https://cloudsearch.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "cloudsearch", "region" "us-east-1"},
    :sslCommonName "cloudsearch.us-east-1.amazonaws.com",
    :endpoint "https://cloudsearch.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "cloudsearch", "region" "us-west-1"},
    :sslCommonName "cloudsearch.us-west-1.amazonaws.com",
    :endpoint "https://cloudsearch.us-west-1.amazonaws.com"}})

(comment TODO support "query")
