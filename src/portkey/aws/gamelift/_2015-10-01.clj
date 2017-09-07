(ns portkey.aws.gamelift.-2015-10-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "gamelift", "region" "ap-northeast-1"},
    :sslCommonName "gamelift.ap-northeast-1.amazonaws.com",
    :endpoint "https://gamelift.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "gamelift", "region" "eu-west-1"},
    :sslCommonName "gamelift.eu-west-1.amazonaws.com",
    :endpoint "https://gamelift.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "gamelift", "region" "us-east-2"},
    :sslCommonName "gamelift.us-east-2.amazonaws.com",
    :endpoint "https://gamelift.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "gamelift", "region" "ap-southeast-2"},
    :sslCommonName "gamelift.ap-southeast-2.amazonaws.com",
    :endpoint "https://gamelift.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "gamelift", "region" "sa-east-1"},
    :sslCommonName "gamelift.sa-east-1.amazonaws.com",
    :endpoint "https://gamelift.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "gamelift", "region" "ap-southeast-1"},
    :sslCommonName "gamelift.ap-southeast-1.amazonaws.com",
    :endpoint "https://gamelift.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "gamelift", "region" "ap-northeast-2"},
    :sslCommonName "gamelift.ap-northeast-2.amazonaws.com",
    :endpoint "https://gamelift.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "gamelift", "region" "ca-central-1"},
    :sslCommonName "gamelift.ca-central-1.amazonaws.com",
    :endpoint "https://gamelift.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "gamelift", "region" "eu-central-1"},
    :sslCommonName "gamelift.eu-central-1.amazonaws.com",
    :endpoint "https://gamelift.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "gamelift", "region" "eu-west-2"},
    :sslCommonName "gamelift.eu-west-2.amazonaws.com",
    :endpoint "https://gamelift.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "gamelift", "region" "us-west-2"},
    :sslCommonName "gamelift.us-west-2.amazonaws.com",
    :endpoint "https://gamelift.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "gamelift", "region" "us-east-1"},
    :sslCommonName "gamelift.us-east-1.amazonaws.com",
    :endpoint "https://gamelift.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "gamelift", "region" "us-west-1"},
    :sslCommonName "gamelift.us-west-1.amazonaws.com",
    :endpoint "https://gamelift.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "gamelift", "region" "ap-south-1"},
    :sslCommonName "gamelift.ap-south-1.amazonaws.com",
    :endpoint "https://gamelift.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
