(ns portkey.aws.mgh (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "mgh", :region "us-west-2"},
    :ssl-common-name "mgh.us-west-2.amazonaws.com",
    :endpoint "https://mgh.us-west-2.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
