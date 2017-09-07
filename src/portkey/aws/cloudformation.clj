(ns portkey.aws.cloudformation (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "cloudformation", "region" "ap-northeast-1"},
    :sslCommonName "cloudformation.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "cloudformation", "region" "eu-west-1"},
    :sslCommonName "cloudformation.eu-west-1.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "cloudformation", "region" "us-east-2"},
    :sslCommonName "cloudformation.us-east-2.amazonaws.com",
    :endpoint "https://cloudformation.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "cloudformation", "region" "ap-southeast-2"},
    :sslCommonName "cloudformation.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudformation.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope
    {"service" "cloudformation", "region" "cn-north-1"},
    :sslCommonName "cloudformation.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cloudformation.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope
    {"service" "cloudformation", "region" "sa-east-1"},
    :sslCommonName "cloudformation.sa-east-1.amazonaws.com",
    :endpoint "https://cloudformation.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "cloudformation", "region" "ap-southeast-1"},
    :sslCommonName "cloudformation.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "cloudformation", "region" "ap-northeast-2"},
    :sslCommonName "cloudformation.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudformation.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "cloudformation", "region" "ca-central-1"},
    :sslCommonName "cloudformation.ca-central-1.amazonaws.com",
    :endpoint "https://cloudformation.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "cloudformation", "region" "eu-central-1"},
    :sslCommonName "cloudformation.eu-central-1.amazonaws.com",
    :endpoint "https://cloudformation.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "cloudformation", "region" "eu-west-2"},
    :sslCommonName "cloudformation.eu-west-2.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope
    {"service" "cloudformation", "region" "us-gov-west-1"},
    :sslCommonName "cloudformation.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudformation.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "cloudformation", "region" "us-west-2"},
    :sslCommonName "cloudformation.us-west-2.amazonaws.com",
    :endpoint "https://cloudformation.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "cloudformation", "region" "us-east-1"},
    :sslCommonName "cloudformation.us-east-1.amazonaws.com",
    :endpoint "https://cloudformation.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope
    {"service" "cloudformation", "region" "us-west-1"},
    :sslCommonName "cloudformation.us-west-1.amazonaws.com",
    :endpoint "https://cloudformation.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "cloudformation", "region" "ap-south-1"},
    :sslCommonName "cloudformation.ap-south-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
