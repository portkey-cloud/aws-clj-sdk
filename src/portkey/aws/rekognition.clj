(ns portkey.aws.rekognition (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "rekognition", :region "eu-west-1"},
    :ssl-common-name "rekognition.eu-west-1.amazonaws.com",
    :endpoint "https://rekognition.eu-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "rekognition", :region "us-west-2"},
    :ssl-common-name "rekognition.us-west-2.amazonaws.com",
    :endpoint "https://rekognition.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "rekognition", :region "us-east-1"},
    :ssl-common-name "rekognition.us-east-1.amazonaws.com",
    :endpoint "https://rekognition.us-east-1.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope
    {:service "rekognition", :region "us-gov-west-1"},
    :ssl-common-name "rekognition.us-gov-west-1.amazonaws.com",
    :endpoint "https://rekognition.us-gov-west-1.amazonaws.com"}})

(comment TODO support "json")
