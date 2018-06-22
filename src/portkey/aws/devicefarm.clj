(ns portkey.aws.devicefarm (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "devicefarm", :region "us-west-2"},
    :ssl-common-name "devicefarm.us-west-2.amazonaws.com",
    :endpoint "https://devicefarm.us-west-2.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
