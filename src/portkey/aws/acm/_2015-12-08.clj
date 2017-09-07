(ns portkey.aws.acm.-2015-12-08 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "acm", :region "ap-northeast-1"},
    :ssl-common-name "acm.ap-northeast-1.amazonaws.com",
    :endpoint "https://acm.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "acm", :region "eu-west-1"},
    :ssl-common-name "acm.eu-west-1.amazonaws.com",
    :endpoint "https://acm.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "acm", :region "us-east-2"},
    :ssl-common-name "acm.us-east-2.amazonaws.com",
    :endpoint "https://acm.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "acm", :region "ap-southeast-2"},
    :ssl-common-name "acm.ap-southeast-2.amazonaws.com",
    :endpoint "https://acm.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credential-scope {:service "acm", :region "sa-east-1"},
    :ssl-common-name "acm.sa-east-1.amazonaws.com",
    :endpoint "https://acm.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "acm", :region "ap-southeast-1"},
    :ssl-common-name "acm.ap-southeast-1.amazonaws.com",
    :endpoint "https://acm.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "acm", :region "ap-northeast-2"},
    :ssl-common-name "acm.ap-northeast-2.amazonaws.com",
    :endpoint "https://acm.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "acm", :region "ca-central-1"},
    :ssl-common-name "acm.ca-central-1.amazonaws.com",
    :endpoint "https://acm.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "acm", :region "eu-central-1"},
    :ssl-common-name "acm.eu-central-1.amazonaws.com",
    :endpoint "https://acm.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "acm", :region "eu-west-2"},
    :ssl-common-name "acm.eu-west-2.amazonaws.com",
    :endpoint "https://acm.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "acm", :region "us-gov-west-1"},
    :ssl-common-name "acm.us-gov-west-1.amazonaws.com",
    :endpoint "https://acm.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "acm", :region "us-west-2"},
    :ssl-common-name "acm.us-west-2.amazonaws.com",
    :endpoint "https://acm.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "acm", :region "us-east-1"},
    :ssl-common-name "acm.us-east-1.amazonaws.com",
    :endpoint "https://acm.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "acm", :region "us-west-1"},
    :ssl-common-name "acm.us-west-1.amazonaws.com",
    :endpoint "https://acm.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "acm", :region "ap-south-1"},
    :ssl-common-name "acm.ap-south-1.amazonaws.com",
    :endpoint "https://acm.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
