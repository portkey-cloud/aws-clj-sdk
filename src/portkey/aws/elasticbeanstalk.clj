(ns portkey.aws.elasticbeanstalk (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "ap-northeast-1"},
    :sslCommonName "elasticbeanstalk.ap-northeast-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "eu-west-1"},
    :sslCommonName "elasticbeanstalk.eu-west-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "us-east-2"},
    :sslCommonName "elasticbeanstalk.us-east-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "ap-southeast-2"},
    :sslCommonName "elasticbeanstalk.ap-southeast-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "cn-north-1"},
    :sslCommonName "elasticbeanstalk.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticbeanstalk.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "sa-east-1"},
    :sslCommonName "elasticbeanstalk.sa-east-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "ap-southeast-1"},
    :sslCommonName "elasticbeanstalk.ap-southeast-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "ap-northeast-2"},
    :sslCommonName "elasticbeanstalk.ap-northeast-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "ca-central-1"},
    :sslCommonName "elasticbeanstalk.ca-central-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "eu-central-1"},
    :sslCommonName "elasticbeanstalk.eu-central-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "eu-west-2"},
    :sslCommonName "elasticbeanstalk.eu-west-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "us-west-2"},
    :sslCommonName "elasticbeanstalk.us-west-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "us-east-1"},
    :sslCommonName "elasticbeanstalk.us-east-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "us-west-1"},
    :sslCommonName "elasticbeanstalk.us-west-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "elasticbeanstalk", "region" "ap-south-1"},
    :sslCommonName "elasticbeanstalk.ap-south-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
