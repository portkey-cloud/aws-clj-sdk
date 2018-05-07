(ns portkey.aws.swf.-2012-01-25 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "swf", :region "ap-northeast-1"},
    :ssl-common-name "swf.ap-northeast-1.amazonaws.com",
    :endpoint "https://swf.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "swf", :region "eu-west-1"},
    :ssl-common-name "swf.eu-west-1.amazonaws.com",
    :endpoint "https://swf.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "swf", :region "us-east-2"},
    :ssl-common-name "swf.us-east-2.amazonaws.com",
    :endpoint "https://swf.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "swf", :region "ap-southeast-2"},
    :ssl-common-name "swf.ap-southeast-2.amazonaws.com",
    :endpoint "https://swf.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "swf", :region "cn-north-1"},
    :ssl-common-name "swf.cn-north-1.amazonaws.com.cn",
    :endpoint "https://swf.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "swf", :region "sa-east-1"},
    :ssl-common-name "swf.sa-east-1.amazonaws.com",
    :endpoint "https://swf.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "swf", :region "ap-southeast-1"},
    :ssl-common-name "swf.ap-southeast-1.amazonaws.com",
    :endpoint "https://swf.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "swf", :region "cn-northwest-1"},
    :ssl-common-name "swf.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://swf.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "swf", :region "ap-northeast-2"},
    :ssl-common-name "swf.ap-northeast-2.amazonaws.com",
    :endpoint "https://swf.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "swf", :region "eu-west-3"},
    :ssl-common-name "swf.eu-west-3.amazonaws.com",
    :endpoint "https://swf.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "swf", :region "ca-central-1"},
    :ssl-common-name "swf.ca-central-1.amazonaws.com",
    :endpoint "https://swf.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "swf", :region "eu-central-1"},
    :ssl-common-name "swf.eu-central-1.amazonaws.com",
    :endpoint "https://swf.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "swf", :region "eu-west-2"},
    :ssl-common-name "swf.eu-west-2.amazonaws.com",
    :endpoint "https://swf.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "swf", :region "us-gov-west-1"},
    :ssl-common-name "swf.us-gov-west-1.amazonaws.com",
    :endpoint "https://swf.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "swf", :region "us-west-2"},
    :ssl-common-name "swf.us-west-2.amazonaws.com",
    :endpoint "https://swf.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "swf", :region "us-east-1"},
    :ssl-common-name "swf.us-east-1.amazonaws.com",
    :endpoint "https://swf.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "swf", :region "us-west-1"},
    :ssl-common-name "swf.us-west-1.amazonaws.com",
    :endpoint "https://swf.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "swf", :region "ap-south-1"},
    :ssl-common-name "swf.ap-south-1.amazonaws.com",
    :endpoint "https://swf.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
