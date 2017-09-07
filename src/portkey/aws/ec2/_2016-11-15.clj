(ns portkey.aws.ec2.-2016-11-15 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "ec2", "region" "ap-northeast-1"},
    :sslCommonName "ec2.ap-northeast-1.amazonaws.com",
    :endpoint "https://ec2.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "ec2", "region" "eu-west-1"},
    :sslCommonName "ec2.eu-west-1.amazonaws.com",
    :endpoint "https://ec2.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "ec2", "region" "us-east-2"},
    :sslCommonName "ec2.us-east-2.amazonaws.com",
    :endpoint "https://ec2.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "ec2", "region" "ap-southeast-2"},
    :sslCommonName "ec2.ap-southeast-2.amazonaws.com",
    :endpoint "https://ec2.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "ec2", "region" "cn-north-1"},
    :sslCommonName "ec2.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ec2.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "ec2", "region" "sa-east-1"},
    :sslCommonName "ec2.sa-east-1.amazonaws.com",
    :endpoint "https://ec2.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "ec2", "region" "ap-southeast-1"},
    :sslCommonName "ec2.ap-southeast-1.amazonaws.com",
    :endpoint "https://ec2.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "ec2", "region" "ap-northeast-2"},
    :sslCommonName "ec2.ap-northeast-2.amazonaws.com",
    :endpoint "https://ec2.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "ec2", "region" "ca-central-1"},
    :sslCommonName "ec2.ca-central-1.amazonaws.com",
    :endpoint "https://ec2.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "ec2", "region" "eu-central-1"},
    :sslCommonName "ec2.eu-central-1.amazonaws.com",
    :endpoint "https://ec2.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "ec2", "region" "eu-west-2"},
    :sslCommonName "ec2.eu-west-2.amazonaws.com",
    :endpoint "https://ec2.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "ec2", "region" "us-gov-west-1"},
    :sslCommonName "ec2.us-gov-west-1.amazonaws.com",
    :endpoint "https://ec2.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "ec2", "region" "us-west-2"},
    :sslCommonName "ec2.us-west-2.amazonaws.com",
    :endpoint "https://ec2.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "ec2", "region" "us-east-1"},
    :sslCommonName "ec2.us-east-1.amazonaws.com",
    :endpoint "https://ec2.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "ec2", "region" "us-west-1"},
    :sslCommonName "ec2.us-west-1.amazonaws.com",
    :endpoint "https://ec2.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "ec2", "region" "ap-south-1"},
    :sslCommonName "ec2.ap-south-1.amazonaws.com",
    :endpoint "https://ec2.ap-south-1.amazonaws.com"}})

(comment TODO support "ec2")
