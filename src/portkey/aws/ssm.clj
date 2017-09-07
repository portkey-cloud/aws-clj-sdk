(ns portkey.aws.ssm (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "ssm", "region" "ap-northeast-1"},
    :sslCommonName "ssm.ap-northeast-1.amazonaws.com",
    :endpoint "https://ssm.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "ssm", "region" "eu-west-1"},
    :sslCommonName "ssm.eu-west-1.amazonaws.com",
    :endpoint "https://ssm.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "ssm", "region" "us-east-2"},
    :sslCommonName "ssm.us-east-2.amazonaws.com",
    :endpoint "https://ssm.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "ssm", "region" "ap-southeast-2"},
    :sslCommonName "ssm.ap-southeast-2.amazonaws.com",
    :endpoint "https://ssm.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "ssm", "region" "cn-north-1"},
    :sslCommonName "ssm.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ssm.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "ssm", "region" "sa-east-1"},
    :sslCommonName "ssm.sa-east-1.amazonaws.com",
    :endpoint "https://ssm.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "ssm", "region" "ap-southeast-1"},
    :sslCommonName "ssm.ap-southeast-1.amazonaws.com",
    :endpoint "https://ssm.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "ssm", "region" "ap-northeast-2"},
    :sslCommonName "ssm.ap-northeast-2.amazonaws.com",
    :endpoint "https://ssm.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "ssm", "region" "ca-central-1"},
    :sslCommonName "ssm.ca-central-1.amazonaws.com",
    :endpoint "https://ssm.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "ssm", "region" "eu-central-1"},
    :sslCommonName "ssm.eu-central-1.amazonaws.com",
    :endpoint "https://ssm.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "ssm", "region" "eu-west-2"},
    :sslCommonName "ssm.eu-west-2.amazonaws.com",
    :endpoint "https://ssm.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "ssm", "region" "us-gov-west-1"},
    :sslCommonName "ssm.us-gov-west-1.amazonaws.com",
    :endpoint "https://ssm.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "ssm", "region" "us-west-2"},
    :sslCommonName "ssm.us-west-2.amazonaws.com",
    :endpoint "https://ssm.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "ssm", "region" "us-east-1"},
    :sslCommonName "ssm.us-east-1.amazonaws.com",
    :endpoint "https://ssm.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "ssm", "region" "us-west-1"},
    :sslCommonName "ssm.us-west-1.amazonaws.com",
    :endpoint "https://ssm.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "ssm", "region" "ap-south-1"},
    :sslCommonName "ssm.ap-south-1.amazonaws.com",
    :endpoint "https://ssm.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
