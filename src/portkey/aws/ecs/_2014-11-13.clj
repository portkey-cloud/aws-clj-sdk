(ns portkey.aws.ecs.-2014-11-13 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ecs", :region "ap-northeast-1"},
    :ssl-common-name "ecs.ap-northeast-1.amazonaws.com",
    :endpoint "https://ecs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ecs", :region "eu-west-1"},
    :ssl-common-name "ecs.eu-west-1.amazonaws.com",
    :endpoint "https://ecs.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ecs", :region "us-east-2"},
    :ssl-common-name "ecs.us-east-2.amazonaws.com",
    :endpoint "https://ecs.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ecs", :region "ap-southeast-2"},
    :ssl-common-name "ecs.ap-southeast-2.amazonaws.com",
    :endpoint "https://ecs.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ecs", :region "cn-north-1"},
    :ssl-common-name "ecs.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ecs.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ecs", :region "sa-east-1"},
    :ssl-common-name "ecs.sa-east-1.amazonaws.com",
    :endpoint "https://ecs.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ecs", :region "ap-southeast-1"},
    :ssl-common-name "ecs.ap-southeast-1.amazonaws.com",
    :endpoint "https://ecs.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ecs", :region "ap-northeast-2"},
    :ssl-common-name "ecs.ap-northeast-2.amazonaws.com",
    :endpoint "https://ecs.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ecs", :region "eu-west-3"},
    :ssl-common-name "ecs.eu-west-3.amazonaws.com",
    :endpoint "https://ecs.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ecs", :region "ca-central-1"},
    :ssl-common-name "ecs.ca-central-1.amazonaws.com",
    :endpoint "https://ecs.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ecs", :region "eu-central-1"},
    :ssl-common-name "ecs.eu-central-1.amazonaws.com",
    :endpoint "https://ecs.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ecs", :region "eu-west-2"},
    :ssl-common-name "ecs.eu-west-2.amazonaws.com",
    :endpoint "https://ecs.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ecs", :region "us-gov-west-1"},
    :ssl-common-name "ecs.us-gov-west-1.amazonaws.com",
    :endpoint "https://ecs.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ecs", :region "us-west-2"},
    :ssl-common-name "ecs.us-west-2.amazonaws.com",
    :endpoint "https://ecs.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ecs", :region "us-east-1"},
    :ssl-common-name "ecs.us-east-1.amazonaws.com",
    :endpoint "https://ecs.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ecs", :region "us-west-1"},
    :ssl-common-name "ecs.us-west-1.amazonaws.com",
    :endpoint "https://ecs.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ecs", :region "ap-south-1"},
    :ssl-common-name "ecs.ap-south-1.amazonaws.com",
    :endpoint "https://ecs.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
