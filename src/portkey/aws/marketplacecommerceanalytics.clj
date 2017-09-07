(ns portkey.aws.marketplacecommerceanalytics (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credentialScope
    {"service" "marketplacecommerceanalytics", "region" "us-east-1"},
    :sslCommonName
    "marketplacecommerceanalytics.us-east-1.amazonaws.com",
    :endpoint
    "https://marketplacecommerceanalytics.us-east-1.amazonaws.com"}})

(comment TODO support "json")
