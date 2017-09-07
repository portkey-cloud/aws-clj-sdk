(ns portkey.aws.ds (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "ds", "region" "ap-northeast-1"},
    :sslCommonName "ds.ap-northeast-1.amazonaws.com",
    :endpoint "https://ds.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "ds", "region" "eu-west-1"},
    :sslCommonName "ds.eu-west-1.amazonaws.com",
    :endpoint "https://ds.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "ds", "region" "us-east-2"},
    :sslCommonName "ds.us-east-2.amazonaws.com",
    :endpoint "https://ds.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "ds", "region" "ap-southeast-2"},
    :sslCommonName "ds.ap-southeast-2.amazonaws.com",
    :endpoint "https://ds.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "ds", "region" "sa-east-1"},
    :sslCommonName "ds.sa-east-1.amazonaws.com",
    :endpoint "https://ds.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "ds", "region" "ap-southeast-1"},
    :sslCommonName "ds.ap-southeast-1.amazonaws.com",
    :endpoint "https://ds.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "ds", "region" "ap-northeast-2"},
    :sslCommonName "ds.ap-northeast-2.amazonaws.com",
    :endpoint "https://ds.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "ds", "region" "ca-central-1"},
    :sslCommonName "ds.ca-central-1.amazonaws.com",
    :endpoint "https://ds.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "ds", "region" "eu-central-1"},
    :sslCommonName "ds.eu-central-1.amazonaws.com",
    :endpoint "https://ds.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "ds", "region" "eu-west-2"},
    :sslCommonName "ds.eu-west-2.amazonaws.com",
    :endpoint "https://ds.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "ds", "region" "us-west-2"},
    :sslCommonName "ds.us-west-2.amazonaws.com",
    :endpoint "https://ds.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "ds", "region" "us-east-1"},
    :sslCommonName "ds.us-east-1.amazonaws.com",
    :endpoint "https://ds.us-east-1.amazonaws.com"}})

(comment TODO support "json")
