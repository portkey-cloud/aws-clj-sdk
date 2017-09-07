(ns portkey.aws.elasticmapreduce (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "ap-northeast-1"},
    :sslCommonName "ap-northeast-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "eu-west-1"},
    :sslCommonName "eu-west-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "us-east-2"},
    :sslCommonName "us-east-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "ap-southeast-2"},
    :sslCommonName "ap-southeast-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "cn-north-1"},
    :sslCommonName "elasticmapreduce.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticmapreduce.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "sa-east-1"},
    :sslCommonName "sa-east-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "ap-southeast-1"},
    :sslCommonName "ap-southeast-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "ap-northeast-2"},
    :sslCommonName "ap-northeast-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "ca-central-1"},
    :sslCommonName "ca-central-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "eu-central-1"},
    :sslCommonName "elasticmapreduce.eu-central-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "eu-west-2"},
    :sslCommonName "eu-west-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "us-gov-west-1"},
    :sslCommonName "elasticmapreduce.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "us-west-2"},
    :sslCommonName "us-west-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "us-east-1"},
    :sslCommonName "elasticmapreduce.us-east-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "us-west-1"},
    :sslCommonName "us-west-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "elasticmapreduce", "region" "ap-south-1"},
    :sslCommonName "ap-south-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
