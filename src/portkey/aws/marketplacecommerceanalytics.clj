(ns portkey.aws.marketplacecommerceanalytics (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope
    {:service "marketplacecommerceanalytics", :region "us-east-1"},
    :ssl-common-name
    "marketplacecommerceanalytics.us-east-1.amazonaws.com",
    :endpoint
    "https://marketplacecommerceanalytics.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
