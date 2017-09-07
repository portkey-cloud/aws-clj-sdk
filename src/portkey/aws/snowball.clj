(ns portkey.aws.snowball (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "snowball", :region "eu-west-1"},
    :ssl-common-name "snowball.eu-west-1.amazonaws.com",
    :endpoint "https://snowball.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "snowball", :region "us-east-2"},
    :ssl-common-name "snowball.us-east-2.amazonaws.com",
    :endpoint "https://snowball.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "snowball", :region "ap-southeast-2"},
    :ssl-common-name "snowball.ap-southeast-2.amazonaws.com",
    :endpoint "https://snowball.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credential-scope {:service "snowball", :region "sa-east-1"},
    :ssl-common-name "snowball.sa-east-1.amazonaws.com",
    :endpoint "https://snowball.sa-east-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "snowball", :region "eu-central-1"},
    :ssl-common-name "snowball.eu-central-1.amazonaws.com",
    :endpoint "https://snowball.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "snowball", :region "eu-west-2"},
    :ssl-common-name "snowball.eu-west-2.amazonaws.com",
    :endpoint "https://snowball.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "snowball", :region "us-gov-west-1"},
    :ssl-common-name "snowball.us-gov-west-1.amazonaws.com",
    :endpoint "https://snowball.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "snowball", :region "us-west-2"},
    :ssl-common-name "snowball.us-west-2.amazonaws.com",
    :endpoint "https://snowball.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "snowball", :region "us-east-1"},
    :ssl-common-name "snowball.us-east-1.amazonaws.com",
    :endpoint "https://snowball.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "snowball", :region "us-west-1"},
    :ssl-common-name "snowball.us-west-1.amazonaws.com",
    :endpoint "https://snowball.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "snowball", :region "ap-south-1"},
    :ssl-common-name "snowball.ap-south-1.amazonaws.com",
    :endpoint "https://snowball.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
