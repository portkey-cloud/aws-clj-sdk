(ns portkey.aws.health (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "health", :region "us-east-1"},
    :ssl-common-name "health.us-east-1.amazonaws.com",
    :endpoint "https://health.us-east-1.amazonaws.com"}})

(comment TODO support "json")
