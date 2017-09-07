(ns portkey.aws.organizations (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"},
   "aws-global"
   {:credentialScope {"service" "organizations", "region" "us-east-1"},
    :sslCommonName "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com"}})

(comment TODO support "json")
