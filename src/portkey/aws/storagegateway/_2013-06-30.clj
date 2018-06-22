(ns portkey.aws.storagegateway.-2013-06-30 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-northeast-1"},
    :ssl-common-name "storagegateway.ap-northeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "storagegateway", :region "eu-west-1"},
    :ssl-common-name "storagegateway.eu-west-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "storagegateway", :region "us-east-2"},
    :ssl-common-name "storagegateway.us-east-2.amazonaws.com",
    :endpoint "https://storagegateway.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "storagegateway", :region "ap-southeast-2"},
    :ssl-common-name "storagegateway.ap-southeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "storagegateway", :region "cn-north-1"},
    :ssl-common-name "storagegateway.cn-north-1.amazonaws.com.cn",
    :endpoint "https://storagegateway.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "storagegateway", :region "sa-east-1"},
    :ssl-common-name "storagegateway.sa-east-1.amazonaws.com",
    :endpoint "https://storagegateway.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-southeast-1"},
    :ssl-common-name "storagegateway.ap-southeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "storagegateway", :region "ap-northeast-2"},
    :ssl-common-name "storagegateway.ap-northeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "storagegateway", :region "eu-west-3"},
    :ssl-common-name "storagegateway.eu-west-3.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "storagegateway", :region "ca-central-1"},
    :ssl-common-name "storagegateway.ca-central-1.amazonaws.com",
    :endpoint "https://storagegateway.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "storagegateway", :region "eu-central-1"},
    :ssl-common-name "storagegateway.eu-central-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "storagegateway", :region "eu-west-2"},
    :ssl-common-name "storagegateway.eu-west-2.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "storagegateway", :region "us-gov-west-1"},
    :ssl-common-name "storagegateway.us-gov-west-1.amazonaws.com",
    :endpoint "https://storagegateway.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "storagegateway", :region "us-west-2"},
    :ssl-common-name "storagegateway.us-west-2.amazonaws.com",
    :endpoint "https://storagegateway.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "storagegateway", :region "us-east-1"},
    :ssl-common-name "storagegateway.us-east-1.amazonaws.com",
    :endpoint "https://storagegateway.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "storagegateway", :region "us-west-1"},
    :ssl-common-name "storagegateway.us-west-1.amazonaws.com",
    :endpoint "https://storagegateway.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-south-1"},
    :ssl-common-name "storagegateway.ap-south-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
