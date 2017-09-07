(ns portkey.aws.config.-2014-11-12 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "config", "region" "ap-northeast-1"},
    :sslCommonName "config.ap-northeast-1.amazonaws.com",
    :endpoint "https://config.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "config", "region" "eu-west-1"},
    :sslCommonName "config.eu-west-1.amazonaws.com",
    :endpoint "https://config.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "config", "region" "us-east-2"},
    :sslCommonName "config.us-east-2.amazonaws.com",
    :endpoint "https://config.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "config", "region" "ap-southeast-2"},
    :sslCommonName "config.ap-southeast-2.amazonaws.com",
    :endpoint "https://config.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "config", "region" "cn-north-1"},
    :sslCommonName "config.cn-north-1.amazonaws.com.cn",
    :endpoint "https://config.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "config", "region" "sa-east-1"},
    :sslCommonName "config.sa-east-1.amazonaws.com",
    :endpoint "https://config.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "config", "region" "ap-southeast-1"},
    :sslCommonName "config.ap-southeast-1.amazonaws.com",
    :endpoint "https://config.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "config", "region" "ap-northeast-2"},
    :sslCommonName "config.ap-northeast-2.amazonaws.com",
    :endpoint "https://config.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "config", "region" "ca-central-1"},
    :sslCommonName "config.ca-central-1.amazonaws.com",
    :endpoint "https://config.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "config", "region" "eu-central-1"},
    :sslCommonName "config.eu-central-1.amazonaws.com",
    :endpoint "https://config.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "config", "region" "eu-west-2"},
    :sslCommonName "config.eu-west-2.amazonaws.com",
    :endpoint "https://config.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "config", "region" "us-gov-west-1"},
    :sslCommonName "config.us-gov-west-1.amazonaws.com",
    :endpoint "https://config.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "config", "region" "us-west-2"},
    :sslCommonName "config.us-west-2.amazonaws.com",
    :endpoint "https://config.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "config", "region" "us-east-1"},
    :sslCommonName "config.us-east-1.amazonaws.com",
    :endpoint "https://config.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "config", "region" "us-west-1"},
    :sslCommonName "config.us-west-1.amazonaws.com",
    :endpoint "https://config.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "config", "region" "ap-south-1"},
    :sslCommonName "config.ap-south-1.amazonaws.com",
    :endpoint "https://config.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
