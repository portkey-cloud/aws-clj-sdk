(ns portkey.aws.logs (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "logs", :region "ap-northeast-1"},
    :ssl-common-name "logs.ap-northeast-1.amazonaws.com",
    :endpoint "https://logs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "logs", :region "eu-west-1"},
    :ssl-common-name "logs.eu-west-1.amazonaws.com",
    :endpoint "https://logs.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "logs", :region "us-east-2"},
    :ssl-common-name "logs.us-east-2.amazonaws.com",
    :endpoint "https://logs.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "logs", :region "ap-southeast-2"},
    :ssl-common-name "logs.ap-southeast-2.amazonaws.com",
    :endpoint "https://logs.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "logs", :region "cn-north-1"},
    :ssl-common-name "logs.cn-north-1.amazonaws.com.cn",
    :endpoint "https://logs.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "logs", :region "sa-east-1"},
    :ssl-common-name "logs.sa-east-1.amazonaws.com",
    :endpoint "https://logs.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "logs", :region "ap-southeast-1"},
    :ssl-common-name "logs.ap-southeast-1.amazonaws.com",
    :endpoint "https://logs.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "logs", :region "cn-northwest-1"},
    :ssl-common-name "logs.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://logs.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "logs", :region "ap-northeast-2"},
    :ssl-common-name "logs.ap-northeast-2.amazonaws.com",
    :endpoint "https://logs.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "logs", :region "eu-west-3"},
    :ssl-common-name "logs.eu-west-3.amazonaws.com",
    :endpoint "https://logs.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "logs", :region "ca-central-1"},
    :ssl-common-name "logs.ca-central-1.amazonaws.com",
    :endpoint "https://logs.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "logs", :region "eu-central-1"},
    :ssl-common-name "logs.eu-central-1.amazonaws.com",
    :endpoint "https://logs.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "logs", :region "eu-west-2"},
    :ssl-common-name "logs.eu-west-2.amazonaws.com",
    :endpoint "https://logs.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "logs", :region "us-gov-west-1"},
    :ssl-common-name "logs.us-gov-west-1.amazonaws.com",
    :endpoint "https://logs.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "logs", :region "us-west-2"},
    :ssl-common-name "logs.us-west-2.amazonaws.com",
    :endpoint "https://logs.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "logs", :region "us-east-1"},
    :ssl-common-name "logs.us-east-1.amazonaws.com",
    :endpoint "https://logs.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "logs", :region "us-west-1"},
    :ssl-common-name "logs.us-west-1.amazonaws.com",
    :endpoint "https://logs.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "logs", :region "ap-south-1"},
    :ssl-common-name "logs.ap-south-1.amazonaws.com",
    :endpoint "https://logs.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
