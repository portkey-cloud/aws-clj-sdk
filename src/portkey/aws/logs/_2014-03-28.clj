(ns portkey.aws.logs.-2014-03-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "logs", "region" "ap-northeast-1"},
    :sslCommonName "logs.ap-northeast-1.amazonaws.com",
    :endpoint "https://logs.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "logs", "region" "eu-west-1"},
    :sslCommonName "logs.eu-west-1.amazonaws.com",
    :endpoint "https://logs.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "logs", "region" "us-east-2"},
    :sslCommonName "logs.us-east-2.amazonaws.com",
    :endpoint "https://logs.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "logs", "region" "ap-southeast-2"},
    :sslCommonName "logs.ap-southeast-2.amazonaws.com",
    :endpoint "https://logs.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "logs", "region" "cn-north-1"},
    :sslCommonName "logs.cn-north-1.amazonaws.com.cn",
    :endpoint "https://logs.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "logs", "region" "sa-east-1"},
    :sslCommonName "logs.sa-east-1.amazonaws.com",
    :endpoint "https://logs.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "logs", "region" "ap-southeast-1"},
    :sslCommonName "logs.ap-southeast-1.amazonaws.com",
    :endpoint "https://logs.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "logs", "region" "ap-northeast-2"},
    :sslCommonName "logs.ap-northeast-2.amazonaws.com",
    :endpoint "https://logs.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "logs", "region" "ca-central-1"},
    :sslCommonName "logs.ca-central-1.amazonaws.com",
    :endpoint "https://logs.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "logs", "region" "eu-central-1"},
    :sslCommonName "logs.eu-central-1.amazonaws.com",
    :endpoint "https://logs.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "logs", "region" "eu-west-2"},
    :sslCommonName "logs.eu-west-2.amazonaws.com",
    :endpoint "https://logs.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "logs", "region" "us-gov-west-1"},
    :sslCommonName "logs.us-gov-west-1.amazonaws.com",
    :endpoint "https://logs.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "logs", "region" "us-west-2"},
    :sslCommonName "logs.us-west-2.amazonaws.com",
    :endpoint "https://logs.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "logs", "region" "us-east-1"},
    :sslCommonName "logs.us-east-1.amazonaws.com",
    :endpoint "https://logs.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "logs", "region" "us-west-1"},
    :sslCommonName "logs.us-west-1.amazonaws.com",
    :endpoint "https://logs.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "logs", "region" "ap-south-1"},
    :sslCommonName "logs.ap-south-1.amazonaws.com",
    :endpoint "https://logs.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
