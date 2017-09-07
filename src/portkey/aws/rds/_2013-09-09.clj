(ns portkey.aws.rds.-2013-09-09 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "rds", "region" "ap-northeast-1"},
    :sslCommonName "rds.ap-northeast-1.amazonaws.com",
    :endpoint "https://rds.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "rds", "region" "eu-west-1"},
    :sslCommonName "rds.eu-west-1.amazonaws.com",
    :endpoint "https://rds.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "rds", "region" "us-east-2"},
    :sslCommonName "rds.us-east-2.amazonaws.com",
    :endpoint "https://rds.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "rds", "region" "ap-southeast-2"},
    :sslCommonName "rds.ap-southeast-2.amazonaws.com",
    :endpoint "https://rds.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "rds", "region" "cn-north-1"},
    :sslCommonName "rds.cn-north-1.amazonaws.com.cn",
    :endpoint "https://rds.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "rds", "region" "sa-east-1"},
    :sslCommonName "rds.sa-east-1.amazonaws.com",
    :endpoint "https://rds.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "rds", "region" "ap-southeast-1"},
    :sslCommonName "rds.ap-southeast-1.amazonaws.com",
    :endpoint "https://rds.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "rds", "region" "ap-northeast-2"},
    :sslCommonName "rds.ap-northeast-2.amazonaws.com",
    :endpoint "https://rds.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "rds", "region" "ca-central-1"},
    :sslCommonName "rds.ca-central-1.amazonaws.com",
    :endpoint "https://rds.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "rds", "region" "eu-central-1"},
    :sslCommonName "rds.eu-central-1.amazonaws.com",
    :endpoint "https://rds.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "rds", "region" "eu-west-2"},
    :sslCommonName "rds.eu-west-2.amazonaws.com",
    :endpoint "https://rds.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "rds", "region" "us-gov-west-1"},
    :sslCommonName "rds.us-gov-west-1.amazonaws.com",
    :endpoint "https://rds.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "rds", "region" "us-west-2"},
    :sslCommonName "rds.us-west-2.amazonaws.com",
    :endpoint "https://rds.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "rds", "region" "us-east-1"},
    :sslCommonName "rds.amazonaws.com",
    :endpoint "https://rds.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "rds", "region" "us-west-1"},
    :sslCommonName "rds.us-west-1.amazonaws.com",
    :endpoint "https://rds.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "rds", "region" "ap-south-1"},
    :sslCommonName "rds.ap-south-1.amazonaws.com",
    :endpoint "https://rds.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
