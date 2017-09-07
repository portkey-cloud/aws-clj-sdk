(ns portkey.aws.acm (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "acm", "region" "ap-northeast-1"},
    :sslCommonName "acm.ap-northeast-1.amazonaws.com",
    :endpoint "https://acm.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "acm", "region" "eu-west-1"},
    :sslCommonName "acm.eu-west-1.amazonaws.com",
    :endpoint "https://acm.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "acm", "region" "us-east-2"},
    :sslCommonName "acm.us-east-2.amazonaws.com",
    :endpoint "https://acm.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "acm", "region" "ap-southeast-2"},
    :sslCommonName "acm.ap-southeast-2.amazonaws.com",
    :endpoint "https://acm.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "acm", "region" "sa-east-1"},
    :sslCommonName "acm.sa-east-1.amazonaws.com",
    :endpoint "https://acm.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "acm", "region" "ap-southeast-1"},
    :sslCommonName "acm.ap-southeast-1.amazonaws.com",
    :endpoint "https://acm.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "acm", "region" "ap-northeast-2"},
    :sslCommonName "acm.ap-northeast-2.amazonaws.com",
    :endpoint "https://acm.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "acm", "region" "ca-central-1"},
    :sslCommonName "acm.ca-central-1.amazonaws.com",
    :endpoint "https://acm.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "acm", "region" "eu-central-1"},
    :sslCommonName "acm.eu-central-1.amazonaws.com",
    :endpoint "https://acm.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "acm", "region" "eu-west-2"},
    :sslCommonName "acm.eu-west-2.amazonaws.com",
    :endpoint "https://acm.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "acm", "region" "us-gov-west-1"},
    :sslCommonName "acm.us-gov-west-1.amazonaws.com",
    :endpoint "https://acm.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "acm", "region" "us-west-2"},
    :sslCommonName "acm.us-west-2.amazonaws.com",
    :endpoint "https://acm.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "acm", "region" "us-east-1"},
    :sslCommonName "acm.us-east-1.amazonaws.com",
    :endpoint "https://acm.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "acm", "region" "us-west-1"},
    :sslCommonName "acm.us-west-1.amazonaws.com",
    :endpoint "https://acm.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "acm", "region" "ap-south-1"},
    :sslCommonName "acm.ap-south-1.amazonaws.com",
    :endpoint "https://acm.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
