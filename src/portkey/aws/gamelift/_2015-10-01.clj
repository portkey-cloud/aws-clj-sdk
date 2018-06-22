(ns portkey.aws.gamelift.-2015-10-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "gamelift", :region "ap-northeast-1"},
    :ssl-common-name "gamelift.ap-northeast-1.amazonaws.com",
    :endpoint "https://gamelift.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "gamelift", :region "eu-west-1"},
    :ssl-common-name "gamelift.eu-west-1.amazonaws.com",
    :endpoint "https://gamelift.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "gamelift", :region "us-east-2"},
    :ssl-common-name "gamelift.us-east-2.amazonaws.com",
    :endpoint "https://gamelift.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "gamelift", :region "ap-southeast-2"},
    :ssl-common-name "gamelift.ap-southeast-2.amazonaws.com",
    :endpoint "https://gamelift.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "gamelift", :region "sa-east-1"},
    :ssl-common-name "gamelift.sa-east-1.amazonaws.com",
    :endpoint "https://gamelift.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "gamelift", :region "ap-southeast-1"},
    :ssl-common-name "gamelift.ap-southeast-1.amazonaws.com",
    :endpoint "https://gamelift.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "gamelift", :region "ap-northeast-2"},
    :ssl-common-name "gamelift.ap-northeast-2.amazonaws.com",
    :endpoint "https://gamelift.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "gamelift", :region "ca-central-1"},
    :ssl-common-name "gamelift.ca-central-1.amazonaws.com",
    :endpoint "https://gamelift.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "gamelift", :region "eu-central-1"},
    :ssl-common-name "gamelift.eu-central-1.amazonaws.com",
    :endpoint "https://gamelift.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "gamelift", :region "eu-west-2"},
    :ssl-common-name "gamelift.eu-west-2.amazonaws.com",
    :endpoint "https://gamelift.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "gamelift", :region "us-west-2"},
    :ssl-common-name "gamelift.us-west-2.amazonaws.com",
    :endpoint "https://gamelift.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "gamelift", :region "us-east-1"},
    :ssl-common-name "gamelift.us-east-1.amazonaws.com",
    :endpoint "https://gamelift.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "gamelift", :region "us-west-1"},
    :ssl-common-name "gamelift.us-west-1.amazonaws.com",
    :endpoint "https://gamelift.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "gamelift", :region "ap-south-1"},
    :ssl-common-name "gamelift.ap-south-1.amazonaws.com",
    :endpoint "https://gamelift.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
