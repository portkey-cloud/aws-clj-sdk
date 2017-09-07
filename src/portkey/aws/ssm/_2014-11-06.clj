(ns portkey.aws.ssm.-2014-11-06 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ssm", :region "ap-northeast-1"},
    :ssl-common-name "ssm.ap-northeast-1.amazonaws.com",
    :endpoint "https://ssm.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "ssm", :region "eu-west-1"},
    :ssl-common-name "ssm.eu-west-1.amazonaws.com",
    :endpoint "https://ssm.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "ssm", :region "us-east-2"},
    :ssl-common-name "ssm.us-east-2.amazonaws.com",
    :endpoint "https://ssm.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "ssm", :region "ap-southeast-2"},
    :ssl-common-name "ssm.ap-southeast-2.amazonaws.com",
    :endpoint "https://ssm.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope {:service "ssm", :region "cn-north-1"},
    :ssl-common-name "ssm.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ssm.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "ssm", :region "sa-east-1"},
    :ssl-common-name "ssm.sa-east-1.amazonaws.com",
    :endpoint "https://ssm.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "ssm", :region "ap-southeast-1"},
    :ssl-common-name "ssm.ap-southeast-1.amazonaws.com",
    :endpoint "https://ssm.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "ssm", :region "ap-northeast-2"},
    :ssl-common-name "ssm.ap-northeast-2.amazonaws.com",
    :endpoint "https://ssm.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "ssm", :region "ca-central-1"},
    :ssl-common-name "ssm.ca-central-1.amazonaws.com",
    :endpoint "https://ssm.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "ssm", :region "eu-central-1"},
    :ssl-common-name "ssm.eu-central-1.amazonaws.com",
    :endpoint "https://ssm.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "ssm", :region "eu-west-2"},
    :ssl-common-name "ssm.eu-west-2.amazonaws.com",
    :endpoint "https://ssm.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "ssm", :region "us-gov-west-1"},
    :ssl-common-name "ssm.us-gov-west-1.amazonaws.com",
    :endpoint "https://ssm.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "ssm", :region "us-west-2"},
    :ssl-common-name "ssm.us-west-2.amazonaws.com",
    :endpoint "https://ssm.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "ssm", :region "us-east-1"},
    :ssl-common-name "ssm.us-east-1.amazonaws.com",
    :endpoint "https://ssm.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "ssm", :region "us-west-1"},
    :ssl-common-name "ssm.us-west-1.amazonaws.com",
    :endpoint "https://ssm.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "ssm", :region "ap-south-1"},
    :ssl-common-name "ssm.ap-south-1.amazonaws.com",
    :endpoint "https://ssm.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
