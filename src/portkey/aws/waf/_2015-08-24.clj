(ns portkey.aws.waf.-2015-08-24 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "sa-east-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"},
   "aws-global"
   {:credential-scope {:service "waf", :region "us-east-1"},
    :ssl-common-name "waf.amazonaws.com",
    :endpoint "https://waf.amazonaws.com"}})

(comment TODO support "json")
