(ns portkey.aws.glue.-2017-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "glue", :region "ap-northeast-1"},
    :ssl-common-name "glue.ap-northeast-1.amazonaws.com",
    :endpoint "https://glue.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "glue", :region "eu-west-1"},
    :ssl-common-name "glue.eu-west-1.amazonaws.com",
    :endpoint "https://glue.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "glue", :region "us-east-2"},
    :ssl-common-name "glue.us-east-2.amazonaws.com",
    :endpoint "https://glue.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "glue", :region "ap-southeast-2"},
    :ssl-common-name "glue.ap-southeast-2.amazonaws.com",
    :endpoint "https://glue.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "glue", :region "ap-southeast-1"},
    :ssl-common-name "glue.ap-southeast-1.amazonaws.com",
    :endpoint "https://glue.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "glue", :region "eu-central-1"},
    :ssl-common-name "glue.eu-central-1.amazonaws.com",
    :endpoint "https://glue.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "glue", :region "us-west-2"},
    :ssl-common-name "glue.us-west-2.amazonaws.com",
    :endpoint "https://glue.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "glue", :region "us-east-1"},
    :ssl-common-name "glue.us-east-1.amazonaws.com",
    :endpoint "https://glue.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "glue", :region "ap-south-1"},
    :ssl-common-name "glue.ap-south-1.amazonaws.com",
    :endpoint "https://glue.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
