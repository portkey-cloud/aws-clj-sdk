(ns portkey.aws.events (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "events", "region" "ap-northeast-1"},
    :sslCommonName "events.ap-northeast-1.amazonaws.com",
    :endpoint "https://events.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "events", "region" "eu-west-1"},
    :sslCommonName "events.eu-west-1.amazonaws.com",
    :endpoint "https://events.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "events", "region" "us-east-2"},
    :sslCommonName "events.us-east-2.amazonaws.com",
    :endpoint "https://events.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "events", "region" "ap-southeast-2"},
    :sslCommonName "events.ap-southeast-2.amazonaws.com",
    :endpoint "https://events.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "events", "region" "cn-north-1"},
    :sslCommonName "events.cn-north-1.amazonaws.com.cn",
    :endpoint "https://events.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "events", "region" "sa-east-1"},
    :sslCommonName "events.sa-east-1.amazonaws.com",
    :endpoint "https://events.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "events", "region" "ap-southeast-1"},
    :sslCommonName "events.ap-southeast-1.amazonaws.com",
    :endpoint "https://events.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "events", "region" "ap-northeast-2"},
    :sslCommonName "events.ap-northeast-2.amazonaws.com",
    :endpoint "https://events.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "events", "region" "ca-central-1"},
    :sslCommonName "events.ca-central-1.amazonaws.com",
    :endpoint "https://events.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "events", "region" "eu-central-1"},
    :sslCommonName "events.eu-central-1.amazonaws.com",
    :endpoint "https://events.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "events", "region" "eu-west-2"},
    :sslCommonName "events.eu-west-2.amazonaws.com",
    :endpoint "https://events.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "events", "region" "us-gov-west-1"},
    :sslCommonName "events.us-gov-west-1.amazonaws.com",
    :endpoint "https://events.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "events", "region" "us-west-2"},
    :sslCommonName "events.us-west-2.amazonaws.com",
    :endpoint "https://events.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "events", "region" "us-east-1"},
    :sslCommonName "events.us-east-1.amazonaws.com",
    :endpoint "https://events.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "events", "region" "us-west-1"},
    :sslCommonName "events.us-west-1.amazonaws.com",
    :endpoint "https://events.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "events", "region" "ap-south-1"},
    :sslCommonName "events.ap-south-1.amazonaws.com",
    :endpoint "https://events.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
