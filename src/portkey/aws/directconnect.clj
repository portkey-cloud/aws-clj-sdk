(ns portkey.aws.directconnect (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "directconnect", :region "ap-northeast-1"},
    :ssl-common-name "directconnect.ap-northeast-1.amazonaws.com",
    :endpoint "https://directconnect.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "directconnect", :region "eu-west-1"},
    :ssl-common-name "directconnect.eu-west-1.amazonaws.com",
    :endpoint "https://directconnect.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "directconnect", :region "us-east-2"},
    :ssl-common-name "directconnect.us-east-2.amazonaws.com",
    :endpoint "https://directconnect.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "directconnect", :region "ap-southeast-2"},
    :ssl-common-name "directconnect.ap-southeast-2.amazonaws.com",
    :endpoint "https://directconnect.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "directconnect", :region "cn-north-1"},
    :ssl-common-name "directconnect.cn-north-1.amazonaws.com.cn",
    :endpoint "https://directconnect.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "directconnect", :region "sa-east-1"},
    :ssl-common-name "directconnect.sa-east-1.amazonaws.com",
    :endpoint "https://directconnect.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "directconnect", :region "ap-southeast-1"},
    :ssl-common-name "directconnect.ap-southeast-1.amazonaws.com",
    :endpoint "https://directconnect.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "directconnect", :region "cn-northwest-1"},
    :ssl-common-name "directconnect.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://directconnect.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "directconnect", :region "ap-northeast-2"},
    :ssl-common-name "directconnect.ap-northeast-2.amazonaws.com",
    :endpoint "https://directconnect.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "directconnect", :region "eu-west-3"},
    :ssl-common-name "directconnect.eu-west-3.amazonaws.com",
    :endpoint "https://directconnect.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "directconnect", :region "ca-central-1"},
    :ssl-common-name "directconnect.ca-central-1.amazonaws.com",
    :endpoint "https://directconnect.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "directconnect", :region "eu-central-1"},
    :ssl-common-name "directconnect.eu-central-1.amazonaws.com",
    :endpoint "https://directconnect.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "directconnect", :region "eu-west-2"},
    :ssl-common-name "directconnect.eu-west-2.amazonaws.com",
    :endpoint "https://directconnect.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "directconnect", :region "us-gov-west-1"},
    :ssl-common-name "directconnect.us-gov-west-1.amazonaws.com",
    :endpoint "https://directconnect.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "directconnect", :region "us-west-2"},
    :ssl-common-name "directconnect.us-west-2.amazonaws.com",
    :endpoint "https://directconnect.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "directconnect", :region "us-east-1"},
    :ssl-common-name "directconnect.us-east-1.amazonaws.com",
    :endpoint "https://directconnect.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "directconnect", :region "us-west-1"},
    :ssl-common-name "directconnect.us-west-1.amazonaws.com",
    :endpoint "https://directconnect.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "directconnect", :region "ap-south-1"},
    :ssl-common-name "directconnect.ap-south-1.amazonaws.com",
    :endpoint "https://directconnect.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
