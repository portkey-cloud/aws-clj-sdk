(ns portkey.aws.elasticache.-2015-02-02 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "elasticache", "region" "ap-northeast-1"},
    :sslCommonName "elasticache.ap-northeast-1.amazonaws.com",
    :endpoint "https://elasticache.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "elasticache", "region" "eu-west-1"},
    :sslCommonName "elasticache.eu-west-1.amazonaws.com",
    :endpoint "https://elasticache.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "elasticache", "region" "us-east-2"},
    :sslCommonName "elasticache.us-east-2.amazonaws.com",
    :endpoint "https://elasticache.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "elasticache", "region" "ap-southeast-2"},
    :sslCommonName "elasticache.ap-southeast-2.amazonaws.com",
    :endpoint "https://elasticache.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "elasticache", "region" "cn-north-1"},
    :sslCommonName "elasticache.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticache.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "elasticache", "region" "sa-east-1"},
    :sslCommonName "elasticache.sa-east-1.amazonaws.com",
    :endpoint "https://elasticache.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "elasticache", "region" "ap-southeast-1"},
    :sslCommonName "elasticache.ap-southeast-1.amazonaws.com",
    :endpoint "https://elasticache.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "elasticache", "region" "ap-northeast-2"},
    :sslCommonName "elasticache.ap-northeast-2.amazonaws.com",
    :endpoint "https://elasticache.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "elasticache", "region" "ca-central-1"},
    :sslCommonName "elasticache.ca-central-1.amazonaws.com",
    :endpoint "https://elasticache.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "elasticache", "region" "eu-central-1"},
    :sslCommonName "elasticache.eu-central-1.amazonaws.com",
    :endpoint "https://elasticache.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "elasticache", "region" "eu-west-2"},
    :sslCommonName "elasticache.eu-west-2.amazonaws.com",
    :endpoint "https://elasticache.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope
    {"service" "elasticache", "region" "us-gov-west-1"},
    :sslCommonName "elasticache.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticache.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "elasticache", "region" "us-west-2"},
    :sslCommonName "elasticache.us-west-2.amazonaws.com",
    :endpoint "https://elasticache.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "elasticache", "region" "us-east-1"},
    :sslCommonName "elasticache.us-east-1.amazonaws.com",
    :endpoint "https://elasticache.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "elasticache", "region" "us-west-1"},
    :sslCommonName "elasticache.us-west-1.amazonaws.com",
    :endpoint "https://elasticache.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "elasticache", "region" "ap-south-1"},
    :sslCommonName "elasticache.ap-south-1.amazonaws.com",
    :endpoint "https://elasticache.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
