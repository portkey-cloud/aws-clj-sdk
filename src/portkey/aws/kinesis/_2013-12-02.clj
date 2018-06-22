(ns portkey.aws.kinesis.-2013-12-02 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "kinesis", :region "ap-northeast-1"},
    :ssl-common-name "kinesis.ap-northeast-1.amazonaws.com",
    :endpoint "https://kinesis.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kinesis", :region "eu-west-1"},
    :ssl-common-name "kinesis.eu-west-1.amazonaws.com",
    :endpoint "https://kinesis.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "kinesis", :region "us-east-2"},
    :ssl-common-name "kinesis.us-east-2.amazonaws.com",
    :endpoint "https://kinesis.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "kinesis", :region "ap-southeast-2"},
    :ssl-common-name "kinesis.ap-southeast-2.amazonaws.com",
    :endpoint "https://kinesis.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "kinesis", :region "cn-north-1"},
    :ssl-common-name "kinesis.cn-north-1.amazonaws.com.cn",
    :endpoint "https://kinesis.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "kinesis", :region "sa-east-1"},
    :ssl-common-name "kinesis.sa-east-1.amazonaws.com",
    :endpoint "https://kinesis.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "kinesis", :region "ap-southeast-1"},
    :ssl-common-name "kinesis.ap-southeast-1.amazonaws.com",
    :endpoint "https://kinesis.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "kinesis", :region "cn-northwest-1"},
    :ssl-common-name "kinesis.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://kinesis.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "kinesis", :region "ap-northeast-2"},
    :ssl-common-name "kinesis.ap-northeast-2.amazonaws.com",
    :endpoint "https://kinesis.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "kinesis", :region "eu-west-3"},
    :ssl-common-name "kinesis.eu-west-3.amazonaws.com",
    :endpoint "https://kinesis.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "kinesis", :region "ca-central-1"},
    :ssl-common-name "kinesis.ca-central-1.amazonaws.com",
    :endpoint "https://kinesis.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "kinesis", :region "eu-central-1"},
    :ssl-common-name "kinesis.eu-central-1.amazonaws.com",
    :endpoint "https://kinesis.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "kinesis", :region "eu-west-2"},
    :ssl-common-name "kinesis.eu-west-2.amazonaws.com",
    :endpoint "https://kinesis.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "kinesis", :region "us-gov-west-1"},
    :ssl-common-name "kinesis.us-gov-west-1.amazonaws.com",
    :endpoint "https://kinesis.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kinesis", :region "us-west-2"},
    :ssl-common-name "kinesis.us-west-2.amazonaws.com",
    :endpoint "https://kinesis.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kinesis", :region "us-east-1"},
    :ssl-common-name "kinesis.us-east-1.amazonaws.com",
    :endpoint "https://kinesis.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "kinesis", :region "us-west-1"},
    :ssl-common-name "kinesis.us-west-1.amazonaws.com",
    :endpoint "https://kinesis.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "kinesis", :region "ap-south-1"},
    :ssl-common-name "kinesis.ap-south-1.amazonaws.com",
    :endpoint "https://kinesis.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
