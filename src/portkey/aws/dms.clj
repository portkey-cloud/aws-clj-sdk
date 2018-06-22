(ns portkey.aws.dms (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "dms", :region "ap-northeast-1"},
    :ssl-common-name "dms.ap-northeast-1.amazonaws.com",
    :endpoint "https://dms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "dms", :region "eu-west-1"},
    :ssl-common-name "dms.eu-west-1.amazonaws.com",
    :endpoint "https://dms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "dms", :region "us-east-2"},
    :ssl-common-name "dms.us-east-2.amazonaws.com",
    :endpoint "https://dms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "dms", :region "ap-southeast-2"},
    :ssl-common-name "dms.ap-southeast-2.amazonaws.com",
    :endpoint "https://dms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "dms", :region "sa-east-1"},
    :ssl-common-name "dms.sa-east-1.amazonaws.com",
    :endpoint "https://dms.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "dms", :region "ap-southeast-1"},
    :ssl-common-name "dms.ap-southeast-1.amazonaws.com",
    :endpoint "https://dms.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "dms", :region "ap-northeast-2"},
    :ssl-common-name "dms.ap-northeast-2.amazonaws.com",
    :endpoint "https://dms.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "dms", :region "eu-west-3"},
    :ssl-common-name "dms.eu-west-3.amazonaws.com",
    :endpoint "https://dms.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "dms", :region "ca-central-1"},
    :ssl-common-name "dms.ca-central-1.amazonaws.com",
    :endpoint "https://dms.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "dms", :region "eu-central-1"},
    :ssl-common-name "dms.eu-central-1.amazonaws.com",
    :endpoint "https://dms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "dms", :region "eu-west-2"},
    :ssl-common-name "dms.eu-west-2.amazonaws.com",
    :endpoint "https://dms.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "dms", :region "us-gov-west-1"},
    :ssl-common-name "dms.us-gov-west-1.amazonaws.com",
    :endpoint "https://dms.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "dms", :region "us-west-2"},
    :ssl-common-name "dms.us-west-2.amazonaws.com",
    :endpoint "https://dms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "dms", :region "us-east-1"},
    :ssl-common-name "dms.us-east-1.amazonaws.com",
    :endpoint "https://dms.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "dms", :region "us-west-1"},
    :ssl-common-name "dms.us-west-1.amazonaws.com",
    :endpoint "https://dms.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "dms", :region "ap-south-1"},
    :ssl-common-name "dms.ap-south-1.amazonaws.com",
    :endpoint "https://dms.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
