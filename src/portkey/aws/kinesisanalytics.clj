(ns portkey.aws.kinesisanalytics (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope
    {"service" "kinesisanalytics", "region" "eu-west-1"},
    :sslCommonName "kinesisanalytics.eu-west-1.amazonaws.com",
    :endpoint "https://kinesisanalytics.eu-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "kinesisanalytics", "region" "us-west-2"},
    :sslCommonName "kinesisanalytics.us-west-2.amazonaws.com",
    :endpoint "https://kinesisanalytics.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "kinesisanalytics", "region" "us-east-1"},
    :sslCommonName "kinesisanalytics.us-east-1.amazonaws.com",
    :endpoint "https://kinesisanalytics.us-east-1.amazonaws.com"}})

(comment TODO support "json")
