(ns portkey.aws.shield (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credentialScope {"service" "shield", "region" "us-east-1"},
    :sslCommonName "Shield.us-east-1.amazonaws.com",
    :endpoint "https://shield.us-east-1.amazonaws.com"}})

(comment TODO support "json")
