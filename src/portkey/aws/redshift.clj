(ns portkey.aws.redshift (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "redshift", :region "ap-northeast-1"},
    :ssl-common-name "redshift.ap-northeast-1.amazonaws.com",
    :endpoint "https://redshift.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "redshift", :region "eu-west-1"},
    :ssl-common-name "redshift.eu-west-1.amazonaws.com",
    :endpoint "https://redshift.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "redshift", :region "us-east-2"},
    :ssl-common-name "redshift.us-east-2.amazonaws.com",
    :endpoint "https://redshift.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "redshift", :region "ap-southeast-2"},
    :ssl-common-name "redshift.ap-southeast-2.amazonaws.com",
    :endpoint "https://redshift.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope {:service "redshift", :region "cn-north-1"},
    :ssl-common-name "redshift.cn-north-1.amazonaws.com.cn",
    :endpoint "https://redshift.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "redshift", :region "sa-east-1"},
    :ssl-common-name "redshift.sa-east-1.amazonaws.com",
    :endpoint "https://redshift.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "redshift", :region "ap-southeast-1"},
    :ssl-common-name "redshift.ap-southeast-1.amazonaws.com",
    :endpoint "https://redshift.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "redshift", :region "ap-northeast-2"},
    :ssl-common-name "redshift.ap-northeast-2.amazonaws.com",
    :endpoint "https://redshift.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "redshift", :region "ca-central-1"},
    :ssl-common-name "redshift.ca-central-1.amazonaws.com",
    :endpoint "https://redshift.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "redshift", :region "eu-central-1"},
    :ssl-common-name "redshift.eu-central-1.amazonaws.com",
    :endpoint "https://redshift.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "redshift", :region "eu-west-2"},
    :ssl-common-name "redshift.eu-west-2.amazonaws.com",
    :endpoint "https://redshift.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "redshift", :region "us-gov-west-1"},
    :ssl-common-name "redshift.us-gov-west-1.amazonaws.com",
    :endpoint "https://redshift.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "redshift", :region "us-west-2"},
    :ssl-common-name "redshift.us-west-2.amazonaws.com",
    :endpoint "https://redshift.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "redshift", :region "us-east-1"},
    :ssl-common-name "redshift.us-east-1.amazonaws.com",
    :endpoint "https://redshift.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "redshift", :region "us-west-1"},
    :ssl-common-name "redshift.us-west-1.amazonaws.com",
    :endpoint "https://redshift.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "redshift", :region "ap-south-1"},
    :ssl-common-name "redshift.ap-south-1.amazonaws.com",
    :endpoint "https://redshift.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
