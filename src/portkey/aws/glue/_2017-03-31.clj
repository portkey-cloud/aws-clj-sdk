(ns portkey.aws.glue.-2017-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credentialScope {"service" "glue", "region" "us-east-1"},
    :sslCommonName "glue.us-east-1.amazonaws.com",
    :endpoint "https://glue.us-east-1.amazonaws.com"}})

(comment TODO support "json")
