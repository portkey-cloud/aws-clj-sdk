(ns portkey.aws.iam.-2010-05-08 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "aws-cn-global"
   {:credentialScope {"service" "iam", "region" "cn-north-1"},
    :sslCommonName "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn"},
   "cn-north-1"
   {:credentialScope {"service" "iam", "region" "cn-north-1"},
    :sslCommonName "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "aws-us-gov-global"
   {:credentialScope {"service" "iam", "region" "us-gov-west-1"},
    :sslCommonName "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "iam", "region" "us-gov-west-1"},
    :sslCommonName "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "aws-global"
   {:credentialScope {"service" "iam", "region" "us-east-1"},
    :sslCommonName "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"}})

(comment TODO support "query")
