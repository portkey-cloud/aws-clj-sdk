(ns portkey.aws.cloudfront.-2016-08-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"},
   "aws-global"
   {:credentialScope {"service" "cloudfront", "region" "us-east-1"},
    :sslCommonName "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com"}})

(comment TODO support "rest-xml")
