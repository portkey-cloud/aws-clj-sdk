(ns portkey.aws.cognito-idp.-2016-04-18 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "cognito-idp", "region" "ap-northeast-1"},
    :sslCommonName "cognito-idp.ap-northeast-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "cognito-idp", "region" "eu-west-1"},
    :sslCommonName "cognito-idp.eu-west-1.amazonaws.com",
    :endpoint "https://cognito-idp.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "cognito-idp", "region" "us-east-2"},
    :sslCommonName "cognito-idp.us-east-2.amazonaws.com",
    :endpoint "https://cognito-idp.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "cognito-idp", "region" "ap-southeast-2"},
    :sslCommonName "cognito-idp.ap-southeast-2.amazonaws.com",
    :endpoint "https://cognito-idp.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "cognito-idp", "region" "ap-southeast-1"},
    :sslCommonName "cognito-idp.ap-southeast-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "cognito-idp", "region" "ap-northeast-2"},
    :sslCommonName "cognito-idp.ap-northeast-2.amazonaws.com",
    :endpoint "https://cognito-idp.ap-northeast-2.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "cognito-idp", "region" "eu-central-1"},
    :sslCommonName "cognito-idp.eu-central-1.amazonaws.com",
    :endpoint "https://cognito-idp.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "cognito-idp", "region" "eu-west-2"},
    :sslCommonName "cognito-idp.eu-west-2.amazonaws.com",
    :endpoint "https://cognito-idp.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "cognito-idp", "region" "us-west-2"},
    :sslCommonName "cognito-idp.us-west-2.amazonaws.com",
    :endpoint "https://cognito-idp.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "cognito-idp", "region" "us-east-1"},
    :sslCommonName "cognito-idp.us-east-1.amazonaws.com",
    :endpoint "https://cognito-idp.us-east-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "cognito-idp", "region" "ap-south-1"},
    :sslCommonName "cognito-idp.ap-south-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
