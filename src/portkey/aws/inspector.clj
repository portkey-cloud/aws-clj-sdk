(ns portkey.aws.inspector (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "inspector", :region "ap-northeast-1"},
    :ssl-common-name "inspector.ap-northeast-1.amazonaws.com",
    :endpoint "https://inspector.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "inspector", :region "eu-west-1"},
    :ssl-common-name "inspector.eu-west-1.amazonaws.com",
    :endpoint "https://inspector.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "inspector", :region "us-east-2"},
    :ssl-common-name "inspector.us-east-2.amazonaws.com",
    :endpoint "https://inspector.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "inspector", :region "ap-southeast-2"},
    :ssl-common-name "inspector.ap-southeast-2.amazonaws.com",
    :endpoint "https://inspector.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "inspector", :region "ap-northeast-2"},
    :ssl-common-name "inspector.ap-northeast-2.amazonaws.com",
    :endpoint "https://inspector.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "inspector", :region "eu-central-1"},
    :ssl-common-name "inspector.eu-central-1.amazonaws.com",
    :endpoint "https://inspector.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "inspector", :region "us-west-2"},
    :ssl-common-name "inspector.us-west-2.amazonaws.com",
    :endpoint "https://inspector.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "inspector", :region "us-east-1"},
    :ssl-common-name "inspector.us-east-1.amazonaws.com",
    :endpoint "https://inspector.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "inspector", :region "us-west-1"},
    :ssl-common-name "inspector.us-west-1.amazonaws.com",
    :endpoint "https://inspector.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "inspector", :region "ap-south-1"},
    :ssl-common-name "inspector.ap-south-1.amazonaws.com",
    :endpoint "https://inspector.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
