(ns portkey.aws.sms.-2016-10-24 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "sms", "region" "ap-northeast-1"},
    :sslCommonName "sms.ap-northeast-1.amazonaws.com",
    :endpoint "https://sms.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "sms", "region" "eu-west-1"},
    :sslCommonName "sms.eu-west-1.amazonaws.com",
    :endpoint "https://sms.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "sms", "region" "us-east-2"},
    :sslCommonName "sms.us-east-2.amazonaws.com",
    :endpoint "https://sms.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "sms", "region" "ap-southeast-2"},
    :sslCommonName "sms.ap-southeast-2.amazonaws.com",
    :endpoint "https://sms.ap-southeast-2.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "sms", "region" "ap-northeast-2"},
    :sslCommonName "sms.ap-northeast-2.amazonaws.com",
    :endpoint "https://sms.ap-northeast-2.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "sms", "region" "eu-central-1"},
    :sslCommonName "sms.eu-central-1.amazonaws.com",
    :endpoint "https://sms.eu-central-1.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "sms", "region" "us-gov-west-1"},
    :sslCommonName "sms.us-gov-west-1.amazonaws.com",
    :endpoint "https://sms.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "sms", "region" "us-west-2"},
    :sslCommonName "sms.us-west-2.amazonaws.com",
    :endpoint "https://sms.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "sms", "region" "us-east-1"},
    :sslCommonName "sms.us-east-1.amazonaws.com",
    :endpoint "https://sms.us-east-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "sms", "region" "ap-south-1"},
    :sslCommonName "sms.ap-south-1.amazonaws.com",
    :endpoint "https://sms.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
