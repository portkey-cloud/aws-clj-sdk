(ns portkey.aws.opsworks (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "opsworks", :region "ap-northeast-1"},
    :ssl-common-name "opsworks.ap-northeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "opsworks", :region "eu-west-1"},
    :ssl-common-name "opsworks.eu-west-1.amazonaws.com",
    :endpoint "https://opsworks.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "opsworks", :region "us-east-2"},
    :ssl-common-name "opsworks.us-east-2.amazonaws.com",
    :endpoint "https://opsworks.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "opsworks", :region "ap-southeast-2"},
    :ssl-common-name "opsworks.ap-southeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "opsworks", :region "sa-east-1"},
    :ssl-common-name "opsworks.sa-east-1.amazonaws.com",
    :endpoint "https://opsworks.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "opsworks", :region "ap-southeast-1"},
    :ssl-common-name "opsworks.ap-southeast-1.amazonaws.com",
    :endpoint "https://opsworks.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "opsworks", :region "ap-northeast-2"},
    :ssl-common-name "opsworks.ap-northeast-2.amazonaws.com",
    :endpoint "https://opsworks.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "opsworks", :region "eu-west-3"},
    :ssl-common-name "opsworks.eu-west-3.amazonaws.com",
    :endpoint "https://opsworks.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "opsworks", :region "ca-central-1"},
    :ssl-common-name "opsworks.ca-central-1.amazonaws.com",
    :endpoint "https://opsworks.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "opsworks", :region "eu-central-1"},
    :ssl-common-name "opsworks.eu-central-1.amazonaws.com",
    :endpoint "https://opsworks.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "opsworks", :region "eu-west-2"},
    :ssl-common-name "opsworks.eu-west-2.amazonaws.com",
    :endpoint "https://opsworks.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "opsworks", :region "us-west-2"},
    :ssl-common-name "opsworks.us-west-2.amazonaws.com",
    :endpoint "https://opsworks.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "opsworks", :region "us-east-1"},
    :ssl-common-name "opsworks.us-east-1.amazonaws.com",
    :endpoint "https://opsworks.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "opsworks", :region "us-west-1"},
    :ssl-common-name "opsworks.us-west-1.amazonaws.com",
    :endpoint "https://opsworks.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "opsworks", :region "ap-south-1"},
    :ssl-common-name "opsworks.ap-south-1.amazonaws.com",
    :endpoint "https://opsworks.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
