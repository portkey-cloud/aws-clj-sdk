(ns portkey.aws.states.-2016-11-23 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "states", :region "ap-northeast-1"},
    :ssl-common-name "states.ap-northeast-1.amazonaws.com",
    :endpoint "https://states.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "states", :region "eu-west-1"},
    :ssl-common-name "states.eu-west-1.amazonaws.com",
    :endpoint "https://states.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "states", :region "us-east-2"},
    :ssl-common-name "states.us-east-2.amazonaws.com",
    :endpoint "https://states.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "states", :region "ap-southeast-2"},
    :ssl-common-name "states.ap-southeast-2.amazonaws.com",
    :endpoint "https://states.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "states", :region "eu-central-1"},
    :ssl-common-name "states.eu-central-1.amazonaws.com",
    :endpoint "https://states.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "states", :region "eu-west-2"},
    :ssl-common-name "states.eu-west-2.amazonaws.com",
    :endpoint "https://states.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "states", :region "us-west-2"},
    :ssl-common-name "states.us-west-2.amazonaws.com",
    :endpoint "https://states.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "states", :region "us-east-1"},
    :ssl-common-name "states.us-east-1.amazonaws.com",
    :endpoint "https://states.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
