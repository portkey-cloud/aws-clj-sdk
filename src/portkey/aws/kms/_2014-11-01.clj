(ns portkey.aws.kms.-2014-11-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "kms", :region "ap-northeast-1"},
    :ssl-common-name "kms.ap-northeast-1.amazonaws.com",
    :endpoint "https://kms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kms", :region "eu-west-1"},
    :ssl-common-name "kms.eu-west-1.amazonaws.com",
    :endpoint "https://kms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "kms", :region "us-east-2"},
    :ssl-common-name "kms.us-east-2.amazonaws.com",
    :endpoint "https://kms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "kms", :region "ap-southeast-2"},
    :ssl-common-name "kms.ap-southeast-2.amazonaws.com",
    :endpoint "https://kms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "kms", :region "sa-east-1"},
    :ssl-common-name "kms.sa-east-1.amazonaws.com",
    :endpoint "https://kms.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "kms", :region "ap-southeast-1"},
    :ssl-common-name "kms.ap-southeast-1.amazonaws.com",
    :endpoint "https://kms.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "kms", :region "ap-northeast-2"},
    :ssl-common-name "kms.ap-northeast-2.amazonaws.com",
    :endpoint "https://kms.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "kms", :region "eu-west-3"},
    :ssl-common-name "kms.eu-west-3.amazonaws.com",
    :endpoint "https://kms.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "kms", :region "ca-central-1"},
    :ssl-common-name "kms.ca-central-1.amazonaws.com",
    :endpoint "https://kms.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "kms", :region "eu-central-1"},
    :ssl-common-name "kms.eu-central-1.amazonaws.com",
    :endpoint "https://kms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "kms", :region "eu-west-2"},
    :ssl-common-name "kms.eu-west-2.amazonaws.com",
    :endpoint "https://kms.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "kms", :region "us-gov-west-1"},
    :ssl-common-name "kms.us-gov-west-1.amazonaws.com",
    :endpoint "https://kms.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kms", :region "us-west-2"},
    :ssl-common-name "kms.us-west-2.amazonaws.com",
    :endpoint "https://kms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kms", :region "us-east-1"},
    :ssl-common-name "kms.us-east-1.amazonaws.com",
    :endpoint "https://kms.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "kms", :region "us-west-1"},
    :ssl-common-name "kms.us-west-1.amazonaws.com",
    :endpoint "https://kms.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "kms", :region "ap-south-1"},
    :ssl-common-name "kms.ap-south-1.amazonaws.com",
    :endpoint "https://kms.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
