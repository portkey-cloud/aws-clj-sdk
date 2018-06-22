(ns portkey.aws.application-autoscaling (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "application-autoscaling", :region "ap-northeast-1"},
    :ssl-common-name "autoscaling.ap-northeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "application-autoscaling", :region "eu-west-1"},
    :ssl-common-name "autoscaling.eu-west-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "application-autoscaling", :region "us-east-2"},
    :ssl-common-name "autoscaling.us-east-2.amazonaws.com",
    :endpoint "https://autoscaling.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "application-autoscaling", :region "ap-southeast-2"},
    :ssl-common-name "autoscaling.ap-southeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "application-autoscaling", :region "cn-north-1"},
    :ssl-common-name "autoscaling.cn-north-1.amazonaws.com",
    :endpoint "https://autoscaling.cn-north-1.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "application-autoscaling", :region "sa-east-1"},
    :ssl-common-name "autoscaling.sa-east-1.amazonaws.com",
    :endpoint "https://autoscaling.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "application-autoscaling", :region "ap-southeast-1"},
    :ssl-common-name "autoscaling.ap-southeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "application-autoscaling", :region "cn-northwest-1"},
    :ssl-common-name "autoscaling.cn-northwest-1.amazonaws.com",
    :endpoint "https://autoscaling.cn-northwest-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "application-autoscaling", :region "ap-northeast-2"},
    :ssl-common-name "autoscaling.ap-northeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "application-autoscaling", :region "eu-west-3"},
    :ssl-common-name "autoscaling.eu-west-3.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "application-autoscaling", :region "ca-central-1"},
    :ssl-common-name "autoscaling.ca-central-1.amazonaws.com",
    :endpoint "https://autoscaling.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "application-autoscaling", :region "eu-central-1"},
    :ssl-common-name "autoscaling.eu-central-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "application-autoscaling", :region "eu-west-2"},
    :ssl-common-name "autoscaling.eu-west-2.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "application-autoscaling", :region "us-west-2"},
    :ssl-common-name "autoscaling.us-west-2.amazonaws.com",
    :endpoint "https://autoscaling.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "application-autoscaling", :region "us-east-1"},
    :ssl-common-name "autoscaling.us-east-1.amazonaws.com",
    :endpoint "https://autoscaling.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "application-autoscaling", :region "us-west-1"},
    :ssl-common-name "autoscaling.us-west-1.amazonaws.com",
    :endpoint "https://autoscaling.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "application-autoscaling", :region "ap-south-1"},
    :ssl-common-name "autoscaling.ap-south-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
