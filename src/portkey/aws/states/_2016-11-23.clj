(ns portkey.aws.states.-2016-11-23 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "states", "region" "ap-northeast-1"},
    :sslCommonName "states.ap-northeast-1.amazonaws.com",
    :endpoint "https://states.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "states", "region" "eu-west-1"},
    :sslCommonName "states.eu-west-1.amazonaws.com",
    :endpoint "https://states.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "states", "region" "us-east-2"},
    :sslCommonName "states.us-east-2.amazonaws.com",
    :endpoint "https://states.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "states", "region" "ap-southeast-2"},
    :sslCommonName "states.ap-southeast-2.amazonaws.com",
    :endpoint "https://states.ap-southeast-2.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "states", "region" "eu-central-1"},
    :sslCommonName "states.eu-central-1.amazonaws.com",
    :endpoint "https://states.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "states", "region" "eu-west-2"},
    :sslCommonName "states.eu-west-2.amazonaws.com",
    :endpoint "https://states.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "states", "region" "us-west-2"},
    :sslCommonName "states.us-west-2.amazonaws.com",
    :endpoint "https://states.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "states", "region" "us-east-1"},
    :sslCommonName "states.us-east-1.amazonaws.com",
    :endpoint "https://states.us-east-1.amazonaws.com"}})

(comment TODO support "json")
