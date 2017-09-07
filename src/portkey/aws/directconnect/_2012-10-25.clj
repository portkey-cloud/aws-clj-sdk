(ns portkey.aws.directconnect.-2012-10-25 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "directconnect", "region" "ap-northeast-1"},
    :sslCommonName "directconnect.ap-northeast-1.amazonaws.com",
    :endpoint "https://directconnect.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "directconnect", "region" "eu-west-1"},
    :sslCommonName "directconnect.eu-west-1.amazonaws.com",
    :endpoint "https://directconnect.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "directconnect", "region" "us-east-2"},
    :sslCommonName "directconnect.us-east-2.amazonaws.com",
    :endpoint "https://directconnect.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "directconnect", "region" "ap-southeast-2"},
    :sslCommonName "directconnect.ap-southeast-2.amazonaws.com",
    :endpoint "https://directconnect.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope
    {"service" "directconnect", "region" "cn-north-1"},
    :sslCommonName "directconnect.cn-north-1.amazonaws.com.cn",
    :endpoint "https://directconnect.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "directconnect", "region" "sa-east-1"},
    :sslCommonName "directconnect.sa-east-1.amazonaws.com",
    :endpoint "https://directconnect.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "directconnect", "region" "ap-southeast-1"},
    :sslCommonName "directconnect.ap-southeast-1.amazonaws.com",
    :endpoint "https://directconnect.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "directconnect", "region" "ap-northeast-2"},
    :sslCommonName "directconnect.ap-northeast-2.amazonaws.com",
    :endpoint "https://directconnect.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "directconnect", "region" "ca-central-1"},
    :sslCommonName "directconnect.ca-central-1.amazonaws.com",
    :endpoint "https://directconnect.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "directconnect", "region" "eu-central-1"},
    :sslCommonName "directconnect.eu-central-1.amazonaws.com",
    :endpoint "https://directconnect.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "directconnect", "region" "eu-west-2"},
    :sslCommonName "directconnect.eu-west-2.amazonaws.com",
    :endpoint "https://directconnect.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope
    {"service" "directconnect", "region" "us-gov-west-1"},
    :sslCommonName "directconnect.us-gov-west-1.amazonaws.com",
    :endpoint "https://directconnect.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "directconnect", "region" "us-west-2"},
    :sslCommonName "directconnect.us-west-2.amazonaws.com",
    :endpoint "https://directconnect.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "directconnect", "region" "us-east-1"},
    :sslCommonName "directconnect.us-east-1.amazonaws.com",
    :endpoint "https://directconnect.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "directconnect", "region" "us-west-1"},
    :sslCommonName "directconnect.us-west-1.amazonaws.com",
    :endpoint "https://directconnect.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "directconnect", "region" "ap-south-1"},
    :sslCommonName "directconnect.ap-south-1.amazonaws.com",
    :endpoint "https://directconnect.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
