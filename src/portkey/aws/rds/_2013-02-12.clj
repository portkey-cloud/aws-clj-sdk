(ns portkey.aws.rds.-2013-02-12 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "rds", :region "ap-northeast-1"},
    :ssl-common-name "rds.ap-northeast-1.amazonaws.com",
    :endpoint "https://rds.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "rds", :region "eu-west-1"},
    :ssl-common-name "rds.eu-west-1.amazonaws.com",
    :endpoint "https://rds.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "rds", :region "us-east-2"},
    :ssl-common-name "rds.us-east-2.amazonaws.com",
    :endpoint "https://rds.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "rds", :region "ap-southeast-2"},
    :ssl-common-name "rds.ap-southeast-2.amazonaws.com",
    :endpoint "https://rds.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "rds", :region "cn-north-1"},
    :ssl-common-name "rds.cn-north-1.amazonaws.com.cn",
    :endpoint "https://rds.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "rds", :region "sa-east-1"},
    :ssl-common-name "rds.sa-east-1.amazonaws.com",
    :endpoint "https://rds.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "rds", :region "ap-southeast-1"},
    :ssl-common-name "rds.ap-southeast-1.amazonaws.com",
    :endpoint "https://rds.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "rds", :region "ap-northeast-2"},
    :ssl-common-name "rds.ap-northeast-2.amazonaws.com",
    :endpoint "https://rds.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "rds", :region "ca-central-1"},
    :ssl-common-name "rds.ca-central-1.amazonaws.com",
    :endpoint "https://rds.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "rds", :region "eu-central-1"},
    :ssl-common-name "rds.eu-central-1.amazonaws.com",
    :endpoint "https://rds.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "rds", :region "eu-west-2"},
    :ssl-common-name "rds.eu-west-2.amazonaws.com",
    :endpoint "https://rds.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "rds", :region "us-gov-west-1"},
    :ssl-common-name "rds.us-gov-west-1.amazonaws.com",
    :endpoint "https://rds.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "rds", :region "us-west-2"},
    :ssl-common-name "rds.us-west-2.amazonaws.com",
    :endpoint "https://rds.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "rds", :region "us-east-1"},
    :ssl-common-name "rds.amazonaws.com",
    :endpoint "https://rds.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "rds", :region "us-west-1"},
    :ssl-common-name "rds.us-west-1.amazonaws.com",
    :endpoint "https://rds.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "rds", :region "ap-south-1"},
    :ssl-common-name "rds.ap-south-1.amazonaws.com",
    :endpoint "https://rds.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "query")
