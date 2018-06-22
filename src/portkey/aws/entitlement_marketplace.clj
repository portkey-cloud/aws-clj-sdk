(ns portkey.aws.entitlement-marketplace (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-east-1"},
    :ssl-common-name "entitlement.marketplace.us-east-1.amazonaws.com",
    :endpoint
    "https://entitlement.marketplace.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
