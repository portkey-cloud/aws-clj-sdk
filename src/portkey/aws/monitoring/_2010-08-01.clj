(ns portkey.aws.monitoring.-2010-08-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "monitoring", "region" "ap-northeast-1"},
    :sslCommonName "monitoring.ap-northeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "monitoring", "region" "eu-west-1"},
    :sslCommonName "monitoring.eu-west-1.amazonaws.com",
    :endpoint "https://monitoring.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "monitoring", "region" "us-east-2"},
    :sslCommonName "monitoring.us-east-2.amazonaws.com",
    :endpoint "https://monitoring.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "monitoring", "region" "ap-southeast-2"},
    :sslCommonName "monitoring.ap-southeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "monitoring", "region" "cn-north-1"},
    :sslCommonName "monitoring.cn-north-1.amazonaws.com.cn",
    :endpoint "https://monitoring.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "monitoring", "region" "sa-east-1"},
    :sslCommonName "monitoring.sa-east-1.amazonaws.com",
    :endpoint "https://monitoring.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "monitoring", "region" "ap-southeast-1"},
    :sslCommonName "monitoring.ap-southeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "monitoring", "region" "ap-northeast-2"},
    :sslCommonName "monitoring.ap-northeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "monitoring", "region" "ca-central-1"},
    :sslCommonName "monitoring.ca-central-1.amazonaws.com",
    :endpoint "https://monitoring.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "monitoring", "region" "eu-central-1"},
    :sslCommonName "monitoring.eu-central-1.amazonaws.com",
    :endpoint "https://monitoring.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "monitoring", "region" "eu-west-2"},
    :sslCommonName "monitoring.eu-west-2.amazonaws.com",
    :endpoint "https://monitoring.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope
    {"service" "monitoring", "region" "us-gov-west-1"},
    :sslCommonName "monitoring.us-gov-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "monitoring", "region" "us-west-2"},
    :sslCommonName "monitoring.us-west-2.amazonaws.com",
    :endpoint "https://monitoring.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "monitoring", "region" "us-east-1"},
    :sslCommonName "monitoring.us-east-1.amazonaws.com",
    :endpoint "https://monitoring.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "monitoring", "region" "us-west-1"},
    :sslCommonName "monitoring.us-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "monitoring", "region" "ap-south-1"},
    :sslCommonName "monitoring.ap-south-1.amazonaws.com",
    :endpoint "https://monitoring.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
