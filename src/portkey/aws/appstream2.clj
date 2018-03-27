(ns portkey.aws.appstream2 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "appstream", :region "ap-northeast-1"},
    :ssl-common-name "appstream2.ap-northeast-1.amazonaws.com",
    :endpoint "https://appstream2.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "appstream", :region "eu-west-1"},
    :ssl-common-name "appstream2.eu-west-1.amazonaws.com",
    :endpoint "https://appstream2.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "appstream", :region "us-west-2"},
    :ssl-common-name "appstream2.us-west-2.amazonaws.com",
    :endpoint "https://appstream2.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "appstream", :region "us-east-1"},
    :ssl-common-name "appstream2.us-east-1.amazonaws.com",
    :endpoint "https://appstream2.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
