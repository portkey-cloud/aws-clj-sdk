(ns portkey.aws.route53.-2013-04-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"},
   "aws-global"
   {:credentialScope {"service" "route53", "region" "us-east-1"},
    :sslCommonName "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com"}})

(comment TODO support "rest-xml")
