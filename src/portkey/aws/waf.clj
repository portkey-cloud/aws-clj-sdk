(ns portkey.aws.waf (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "aws-global"
   {:credentialScope {"service" "waf", "region" "us-east-1"},
    :sslCommonName "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"}})

(comment TODO support "json")
