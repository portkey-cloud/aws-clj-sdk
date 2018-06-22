(ns portkey.aws.acm-pca.-2017-08-22 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "acm-pca", :region "ap-northeast-1"},
    :ssl-common-name "acm-pca.ap-northeast-1.amazonaws.com",
    :endpoint "https://acm-pca.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "acm-pca", :region "eu-west-1"},
    :ssl-common-name "acm-pca.eu-west-1.amazonaws.com",
    :endpoint "https://acm-pca.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "acm-pca", :region "us-east-2"},
    :ssl-common-name "acm-pca.us-east-2.amazonaws.com",
    :endpoint "https://acm-pca.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "acm-pca", :region "ap-southeast-2"},
    :ssl-common-name "acm-pca.ap-southeast-2.amazonaws.com",
    :endpoint "https://acm-pca.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "acm-pca", :region "ap-southeast-1"},
    :ssl-common-name "acm-pca.ap-southeast-1.amazonaws.com",
    :endpoint "https://acm-pca.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "acm-pca", :region "ca-central-1"},
    :ssl-common-name "acm-pca.ca-central-1.amazonaws.com",
    :endpoint "https://acm-pca.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "acm-pca", :region "eu-central-1"},
    :ssl-common-name "acm-pca.eu-central-1.amazonaws.com",
    :endpoint "https://acm-pca.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "acm-pca", :region "us-west-2"},
    :ssl-common-name "acm-pca.us-west-2.amazonaws.com",
    :endpoint "https://acm-pca.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "acm-pca", :region "us-east-1"},
    :ssl-common-name "acm-pca.us-east-1.amazonaws.com",
    :endpoint "https://acm-pca.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
