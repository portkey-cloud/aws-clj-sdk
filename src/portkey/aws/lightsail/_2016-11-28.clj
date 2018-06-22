(ns portkey.aws.lightsail.-2016-11-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "lightsail", :region "ap-northeast-1"},
    :ssl-common-name "lightsail.ap-northeast-1.amazonaws.com",
    :endpoint "https://lightsail.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "lightsail", :region "eu-west-1"},
    :ssl-common-name "lightsail.eu-west-1.amazonaws.com",
    :endpoint "https://lightsail.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "lightsail", :region "us-east-2"},
    :ssl-common-name "lightsail.us-east-2.amazonaws.com",
    :endpoint "https://lightsail.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "lightsail", :region "ap-southeast-2"},
    :ssl-common-name "lightsail.ap-southeast-2.amazonaws.com",
    :endpoint "https://lightsail.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "lightsail", :region "ap-southeast-1"},
    :ssl-common-name "lightsail.ap-southeast-1.amazonaws.com",
    :endpoint "https://lightsail.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "lightsail", :region "eu-central-1"},
    :ssl-common-name "lightsail.eu-central-1.amazonaws.com",
    :endpoint "https://lightsail.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "lightsail", :region "eu-west-2"},
    :ssl-common-name "lightsail.eu-west-2.amazonaws.com",
    :endpoint "https://lightsail.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lightsail", :region "us-west-2"},
    :ssl-common-name "lightsail.us-west-2.amazonaws.com",
    :endpoint "https://lightsail.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lightsail", :region "us-east-1"},
    :ssl-common-name "lightsail.us-east-1.amazonaws.com",
    :endpoint "https://lightsail.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "lightsail", :region "ap-south-1"},
    :ssl-common-name "lightsail.ap-south-1.amazonaws.com",
    :endpoint "https://lightsail.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
