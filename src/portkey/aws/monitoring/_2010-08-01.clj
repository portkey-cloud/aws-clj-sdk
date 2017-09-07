(ns portkey.aws.monitoring.-2010-08-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "monitoring", :region "ap-northeast-1"},
    :ssl-common-name "monitoring.ap-northeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "monitoring", :region "eu-west-1"},
    :ssl-common-name "monitoring.eu-west-1.amazonaws.com",
    :endpoint "https://monitoring.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "monitoring", :region "us-east-2"},
    :ssl-common-name "monitoring.us-east-2.amazonaws.com",
    :endpoint "https://monitoring.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope
    {:service "monitoring", :region "ap-southeast-2"},
    :ssl-common-name "monitoring.ap-southeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope {:service "monitoring", :region "cn-north-1"},
    :ssl-common-name "monitoring.cn-north-1.amazonaws.com.cn",
    :endpoint "https://monitoring.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "monitoring", :region "sa-east-1"},
    :ssl-common-name "monitoring.sa-east-1.amazonaws.com",
    :endpoint "https://monitoring.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope
    {:service "monitoring", :region "ap-southeast-1"},
    :ssl-common-name "monitoring.ap-southeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope
    {:service "monitoring", :region "ap-northeast-2"},
    :ssl-common-name "monitoring.ap-northeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "monitoring", :region "ca-central-1"},
    :ssl-common-name "monitoring.ca-central-1.amazonaws.com",
    :endpoint "https://monitoring.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "monitoring", :region "eu-central-1"},
    :ssl-common-name "monitoring.eu-central-1.amazonaws.com",
    :endpoint "https://monitoring.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "monitoring", :region "eu-west-2"},
    :ssl-common-name "monitoring.eu-west-2.amazonaws.com",
    :endpoint "https://monitoring.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "monitoring", :region "us-gov-west-1"},
    :ssl-common-name "monitoring.us-gov-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "monitoring", :region "us-west-2"},
    :ssl-common-name "monitoring.us-west-2.amazonaws.com",
    :endpoint "https://monitoring.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "monitoring", :region "us-east-1"},
    :ssl-common-name "monitoring.us-east-1.amazonaws.com",
    :endpoint "https://monitoring.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "monitoring", :region "us-west-1"},
    :ssl-common-name "monitoring.us-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "monitoring", :region "ap-south-1"},
    :ssl-common-name "monitoring.ap-south-1.amazonaws.com",
    :endpoint "https://monitoring.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
