(ns portkey.aws.devicefarm.-2015-06-23 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credentialScope {"service" "devicefarm", "region" "us-west-2"},
    :sslCommonName "devicefarm.us-west-2.amazonaws.com",
    :endpoint "https://devicefarm.us-west-2.amazonaws.com"}})

(comment TODO support "json")
