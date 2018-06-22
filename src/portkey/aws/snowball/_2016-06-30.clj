(ns portkey.aws.snowball.-2016-06-30 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "snowball", :region "ap-northeast-1"},
    :ssl-common-name "snowball.ap-northeast-1.amazonaws.com",
    :endpoint "https://snowball.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "snowball", :region "eu-west-1"},
    :ssl-common-name "snowball.eu-west-1.amazonaws.com",
    :endpoint "https://snowball.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "snowball", :region "us-east-2"},
    :ssl-common-name "snowball.us-east-2.amazonaws.com",
    :endpoint "https://snowball.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "snowball", :region "ap-southeast-2"},
    :ssl-common-name "snowball.ap-southeast-2.amazonaws.com",
    :endpoint "https://snowball.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "snowball", :region "cn-north-1"},
    :ssl-common-name "snowball.cn-north-1.amazonaws.com.cn",
    :endpoint "https://snowball.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "snowball", :region "sa-east-1"},
    :ssl-common-name "snowball.sa-east-1.amazonaws.com",
    :endpoint "https://snowball.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "snowball", :region "ap-southeast-1"},
    :ssl-common-name "snowball.ap-southeast-1.amazonaws.com",
    :endpoint "https://snowball.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "snowball", :region "eu-west-3"},
    :ssl-common-name "snowball.eu-west-3.amazonaws.com",
    :endpoint "https://snowball.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "snowball", :region "ca-central-1"},
    :ssl-common-name "snowball.ca-central-1.amazonaws.com",
    :endpoint "https://snowball.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "snowball", :region "eu-central-1"},
    :ssl-common-name "snowball.eu-central-1.amazonaws.com",
    :endpoint "https://snowball.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "snowball", :region "eu-west-2"},
    :ssl-common-name "snowball.eu-west-2.amazonaws.com",
    :endpoint "https://snowball.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "snowball", :region "us-gov-west-1"},
    :ssl-common-name "snowball.us-gov-west-1.amazonaws.com",
    :endpoint "https://snowball.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "snowball", :region "us-west-2"},
    :ssl-common-name "snowball.us-west-2.amazonaws.com",
    :endpoint "https://snowball.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "snowball", :region "us-east-1"},
    :ssl-common-name "snowball.us-east-1.amazonaws.com",
    :endpoint "https://snowball.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "snowball", :region "us-west-1"},
    :ssl-common-name "snowball.us-west-1.amazonaws.com",
    :endpoint "https://snowball.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "snowball", :region "ap-south-1"},
    :ssl-common-name "snowball.ap-south-1.amazonaws.com",
    :endpoint "https://snowball.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
