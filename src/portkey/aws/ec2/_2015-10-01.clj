(ns portkey.aws.ec2.-2015-10-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ec2", :region "ap-northeast-1"},
    :ssl-common-name "ec2.ap-northeast-1.amazonaws.com",
    :endpoint "https://ec2.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ec2", :region "eu-west-1"},
    :ssl-common-name "ec2.eu-west-1.amazonaws.com",
    :endpoint "https://ec2.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ec2", :region "us-east-2"},
    :ssl-common-name "ec2.us-east-2.amazonaws.com",
    :endpoint "https://ec2.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ec2", :region "ap-southeast-2"},
    :ssl-common-name "ec2.ap-southeast-2.amazonaws.com",
    :endpoint "https://ec2.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ec2", :region "cn-north-1"},
    :ssl-common-name "ec2.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ec2.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ec2", :region "sa-east-1"},
    :ssl-common-name "ec2.sa-east-1.amazonaws.com",
    :endpoint "https://ec2.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ec2", :region "ap-southeast-1"},
    :ssl-common-name "ec2.ap-southeast-1.amazonaws.com",
    :endpoint "https://ec2.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ec2", :region "ap-northeast-2"},
    :ssl-common-name "ec2.ap-northeast-2.amazonaws.com",
    :endpoint "https://ec2.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ec2", :region "ca-central-1"},
    :ssl-common-name "ec2.ca-central-1.amazonaws.com",
    :endpoint "https://ec2.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ec2", :region "eu-central-1"},
    :ssl-common-name "ec2.eu-central-1.amazonaws.com",
    :endpoint "https://ec2.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ec2", :region "eu-west-2"},
    :ssl-common-name "ec2.eu-west-2.amazonaws.com",
    :endpoint "https://ec2.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ec2", :region "us-gov-west-1"},
    :ssl-common-name "ec2.us-gov-west-1.amazonaws.com",
    :endpoint "https://ec2.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ec2", :region "us-west-2"},
    :ssl-common-name "ec2.us-west-2.amazonaws.com",
    :endpoint "https://ec2.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ec2", :region "us-east-1"},
    :ssl-common-name "ec2.us-east-1.amazonaws.com",
    :endpoint "https://ec2.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ec2", :region "us-west-1"},
    :ssl-common-name "ec2.us-west-1.amazonaws.com",
    :endpoint "https://ec2.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ec2", :region "ap-south-1"},
    :ssl-common-name "ec2.ap-south-1.amazonaws.com",
    :endpoint "https://ec2.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "ec2")
