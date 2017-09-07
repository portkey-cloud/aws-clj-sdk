(ns portkey.aws.elasticloadbalancing.-2012-06-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-1"},
    :ssl-common-name "elasticloadbalancing.eu-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-2"},
    :ssl-common-name "elasticloadbalancing.us-east-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "cn-north-1"},
    :ssl-common-name
    "elasticloadbalancing.cn-north-1.amazonaws.com.cn",
    :endpoint
    "https://elasticloadbalancing.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "sa-east-1"},
    :ssl-common-name "elasticloadbalancing.sa-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ca-central-1"},
    :ssl-common-name "elasticloadbalancing.ca-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-central-1"},
    :ssl-common-name "elasticloadbalancing.eu-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-2"},
    :ssl-common-name "elasticloadbalancing.eu-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-gov-west-1"},
    :ssl-common-name
    "elasticloadbalancing.us-gov-west-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-2"},
    :ssl-common-name "elasticloadbalancing.us-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-1"},
    :ssl-common-name "elasticloadbalancing.us-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-1"},
    :ssl-common-name "elasticloadbalancing.us-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-south-1"},
    :ssl-common-name "elasticloadbalancing.ap-south-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
