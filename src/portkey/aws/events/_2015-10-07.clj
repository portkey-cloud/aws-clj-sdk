(ns portkey.aws.events.-2015-10-07 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "events", :region "ap-northeast-1"},
    :ssl-common-name "events.ap-northeast-1.amazonaws.com",
    :endpoint "https://events.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "events", :region "eu-west-1"},
    :ssl-common-name "events.eu-west-1.amazonaws.com",
    :endpoint "https://events.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "events", :region "us-east-2"},
    :ssl-common-name "events.us-east-2.amazonaws.com",
    :endpoint "https://events.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "events", :region "ap-southeast-2"},
    :ssl-common-name "events.ap-southeast-2.amazonaws.com",
    :endpoint "https://events.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "events", :region "cn-north-1"},
    :ssl-common-name "events.cn-north-1.amazonaws.com.cn",
    :endpoint "https://events.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "events", :region "sa-east-1"},
    :ssl-common-name "events.sa-east-1.amazonaws.com",
    :endpoint "https://events.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "events", :region "ap-southeast-1"},
    :ssl-common-name "events.ap-southeast-1.amazonaws.com",
    :endpoint "https://events.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "events", :region "cn-northwest-1"},
    :ssl-common-name "events.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://events.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "events", :region "ap-northeast-2"},
    :ssl-common-name "events.ap-northeast-2.amazonaws.com",
    :endpoint "https://events.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "events", :region "eu-west-3"},
    :ssl-common-name "events.eu-west-3.amazonaws.com",
    :endpoint "https://events.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "events", :region "ca-central-1"},
    :ssl-common-name "events.ca-central-1.amazonaws.com",
    :endpoint "https://events.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "events", :region "eu-central-1"},
    :ssl-common-name "events.eu-central-1.amazonaws.com",
    :endpoint "https://events.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "events", :region "eu-west-2"},
    :ssl-common-name "events.eu-west-2.amazonaws.com",
    :endpoint "https://events.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "events", :region "us-gov-west-1"},
    :ssl-common-name "events.us-gov-west-1.amazonaws.com",
    :endpoint "https://events.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "events", :region "us-west-2"},
    :ssl-common-name "events.us-west-2.amazonaws.com",
    :endpoint "https://events.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "events", :region "us-east-1"},
    :ssl-common-name "events.us-east-1.amazonaws.com",
    :endpoint "https://events.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "events", :region "us-west-1"},
    :ssl-common-name "events.us-west-1.amazonaws.com",
    :endpoint "https://events.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "events", :region "ap-south-1"},
    :ssl-common-name "events.ap-south-1.amazonaws.com",
    :endpoint "https://events.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
