(ns portkey.aws.ecr (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "ecr", "region" "ap-northeast-1"},
    :sslCommonName "ecr.ap-northeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "ecr", "region" "eu-west-1"},
    :sslCommonName "ecr.eu-west-1.amazonaws.com",
    :endpoint "https://ecr.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "ecr", "region" "us-east-2"},
    :sslCommonName "ecr.us-east-2.amazonaws.com",
    :endpoint "https://ecr.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "ecr", "region" "ap-southeast-2"},
    :sslCommonName "ecr.ap-southeast-2.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "ecr", "region" "cn-north-1"},
    :sslCommonName "ecr.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ecr.cn-north-1.amazonaws.com.cn"},
   "ap-southeast-1"
   {:credentialScope {"service" "ecr", "region" "ap-southeast-1"},
    :sslCommonName "ecr.ap-southeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-1.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "ecr", "region" "ca-central-1"},
    :sslCommonName "ecr.ca-central-1.amazonaws.com",
    :endpoint "https://ecr.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "ecr", "region" "eu-central-1"},
    :sslCommonName "ecr.eu-central-1.amazonaws.com",
    :endpoint "https://ecr.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "ecr", "region" "eu-west-2"},
    :sslCommonName "ecr.eu-west-2.amazonaws.com",
    :endpoint "https://ecr.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "ecr", "region" "us-west-2"},
    :sslCommonName "ecr.us-west-2.amazonaws.com",
    :endpoint "https://ecr.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "ecr", "region" "us-east-1"},
    :sslCommonName "ecr.us-east-1.amazonaws.com",
    :endpoint "https://ecr.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "ecr", "region" "us-west-1"},
    :sslCommonName "ecr.us-west-1.amazonaws.com",
    :endpoint "https://ecr.us-west-1.amazonaws.com"}})

(comment TODO support "json")
