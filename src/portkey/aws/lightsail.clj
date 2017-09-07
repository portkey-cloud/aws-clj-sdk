(ns portkey.aws.lightsail (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "lightsail", "region" "ap-northeast-1"},
    :sslCommonName "lightsail.ap-northeast-1.amazonaws.com",
    :endpoint "https://lightsail.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "lightsail", "region" "eu-west-1"},
    :sslCommonName "lightsail.eu-west-1.amazonaws.com",
    :endpoint "https://lightsail.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "lightsail", "region" "us-east-2"},
    :sslCommonName "lightsail.us-east-2.amazonaws.com",
    :endpoint "https://lightsail.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "lightsail", "region" "ap-southeast-2"},
    :sslCommonName "lightsail.ap-southeast-2.amazonaws.com",
    :endpoint "https://lightsail.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "lightsail", "region" "ap-southeast-1"},
    :sslCommonName "lightsail.ap-southeast-1.amazonaws.com",
    :endpoint "https://lightsail.ap-southeast-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "lightsail", "region" "eu-central-1"},
    :sslCommonName "lightsail.eu-central-1.amazonaws.com",
    :endpoint "https://lightsail.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "lightsail", "region" "eu-west-2"},
    :sslCommonName "lightsail.eu-west-2.amazonaws.com",
    :endpoint "https://lightsail.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "lightsail", "region" "us-west-2"},
    :sslCommonName "lightsail.us-west-2.amazonaws.com",
    :endpoint "https://lightsail.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "lightsail", "region" "us-east-1"},
    :sslCommonName "lightsail.us-east-1.amazonaws.com",
    :endpoint "https://lightsail.us-east-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "lightsail", "region" "ap-south-1"},
    :sslCommonName "lightsail.ap-south-1.amazonaws.com",
    :endpoint "https://lightsail.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
