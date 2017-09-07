(ns portkey.aws.opsworks.-2013-02-18 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "opsworks", "region" "ap-northeast-1"},
    :sslCommonName "opsworks.ap-northeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "opsworks", "region" "eu-west-1"},
    :sslCommonName "opsworks.eu-west-1.amazonaws.com",
    :endpoint "https://opsworks.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "opsworks", "region" "us-east-2"},
    :sslCommonName "opsworks.us-east-2.amazonaws.com",
    :endpoint "https://opsworks.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "opsworks", "region" "ap-southeast-2"},
    :sslCommonName "opsworks.ap-southeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "opsworks", "region" "sa-east-1"},
    :sslCommonName "opsworks.sa-east-1.amazonaws.com",
    :endpoint "https://opsworks.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "opsworks", "region" "ap-southeast-1"},
    :sslCommonName "opsworks.ap-southeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "opsworks", "region" "ap-northeast-2"},
    :sslCommonName "opsworks.ap-northeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-2.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "opsworks", "region" "eu-central-1"},
    :sslCommonName "opsworks.eu-central-1.amazonaws.com",
    :endpoint "https://opsworks.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "opsworks", "region" "eu-west-2"},
    :sslCommonName "opsworks.eu-west-2.amazonaws.com",
    :endpoint "https://opsworks.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "opsworks", "region" "us-west-2"},
    :sslCommonName "opsworks.us-west-2.amazonaws.com",
    :endpoint "https://opsworks.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "opsworks", "region" "us-east-1"},
    :sslCommonName "opsworks.us-east-1.amazonaws.com",
    :endpoint "https://opsworks.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "opsworks", "region" "us-west-1"},
    :sslCommonName "opsworks.us-west-1.amazonaws.com",
    :endpoint "https://opsworks.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "opsworks", "region" "ap-south-1"},
    :sslCommonName "opsworks.ap-south-1.amazonaws.com",
    :endpoint "https://opsworks.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
