(ns portkey.aws.servicecatalog.-2015-12-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "servicecatalog", :region "ap-northeast-1"},
    :ssl-common-name "servicecatalog.ap-northeast-1.amazonaws.com",
    :endpoint "https://servicecatalog.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "servicecatalog", :region "eu-west-1"},
    :ssl-common-name "servicecatalog.eu-west-1.amazonaws.com",
    :endpoint "https://servicecatalog.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "servicecatalog", :region "us-east-2"},
    :ssl-common-name "servicecatalog.us-east-2.amazonaws.com",
    :endpoint "https://servicecatalog.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope
    {:service "servicecatalog", :region "ap-southeast-2"},
    :ssl-common-name "servicecatalog.ap-southeast-2.amazonaws.com",
    :endpoint "https://servicecatalog.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope
    {:service "servicecatalog", :region "ap-southeast-1"},
    :ssl-common-name "servicecatalog.ap-southeast-1.amazonaws.com",
    :endpoint "https://servicecatalog.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope
    {:service "servicecatalog", :region "ap-northeast-2"},
    :ssl-common-name "servicecatalog.ap-northeast-2.amazonaws.com",
    :endpoint "https://servicecatalog.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope
    {:service "servicecatalog", :region "ca-central-1"},
    :ssl-common-name "servicecatalog.ca-central-1.amazonaws.com",
    :endpoint "https://servicecatalog.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope
    {:service "servicecatalog", :region "eu-central-1"},
    :ssl-common-name "servicecatalog.eu-central-1.amazonaws.com",
    :endpoint "https://servicecatalog.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "servicecatalog", :region "eu-west-2"},
    :ssl-common-name "servicecatalog.eu-west-2.amazonaws.com",
    :endpoint "https://servicecatalog.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "servicecatalog", :region "us-west-2"},
    :ssl-common-name "servicecatalog.us-west-2.amazonaws.com",
    :endpoint "https://servicecatalog.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "servicecatalog", :region "us-east-1"},
    :ssl-common-name "servicecatalog.us-east-1.amazonaws.com",
    :endpoint "https://servicecatalog.us-east-1.amazonaws.com"}})

(comment TODO support "json")
