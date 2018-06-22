(ns portkey.aws.dax (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "dax", :region "ap-northeast-1"},
    :ssl-common-name "dax.ap-northeast-1.amazonaws.com",
    :endpoint "https://dax.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "dax", :region "eu-west-1"},
    :ssl-common-name "dax.eu-west-1.amazonaws.com",
    :endpoint "https://dax.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "dax", :region "us-east-2"},
    :ssl-common-name "dax.us-east-2.amazonaws.com",
    :endpoint "https://dax.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "dax", :region "ap-southeast-2"},
    :ssl-common-name "dax.ap-southeast-2.amazonaws.com",
    :endpoint "https://dax.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "dax", :region "sa-east-1"},
    :ssl-common-name "dax.sa-east-1.amazonaws.com",
    :endpoint "https://dax.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "dax", :region "ap-southeast-1"},
    :ssl-common-name "dax.ap-southeast-1.amazonaws.com",
    :endpoint "https://dax.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "dax", :region "us-west-2"},
    :ssl-common-name "dax.us-west-2.amazonaws.com",
    :endpoint "https://dax.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "dax", :region "us-east-1"},
    :ssl-common-name "dax.us-east-1.amazonaws.com",
    :endpoint "https://dax.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "dax", :region "us-west-1"},
    :ssl-common-name "dax.us-west-1.amazonaws.com",
    :endpoint "https://dax.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "dax", :region "ap-south-1"},
    :ssl-common-name "dax.ap-south-1.amazonaws.com",
    :endpoint "https://dax.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
