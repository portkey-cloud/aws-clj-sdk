(ns portkey.aws.cloudhsmv2.-2017-04-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-northeast-1"},
    :ssl-common-name "cloudhsmv2.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudhsm", :region "eu-west-1"},
    :ssl-common-name "cloudhsmv2.eu-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudhsm", :region "us-east-2"},
    :ssl-common-name "cloudhsmv2.us-east-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-2"},
    :ssl-common-name "cloudhsmv2.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-1"},
    :ssl-common-name "cloudhsmv2.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudhsm", :region "ca-central-1"},
    :ssl-common-name "cloudhsmv2.ca-central-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudhsm", :region "eu-central-1"},
    :ssl-common-name "cloudhsmv2.eu-central-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-gov-west-1"},
    :ssl-common-name "cloudhsmv2.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudhsm", :region "us-west-2"},
    :ssl-common-name "cloudhsmv2.us-west-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudhsm", :region "us-east-1"},
    :ssl-common-name "cloudhsmv2.us-east-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-west-1"},
    :ssl-common-name "cloudhsmv2.us-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudhsm", :region "ap-south-1"},
    :ssl-common-name "cloudhsmv2.ap-south-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
