(ns portkey.aws.codedeploy (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "codedeploy", "region" "ap-northeast-1"},
    :sslCommonName "codedeploy.ap-northeast-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "codedeploy", "region" "eu-west-1"},
    :sslCommonName "codedeploy.eu-west-1.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "codedeploy", "region" "us-east-2"},
    :sslCommonName "codedeploy.us-east-2.amazonaws.com",
    :endpoint "https://codedeploy.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "codedeploy", "region" "ap-southeast-2"},
    :sslCommonName "codedeploy.ap-southeast-2.amazonaws.com",
    :endpoint "https://codedeploy.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "codedeploy", "region" "cn-north-1"},
    :sslCommonName "codedeploy.cn-north-1.amazonaws.com.cn",
    :endpoint "https://codedeploy.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "codedeploy", "region" "sa-east-1"},
    :sslCommonName "codedeploy.sa-east-1.amazonaws.com",
    :endpoint "https://codedeploy.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "codedeploy", "region" "ap-southeast-1"},
    :sslCommonName "codedeploy.ap-southeast-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "codedeploy", "region" "ap-northeast-2"},
    :sslCommonName "codedeploy.ap-northeast-2.amazonaws.com",
    :endpoint "https://codedeploy.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "codedeploy", "region" "ca-central-1"},
    :sslCommonName "codedeploy.ca-central-1.amazonaws.com",
    :endpoint "https://codedeploy.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "codedeploy", "region" "eu-central-1"},
    :sslCommonName "codedeploy.eu-central-1.amazonaws.com",
    :endpoint "https://codedeploy.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "codedeploy", "region" "eu-west-2"},
    :sslCommonName "codedeploy.eu-west-2.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope
    {"service" "codedeploy", "region" "us-gov-west-1"},
    :sslCommonName "codedeploy.us-gov-west-1.amazonaws.com",
    :endpoint "https://codedeploy.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "codedeploy", "region" "us-west-2"},
    :sslCommonName "codedeploy.us-west-2.amazonaws.com",
    :endpoint "https://codedeploy.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "codedeploy", "region" "us-east-1"},
    :sslCommonName "codedeploy.us-east-1.amazonaws.com",
    :endpoint "https://codedeploy.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "codedeploy", "region" "us-west-1"},
    :sslCommonName "codedeploy.us-west-1.amazonaws.com",
    :endpoint "https://codedeploy.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "codedeploy", "region" "ap-south-1"},
    :sslCommonName "codedeploy.ap-south-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
