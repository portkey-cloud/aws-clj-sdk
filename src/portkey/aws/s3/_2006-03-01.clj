(ns portkey.aws.s3.-2006-03-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "s3", :region "ap-northeast-1"},
    :ssl-common-name "s3-ap-northeast-1.amazonaws.com",
    :endpoint "https://s3-ap-northeast-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-1"
   {:credential-scope {:service "s3", :region "eu-west-1"},
    :ssl-common-name "s3-eu-west-1.amazonaws.com",
    :endpoint "https://s3-eu-west-1.amazonaws.com",
    :signature-version :s3v4},
   "fips-us-gov-west-1"
   {:credential-scope {:service "s3", :region "us-gov-west-1"},
    :ssl-common-name "s3-fips-us-gov-west-1.amazonaws.com",
    :endpoint "https://s3-fips-us-gov-west-1.amazonaws.com",
    :signature-version :s3v4},
   "s3-external-1"
   {:credential-scope {:service "s3", :region "us-east-1"},
    :ssl-common-name "s3-external-1.amazonaws.com",
    :endpoint "https://s3-external-1.amazonaws.com",
    :signature-version :s3v4},
   "us-east-2"
   {:credential-scope {:service "s3", :region "us-east-2"},
    :ssl-common-name "s3.us-east-2.amazonaws.com",
    :endpoint "https://s3.us-east-2.amazonaws.com",
    :signature-version :s3v4},
   "ap-southeast-2"
   {:credential-scope {:service "s3", :region "ap-southeast-2"},
    :ssl-common-name "s3-ap-southeast-2.amazonaws.com",
    :endpoint "https://s3-ap-southeast-2.amazonaws.com",
    :signature-version :s3v4},
   "cn-north-1"
   {:credential-scope {:service "s3", :region "cn-north-1"},
    :ssl-common-name "s3.cn-north-1.amazonaws.com.cn",
    :endpoint "https://s3.cn-north-1.amazonaws.com.cn",
    :signature-version :s3v4},
   "sa-east-1"
   {:credential-scope {:service "s3", :region "sa-east-1"},
    :ssl-common-name "s3-sa-east-1.amazonaws.com",
    :endpoint "https://s3-sa-east-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-southeast-1"
   {:credential-scope {:service "s3", :region "ap-southeast-1"},
    :ssl-common-name "s3-ap-southeast-1.amazonaws.com",
    :endpoint "https://s3-ap-southeast-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-northeast-2"
   {:credential-scope {:service "s3", :region "ap-northeast-2"},
    :ssl-common-name "s3.ap-northeast-2.amazonaws.com",
    :endpoint "https://s3.ap-northeast-2.amazonaws.com",
    :signature-version :s3v4},
   "ca-central-1"
   {:credential-scope {:service "s3", :region "ca-central-1"},
    :ssl-common-name "s3.ca-central-1.amazonaws.com",
    :endpoint "https://s3.ca-central-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-central-1"
   {:credential-scope {:service "s3", :region "eu-central-1"},
    :ssl-common-name "s3.eu-central-1.amazonaws.com",
    :endpoint "https://s3.eu-central-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-2"
   {:credential-scope {:service "s3", :region "eu-west-2"},
    :ssl-common-name "s3.eu-west-2.amazonaws.com",
    :endpoint "https://s3.eu-west-2.amazonaws.com",
    :signature-version :s3v4},
   "us-gov-west-1"
   {:credential-scope {:service "s3", :region "us-gov-west-1"},
    :ssl-common-name "s3-us-gov-west-1.amazonaws.com",
    :endpoint "https://s3-us-gov-west-1.amazonaws.com",
    :signature-version :s3v4},
   "us-west-2"
   {:credential-scope {:service "s3", :region "us-west-2"},
    :ssl-common-name "s3-us-west-2.amazonaws.com",
    :endpoint "https://s3-us-west-2.amazonaws.com",
    :signature-version :s3v4},
   "us-east-1"
   {:credential-scope {:service "s3", :region "us-east-1"},
    :ssl-common-name "s3.amazonaws.com",
    :endpoint "https://s3.amazonaws.com",
    :signature-version :s3v4},
   "us-west-1"
   {:credential-scope {:service "s3", :region "us-west-1"},
    :ssl-common-name "s3-us-west-1.amazonaws.com",
    :endpoint "https://s3-us-west-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-south-1"
   {:credential-scope {:service "s3", :region "ap-south-1"},
    :ssl-common-name "s3.ap-south-1.amazonaws.com",
    :endpoint "https://s3.ap-south-1.amazonaws.com",
    :signature-version :s3v4}})

(comment TODO support "rest-xml")
