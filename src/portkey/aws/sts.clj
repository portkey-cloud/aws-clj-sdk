(ns portkey.aws.sts (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credentialScope {"service" "sts", "region" "us-west-1"},
    :sslCommonName "sts-fips.us-west-1.amazonaws.com",
    :endpoint "https://sts-fips.us-west-1.amazonaws.com"},
   "ap-northeast-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "sts", "region" "cn-north-1"},
    :sslCommonName "sts.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sts.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "sts", "region" "ap-northeast-2"},
    :sslCommonName "sts.ap-northeast-2.amazonaws.com",
    :endpoint "https://sts.ap-northeast-2.amazonaws.com"},
   "us-east-2-fips"
   {:credentialScope {"service" "sts", "region" "us-east-2"},
    :sslCommonName "sts-fips.us-east-2.amazonaws.com",
    :endpoint "https://sts-fips.us-east-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "sts", "region" "us-gov-west-1"},
    :sslCommonName "sts.us-gov-west-1.amazonaws.com",
    :endpoint "https://sts.us-gov-west-1.amazonaws.com"},
   "us-east-1-fips"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts-fips.us-east-1.amazonaws.com",
    :endpoint "https://sts-fips.us-east-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "us-west-2-fips"
   {:credentialScope {"service" "sts", "region" "us-west-2"},
    :sslCommonName "sts-fips.us-west-2.amazonaws.com",
    :endpoint "https://sts-fips.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"},
   "aws-global"
   {:credentialScope {"service" "sts", "region" "us-east-1"},
    :sslCommonName "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com"}})

(comment TODO support "query")
