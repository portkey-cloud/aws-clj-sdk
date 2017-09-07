(ns portkey.aws.waf-regional (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "waf-regional", :region "ap-northeast-1"},
    :ssl-common-name "waf-regional.ap-northeast-1.amazonaws.com",
    :endpoint "https://waf-regional.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "waf-regional", :region "eu-west-1"},
    :ssl-common-name "waf-regional.eu-west-1.amazonaws.com",
    :endpoint "https://waf-regional.eu-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "waf-regional", :region "us-west-2"},
    :ssl-common-name "waf-regional.us-west-2.amazonaws.com",
    :endpoint "https://waf-regional.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "waf-regional", :region "us-east-1"},
    :ssl-common-name "waf-regional.us-east-1.amazonaws.com",
    :endpoint "https://waf-regional.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "waf-regional", :region "us-west-1"},
    :ssl-common-name "waf-regional.us-west-1.amazonaws.com",
    :endpoint "https://waf-regional.us-west-1.amazonaws.com"}})

(comment TODO support "json")
