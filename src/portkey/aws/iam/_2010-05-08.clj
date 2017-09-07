(ns portkey.aws.iam.-2010-05-08 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "aws-cn-global"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn"},
   "cn-north-1"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "aws-us-gov-global"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"},
   "aws-global"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com"}})

(comment TODO support "query")
