(ns portkey.aws.storagegateway (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-northeast-1"},
    :ssl-common-name "storagegateway.ap-northeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "storagegateway", :region "eu-west-1"},
    :ssl-common-name "storagegateway.eu-west-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "storagegateway", :region "us-east-2"},
    :ssl-common-name "storagegateway.us-east-2.amazonaws.com",
    :endpoint "https://storagegateway.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope
    {:service "storagegateway", :region "ap-southeast-2"},
    :ssl-common-name "storagegateway.ap-southeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope
    {:service "storagegateway", :region "cn-north-1"},
    :ssl-common-name "storagegateway.cn-north-1.amazonaws.com.cn",
    :endpoint "https://storagegateway.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "storagegateway", :region "sa-east-1"},
    :ssl-common-name "storagegateway.sa-east-1.amazonaws.com",
    :endpoint "https://storagegateway.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-southeast-1"},
    :ssl-common-name "storagegateway.ap-southeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope
    {:service "storagegateway", :region "ap-northeast-2"},
    :ssl-common-name "storagegateway.ap-northeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope
    {:service "storagegateway", :region "ca-central-1"},
    :ssl-common-name "storagegateway.ca-central-1.amazonaws.com",
    :endpoint "https://storagegateway.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope
    {:service "storagegateway", :region "eu-central-1"},
    :ssl-common-name "storagegateway.eu-central-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "storagegateway", :region "eu-west-2"},
    :ssl-common-name "storagegateway.eu-west-2.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "storagegateway", :region "us-west-2"},
    :ssl-common-name "storagegateway.us-west-2.amazonaws.com",
    :endpoint "https://storagegateway.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "storagegateway", :region "us-east-1"},
    :ssl-common-name "storagegateway.us-east-1.amazonaws.com",
    :endpoint "https://storagegateway.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "storagegateway", :region "us-west-1"},
    :ssl-common-name "storagegateway.us-west-1.amazonaws.com",
    :endpoint "https://storagegateway.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-south-1"},
    :ssl-common-name "storagegateway.ap-south-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
