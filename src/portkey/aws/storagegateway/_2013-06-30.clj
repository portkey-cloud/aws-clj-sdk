(ns portkey.aws.storagegateway.-2013-06-30 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "storagegateway", "region" "ap-northeast-1"},
    :sslCommonName "storagegateway.ap-northeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "storagegateway", "region" "eu-west-1"},
    :sslCommonName "storagegateway.eu-west-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "storagegateway", "region" "us-east-2"},
    :sslCommonName "storagegateway.us-east-2.amazonaws.com",
    :endpoint "https://storagegateway.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "storagegateway", "region" "ap-southeast-2"},
    :sslCommonName "storagegateway.ap-southeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope
    {"service" "storagegateway", "region" "cn-north-1"},
    :sslCommonName "storagegateway.cn-north-1.amazonaws.com.cn",
    :endpoint "https://storagegateway.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope
    {"service" "storagegateway", "region" "sa-east-1"},
    :sslCommonName "storagegateway.sa-east-1.amazonaws.com",
    :endpoint "https://storagegateway.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "storagegateway", "region" "ap-southeast-1"},
    :sslCommonName "storagegateway.ap-southeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "storagegateway", "region" "ap-northeast-2"},
    :sslCommonName "storagegateway.ap-northeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "storagegateway", "region" "ca-central-1"},
    :sslCommonName "storagegateway.ca-central-1.amazonaws.com",
    :endpoint "https://storagegateway.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "storagegateway", "region" "eu-central-1"},
    :sslCommonName "storagegateway.eu-central-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "storagegateway", "region" "eu-west-2"},
    :sslCommonName "storagegateway.eu-west-2.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "storagegateway", "region" "us-west-2"},
    :sslCommonName "storagegateway.us-west-2.amazonaws.com",
    :endpoint "https://storagegateway.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "storagegateway", "region" "us-east-1"},
    :sslCommonName "storagegateway.us-east-1.amazonaws.com",
    :endpoint "https://storagegateway.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope
    {"service" "storagegateway", "region" "us-west-1"},
    :sslCommonName "storagegateway.us-west-1.amazonaws.com",
    :endpoint "https://storagegateway.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "storagegateway", "region" "ap-south-1"},
    :sslCommonName "storagegateway.ap-south-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
