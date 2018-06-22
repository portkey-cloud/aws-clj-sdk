(ns portkey.aws.rekognition (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "rekognition", :region "ap-northeast-1"},
    :ssl-common-name "rekognition.ap-northeast-1.amazonaws.com",
    :endpoint "https://rekognition.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "rekognition", :region "eu-west-1"},
    :ssl-common-name "rekognition.eu-west-1.amazonaws.com",
    :endpoint "https://rekognition.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "rekognition", :region "us-east-2"},
    :ssl-common-name "rekognition.us-east-2.amazonaws.com",
    :endpoint "https://rekognition.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "rekognition", :region "ap-southeast-2"},
    :ssl-common-name "rekognition.ap-southeast-2.amazonaws.com",
    :endpoint "https://rekognition.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "rekognition", :region "us-west-2"},
    :ssl-common-name "rekognition.us-west-2.amazonaws.com",
    :endpoint "https://rekognition.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "rekognition", :region "us-east-1"},
    :ssl-common-name "rekognition.us-east-1.amazonaws.com",
    :endpoint "https://rekognition.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "rekognition", :region "us-gov-west-1"},
    :ssl-common-name "rekognition.us-gov-west-1.amazonaws.com",
    :endpoint "https://rekognition.us-gov-west-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
