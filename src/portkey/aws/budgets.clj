(ns portkey.aws.budgets (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "sa-east-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"},
   "aws-global"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com"}})

(comment TODO support "json")
