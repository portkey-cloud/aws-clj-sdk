(ns portkey.aws.config (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "config", :region "ap-northeast-1"},
    :ssl-common-name "config.ap-northeast-1.amazonaws.com",
    :endpoint "https://config.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "config", :region "eu-west-1"},
    :ssl-common-name "config.eu-west-1.amazonaws.com",
    :endpoint "https://config.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "config", :region "us-east-2"},
    :ssl-common-name "config.us-east-2.amazonaws.com",
    :endpoint "https://config.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "config", :region "ap-southeast-2"},
    :ssl-common-name "config.ap-southeast-2.amazonaws.com",
    :endpoint "https://config.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "config", :region "cn-north-1"},
    :ssl-common-name "config.cn-north-1.amazonaws.com.cn",
    :endpoint "https://config.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "config", :region "sa-east-1"},
    :ssl-common-name "config.sa-east-1.amazonaws.com",
    :endpoint "https://config.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "config", :region "ap-southeast-1"},
    :ssl-common-name "config.ap-southeast-1.amazonaws.com",
    :endpoint "https://config.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "config", :region "cn-northwest-1"},
    :ssl-common-name "config.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://config.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "config", :region "ap-northeast-2"},
    :ssl-common-name "config.ap-northeast-2.amazonaws.com",
    :endpoint "https://config.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "config", :region "eu-west-3"},
    :ssl-common-name "config.eu-west-3.amazonaws.com",
    :endpoint "https://config.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "config", :region "ca-central-1"},
    :ssl-common-name "config.ca-central-1.amazonaws.com",
    :endpoint "https://config.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "config", :region "eu-central-1"},
    :ssl-common-name "config.eu-central-1.amazonaws.com",
    :endpoint "https://config.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "config", :region "eu-west-2"},
    :ssl-common-name "config.eu-west-2.amazonaws.com",
    :endpoint "https://config.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "config", :region "us-gov-west-1"},
    :ssl-common-name "config.us-gov-west-1.amazonaws.com",
    :endpoint "https://config.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "config", :region "us-west-2"},
    :ssl-common-name "config.us-west-2.amazonaws.com",
    :endpoint "https://config.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "config", :region "us-east-1"},
    :ssl-common-name "config.us-east-1.amazonaws.com",
    :endpoint "https://config.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "config", :region "us-west-1"},
    :ssl-common-name "config.us-west-1.amazonaws.com",
    :endpoint "https://config.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "config", :region "ap-south-1"},
    :ssl-common-name "config.ap-south-1.amazonaws.com",
    :endpoint "https://config.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
