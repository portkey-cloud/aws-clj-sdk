(ns portkey.aws.opsworks (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "opsworks", :region "ap-northeast-1"},
    :ssl-common-name "opsworks.ap-northeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "opsworks", :region "eu-west-1"},
    :ssl-common-name "opsworks.eu-west-1.amazonaws.com",
    :endpoint "https://opsworks.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "opsworks", :region "us-east-2"},
    :ssl-common-name "opsworks.us-east-2.amazonaws.com",
    :endpoint "https://opsworks.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "opsworks", :region "ap-southeast-2"},
    :ssl-common-name "opsworks.ap-southeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credential-scope {:service "opsworks", :region "sa-east-1"},
    :ssl-common-name "opsworks.sa-east-1.amazonaws.com",
    :endpoint "https://opsworks.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "opsworks", :region "ap-southeast-1"},
    :ssl-common-name "opsworks.ap-southeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "opsworks", :region "ap-northeast-2"},
    :ssl-common-name "opsworks.ap-northeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-2.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "opsworks", :region "eu-central-1"},
    :ssl-common-name "opsworks.eu-central-1.amazonaws.com",
    :endpoint "https://opsworks.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "opsworks", :region "eu-west-2"},
    :ssl-common-name "opsworks.eu-west-2.amazonaws.com",
    :endpoint "https://opsworks.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "opsworks", :region "us-west-2"},
    :ssl-common-name "opsworks.us-west-2.amazonaws.com",
    :endpoint "https://opsworks.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "opsworks", :region "us-east-1"},
    :ssl-common-name "opsworks.us-east-1.amazonaws.com",
    :endpoint "https://opsworks.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "opsworks", :region "us-west-1"},
    :ssl-common-name "opsworks.us-west-1.amazonaws.com",
    :endpoint "https://opsworks.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "opsworks", :region "ap-south-1"},
    :ssl-common-name "opsworks.ap-south-1.amazonaws.com",
    :endpoint "https://opsworks.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
