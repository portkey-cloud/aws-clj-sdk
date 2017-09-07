(ns portkey.aws.servicecatalog (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "servicecatalog", "region" "ap-northeast-1"},
    :sslCommonName "servicecatalog.ap-northeast-1.amazonaws.com",
    :endpoint "https://servicecatalog.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "servicecatalog", "region" "eu-west-1"},
    :sslCommonName "servicecatalog.eu-west-1.amazonaws.com",
    :endpoint "https://servicecatalog.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "servicecatalog", "region" "us-east-2"},
    :sslCommonName "servicecatalog.us-east-2.amazonaws.com",
    :endpoint "https://servicecatalog.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "servicecatalog", "region" "ap-southeast-2"},
    :sslCommonName "servicecatalog.ap-southeast-2.amazonaws.com",
    :endpoint "https://servicecatalog.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "servicecatalog", "region" "ap-southeast-1"},
    :sslCommonName "servicecatalog.ap-southeast-1.amazonaws.com",
    :endpoint "https://servicecatalog.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "servicecatalog", "region" "ap-northeast-2"},
    :sslCommonName "servicecatalog.ap-northeast-2.amazonaws.com",
    :endpoint "https://servicecatalog.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "servicecatalog", "region" "ca-central-1"},
    :sslCommonName "servicecatalog.ca-central-1.amazonaws.com",
    :endpoint "https://servicecatalog.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "servicecatalog", "region" "eu-central-1"},
    :sslCommonName "servicecatalog.eu-central-1.amazonaws.com",
    :endpoint "https://servicecatalog.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "servicecatalog", "region" "eu-west-2"},
    :sslCommonName "servicecatalog.eu-west-2.amazonaws.com",
    :endpoint "https://servicecatalog.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "servicecatalog", "region" "us-west-2"},
    :sslCommonName "servicecatalog.us-west-2.amazonaws.com",
    :endpoint "https://servicecatalog.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "servicecatalog", "region" "us-east-1"},
    :sslCommonName "servicecatalog.us-east-1.amazonaws.com",
    :endpoint "https://servicecatalog.us-east-1.amazonaws.com"}})

(comment TODO support "json")
