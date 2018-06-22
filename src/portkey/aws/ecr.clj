(ns portkey.aws.ecr (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ecr", :region "ap-northeast-1"},
    :ssl-common-name "ecr.ap-northeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ecr", :region "eu-west-1"},
    :ssl-common-name "ecr.eu-west-1.amazonaws.com",
    :endpoint "https://ecr.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ecr", :region "us-east-2"},
    :ssl-common-name "ecr.us-east-2.amazonaws.com",
    :endpoint "https://ecr.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ecr", :region "ap-southeast-2"},
    :ssl-common-name "ecr.ap-southeast-2.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ecr", :region "cn-north-1"},
    :ssl-common-name "ecr.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ecr.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ecr", :region "sa-east-1"},
    :ssl-common-name "ecr.sa-east-1.amazonaws.com",
    :endpoint "https://ecr.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ecr", :region "ap-southeast-1"},
    :ssl-common-name "ecr.ap-southeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ecr", :region "ap-northeast-2"},
    :ssl-common-name "ecr.ap-northeast-2.amazonaws.com",
    :endpoint "https://ecr.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ecr", :region "eu-west-3"},
    :ssl-common-name "ecr.eu-west-3.amazonaws.com",
    :endpoint "https://ecr.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ecr", :region "ca-central-1"},
    :ssl-common-name "ecr.ca-central-1.amazonaws.com",
    :endpoint "https://ecr.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ecr", :region "eu-central-1"},
    :ssl-common-name "ecr.eu-central-1.amazonaws.com",
    :endpoint "https://ecr.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ecr", :region "eu-west-2"},
    :ssl-common-name "ecr.eu-west-2.amazonaws.com",
    :endpoint "https://ecr.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ecr", :region "us-gov-west-1"},
    :ssl-common-name "ecr.us-gov-west-1.amazonaws.com",
    :endpoint "https://ecr.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ecr", :region "us-west-2"},
    :ssl-common-name "ecr.us-west-2.amazonaws.com",
    :endpoint "https://ecr.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ecr", :region "us-east-1"},
    :ssl-common-name "ecr.us-east-1.amazonaws.com",
    :endpoint "https://ecr.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ecr", :region "us-west-1"},
    :ssl-common-name "ecr.us-west-1.amazonaws.com",
    :endpoint "https://ecr.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ecr", :region "ap-south-1"},
    :ssl-common-name "ecr.ap-south-1.amazonaws.com",
    :endpoint "https://ecr.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
