(ns portkey.aws.glue (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "glue", :region "us-east-1"},
    :ssl-common-name "glue.us-east-1.amazonaws.com",
    :endpoint "https://glue.us-east-1.amazonaws.com"}})

(comment TODO support "json")
