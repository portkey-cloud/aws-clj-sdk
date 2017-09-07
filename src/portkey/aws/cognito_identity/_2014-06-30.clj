(ns portkey.aws.cognito-identity.-2014-06-30 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "cognito-identity", "region" "ap-northeast-1"},
    :sslCommonName "cognito-identity.ap-northeast-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "cognito-identity", "region" "eu-west-1"},
    :sslCommonName "cognito-identity.eu-west-1.amazonaws.com",
    :endpoint "https://cognito-identity.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "cognito-identity", "region" "us-east-2"},
    :sslCommonName "cognito-identity.us-east-2.amazonaws.com",
    :endpoint "https://cognito-identity.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "cognito-identity", "region" "ap-southeast-2"},
    :sslCommonName "cognito-identity.ap-southeast-2.amazonaws.com",
    :endpoint "https://cognito-identity.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "cognito-identity", "region" "ap-southeast-1"},
    :sslCommonName "cognito-identity.ap-southeast-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "cognito-identity", "region" "ap-northeast-2"},
    :sslCommonName "cognito-identity.ap-northeast-2.amazonaws.com",
    :endpoint "https://cognito-identity.ap-northeast-2.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "cognito-identity", "region" "eu-central-1"},
    :sslCommonName "cognito-identity.eu-central-1.amazonaws.com",
    :endpoint "https://cognito-identity.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "cognito-identity", "region" "eu-west-2"},
    :sslCommonName "cognito-identity.eu-west-2.amazonaws.com",
    :endpoint "https://cognito-identity.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "cognito-identity", "region" "us-west-2"},
    :sslCommonName "cognito-identity.us-west-2.amazonaws.com",
    :endpoint "https://cognito-identity.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "cognito-identity", "region" "us-east-1"},
    :sslCommonName "cognito-identity.us-east-1.amazonaws.com",
    :endpoint "https://cognito-identity.us-east-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "cognito-identity", "region" "ap-south-1"},
    :sslCommonName "cognito-identity.ap-south-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
