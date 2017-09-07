(ns portkey.aws.cloudtrail (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "cloudtrail", "region" "ap-northeast-1"},
    :sslCommonName "cloudtrail.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "cloudtrail", "region" "eu-west-1"},
    :sslCommonName "cloudtrail.eu-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "cloudtrail", "region" "us-east-2"},
    :sslCommonName "cloudtrail.us-east-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "cloudtrail", "region" "ap-southeast-2"},
    :sslCommonName "cloudtrail.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "cloudtrail", "region" "cn-north-1"},
    :sslCommonName "cloudtrail.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cloudtrail.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "cloudtrail", "region" "sa-east-1"},
    :sslCommonName "cloudtrail.sa-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "cloudtrail", "region" "ap-southeast-1"},
    :sslCommonName "cloudtrail.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "cloudtrail", "region" "ap-northeast-2"},
    :sslCommonName "cloudtrail.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "cloudtrail", "region" "ca-central-1"},
    :sslCommonName "cloudtrail.ca-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "cloudtrail", "region" "eu-central-1"},
    :sslCommonName "cloudtrail.eu-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "cloudtrail", "region" "eu-west-2"},
    :sslCommonName "cloudtrail.eu-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope
    {"service" "cloudtrail", "region" "us-gov-west-1"},
    :sslCommonName "cloudtrail.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "cloudtrail", "region" "us-west-2"},
    :sslCommonName "cloudtrail.us-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "cloudtrail", "region" "us-east-1"},
    :sslCommonName "cloudtrail.us-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "cloudtrail", "region" "us-west-1"},
    :sslCommonName "cloudtrail.us-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "cloudtrail", "region" "ap-south-1"},
    :sslCommonName "cloudtrail.ap-south-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
