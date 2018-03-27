(ns portkey.aws.tagging (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "tagging", :region "ap-northeast-1"},
    :ssl-common-name "tagging.ap-northeast-1.amazonaws.com",
    :endpoint "https://tagging.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "tagging", :region "eu-west-1"},
    :ssl-common-name "tagging.eu-west-1.amazonaws.com",
    :endpoint "https://tagging.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "tagging", :region "us-east-2"},
    :ssl-common-name "tagging.us-east-2.amazonaws.com",
    :endpoint "https://tagging.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "tagging", :region "ap-southeast-2"},
    :ssl-common-name "tagging.ap-southeast-2.amazonaws.com",
    :endpoint "https://tagging.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "tagging", :region "cn-north-1"},
    :ssl-common-name "tagging.cn-north-1.amazonaws.com.cn",
    :endpoint "https://tagging.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "tagging", :region "sa-east-1"},
    :ssl-common-name "tagging.sa-east-1.amazonaws.com",
    :endpoint "https://tagging.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "tagging", :region "ap-southeast-1"},
    :ssl-common-name "tagging.ap-southeast-1.amazonaws.com",
    :endpoint "https://tagging.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "tagging", :region "ap-northeast-2"},
    :ssl-common-name "tagging.ap-northeast-2.amazonaws.com",
    :endpoint "https://tagging.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "tagging", :region "ca-central-1"},
    :ssl-common-name "tagging.ca-central-1.amazonaws.com",
    :endpoint "https://tagging.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "tagging", :region "eu-central-1"},
    :ssl-common-name "tagging.eu-central-1.amazonaws.com",
    :endpoint "https://tagging.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "tagging", :region "eu-west-2"},
    :ssl-common-name "tagging.eu-west-2.amazonaws.com",
    :endpoint "https://tagging.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "tagging", :region "us-west-2"},
    :ssl-common-name "tagging.us-west-2.amazonaws.com",
    :endpoint "https://tagging.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "tagging", :region "us-east-1"},
    :ssl-common-name "tagging.us-east-1.amazonaws.com",
    :endpoint "https://tagging.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "tagging", :region "us-west-1"},
    :ssl-common-name "tagging.us-west-1.amazonaws.com",
    :endpoint "https://tagging.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "tagging", :region "ap-south-1"},
    :ssl-common-name "tagging.ap-south-1.amazonaws.com",
    :endpoint "https://tagging.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
