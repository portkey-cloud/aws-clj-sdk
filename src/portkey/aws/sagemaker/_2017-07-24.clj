(ns portkey.aws.sagemaker.-2017-07-24 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "sagemaker", :region "eu-west-1"},
    :ssl-common-name "sagemaker.eu-west-1.amazonaws.com",
    :endpoint "https://sagemaker.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sagemaker", :region "us-east-2"},
    :ssl-common-name "sagemaker.us-east-2.amazonaws.com",
    :endpoint "https://sagemaker.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sagemaker", :region "us-west-2"},
    :ssl-common-name "sagemaker.us-west-2.amazonaws.com",
    :endpoint "https://sagemaker.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sagemaker", :region "us-east-1"},
    :ssl-common-name "sagemaker.us-east-1.amazonaws.com",
    :endpoint "https://sagemaker.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
