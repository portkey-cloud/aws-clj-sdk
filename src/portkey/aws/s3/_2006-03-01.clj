(ns portkey.aws.s3.-2006-03-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "s3", "region" "ap-northeast-1"},
    :sslCommonName "s3-ap-northeast-1.amazonaws.com",
    :endpoint "https://s3-ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "s3", "region" "eu-west-1"},
    :sslCommonName "s3-eu-west-1.amazonaws.com",
    :endpoint "https://s3-eu-west-1.amazonaws.com"},
   "fips-us-gov-west-1"
   {:credentialScope {"service" "s3", "region" "us-gov-west-1"},
    :sslCommonName "s3-fips-us-gov-west-1.amazonaws.com",
    :endpoint "https://s3-fips-us-gov-west-1.amazonaws.com"},
   "s3-external-1"
   {:credentialScope {"service" "s3", "region" "us-east-1"},
    :sslCommonName "s3-external-1.amazonaws.com",
    :endpoint "https://s3-external-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "s3", "region" "us-east-2"},
    :sslCommonName "s3.us-east-2.amazonaws.com",
    :endpoint "https://s3.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "s3", "region" "ap-southeast-2"},
    :sslCommonName "s3-ap-southeast-2.amazonaws.com",
    :endpoint "https://s3-ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "s3", "region" "cn-north-1"},
    :sslCommonName "s3.cn-north-1.amazonaws.com.cn",
    :endpoint "https://s3.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "s3", "region" "sa-east-1"},
    :sslCommonName "s3-sa-east-1.amazonaws.com",
    :endpoint "https://s3-sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "s3", "region" "ap-southeast-1"},
    :sslCommonName "s3-ap-southeast-1.amazonaws.com",
    :endpoint "https://s3-ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "s3", "region" "ap-northeast-2"},
    :sslCommonName "s3.ap-northeast-2.amazonaws.com",
    :endpoint "https://s3.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "s3", "region" "ca-central-1"},
    :sslCommonName "s3.ca-central-1.amazonaws.com",
    :endpoint "https://s3.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "s3", "region" "eu-central-1"},
    :sslCommonName "s3.eu-central-1.amazonaws.com",
    :endpoint "https://s3.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "s3", "region" "eu-west-2"},
    :sslCommonName "s3.eu-west-2.amazonaws.com",
    :endpoint "https://s3.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "s3", "region" "us-gov-west-1"},
    :sslCommonName "s3-us-gov-west-1.amazonaws.com",
    :endpoint "https://s3-us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "s3", "region" "us-west-2"},
    :sslCommonName "s3-us-west-2.amazonaws.com",
    :endpoint "https://s3-us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "s3", "region" "us-east-1"},
    :sslCommonName "s3.amazonaws.com",
    :endpoint "https://s3.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "s3", "region" "us-west-1"},
    :sslCommonName "s3-us-west-1.amazonaws.com",
    :endpoint "https://s3-us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "s3", "region" "ap-south-1"},
    :sslCommonName "s3.ap-south-1.amazonaws.com",
    :endpoint "https://s3.ap-south-1.amazonaws.com"}})

(comment TODO support "rest-xml")
