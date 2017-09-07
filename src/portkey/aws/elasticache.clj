(ns portkey.aws.elasticache (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticache", :region "ap-northeast-1"},
    :ssl-common-name "elasticache.ap-northeast-1.amazonaws.com",
    :endpoint "https://elasticache.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "elasticache", :region "eu-west-1"},
    :ssl-common-name "elasticache.eu-west-1.amazonaws.com",
    :endpoint "https://elasticache.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "elasticache", :region "us-east-2"},
    :ssl-common-name "elasticache.us-east-2.amazonaws.com",
    :endpoint "https://elasticache.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticache", :region "ap-southeast-2"},
    :ssl-common-name "elasticache.ap-southeast-2.amazonaws.com",
    :endpoint "https://elasticache.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope {:service "elasticache", :region "cn-north-1"},
    :ssl-common-name "elasticache.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticache.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "elasticache", :region "sa-east-1"},
    :ssl-common-name "elasticache.sa-east-1.amazonaws.com",
    :endpoint "https://elasticache.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticache", :region "ap-southeast-1"},
    :ssl-common-name "elasticache.ap-southeast-1.amazonaws.com",
    :endpoint "https://elasticache.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticache", :region "ap-northeast-2"},
    :ssl-common-name "elasticache.ap-northeast-2.amazonaws.com",
    :endpoint "https://elasticache.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "elasticache", :region "ca-central-1"},
    :ssl-common-name "elasticache.ca-central-1.amazonaws.com",
    :endpoint "https://elasticache.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "elasticache", :region "eu-central-1"},
    :ssl-common-name "elasticache.eu-central-1.amazonaws.com",
    :endpoint "https://elasticache.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "elasticache", :region "eu-west-2"},
    :ssl-common-name "elasticache.eu-west-2.amazonaws.com",
    :endpoint "https://elasticache.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticache", :region "us-gov-west-1"},
    :ssl-common-name "elasticache.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticache.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "elasticache", :region "us-west-2"},
    :ssl-common-name "elasticache.us-west-2.amazonaws.com",
    :endpoint "https://elasticache.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "elasticache", :region "us-east-1"},
    :ssl-common-name "elasticache.us-east-1.amazonaws.com",
    :endpoint "https://elasticache.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "elasticache", :region "us-west-1"},
    :ssl-common-name "elasticache.us-west-1.amazonaws.com",
    :endpoint "https://elasticache.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "elasticache", :region "ap-south-1"},
    :ssl-common-name "elasticache.ap-south-1.amazonaws.com",
    :endpoint "https://elasticache.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
