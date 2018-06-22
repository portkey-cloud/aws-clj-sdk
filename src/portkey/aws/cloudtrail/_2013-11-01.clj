(ns portkey.aws.cloudtrail.-2013-11-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cloudtrail", :region "ap-northeast-1"},
    :ssl-common-name "cloudtrail.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudtrail", :region "eu-west-1"},
    :ssl-common-name "cloudtrail.eu-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudtrail", :region "us-east-2"},
    :ssl-common-name "cloudtrail.us-east-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cloudtrail", :region "ap-southeast-2"},
    :ssl-common-name "cloudtrail.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "cloudtrail", :region "cn-north-1"},
    :ssl-common-name "cloudtrail.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cloudtrail.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudtrail", :region "sa-east-1"},
    :ssl-common-name "cloudtrail.sa-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cloudtrail", :region "ap-southeast-1"},
    :ssl-common-name "cloudtrail.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "cloudtrail", :region "cn-northwest-1"},
    :ssl-common-name "cloudtrail.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://cloudtrail.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cloudtrail", :region "ap-northeast-2"},
    :ssl-common-name "cloudtrail.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudtrail.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudtrail", :region "eu-west-3"},
    :ssl-common-name "cloudtrail.eu-west-3.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudtrail", :region "ca-central-1"},
    :ssl-common-name "cloudtrail.ca-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudtrail", :region "eu-central-1"},
    :ssl-common-name "cloudtrail.eu-central-1.amazonaws.com",
    :endpoint "https://cloudtrail.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudtrail", :region "eu-west-2"},
    :ssl-common-name "cloudtrail.eu-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "cloudtrail", :region "us-gov-west-1"},
    :ssl-common-name "cloudtrail.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudtrail", :region "us-west-2"},
    :ssl-common-name "cloudtrail.us-west-2.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudtrail", :region "us-east-1"},
    :ssl-common-name "cloudtrail.us-east-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudtrail", :region "us-west-1"},
    :ssl-common-name "cloudtrail.us-west-1.amazonaws.com",
    :endpoint "https://cloudtrail.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudtrail", :region "ap-south-1"},
    :ssl-common-name "cloudtrail.ap-south-1.amazonaws.com",
    :endpoint "https://cloudtrail.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
