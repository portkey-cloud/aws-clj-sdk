(ns portkey.aws.codedeploy (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "codedeploy", :region "ap-northeast-1"},
    :ssl-common-name "codedeploy.ap-northeast-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codedeploy", :region "eu-west-1"},
    :ssl-common-name "codedeploy.eu-west-1.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codedeploy", :region "us-east-2"},
    :ssl-common-name "codedeploy.us-east-2.amazonaws.com",
    :endpoint "https://codedeploy.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "codedeploy", :region "ap-southeast-2"},
    :ssl-common-name "codedeploy.ap-southeast-2.amazonaws.com",
    :endpoint "https://codedeploy.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "codedeploy", :region "cn-north-1"},
    :ssl-common-name "codedeploy.cn-north-1.amazonaws.com.cn",
    :endpoint "https://codedeploy.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codedeploy", :region "sa-east-1"},
    :ssl-common-name "codedeploy.sa-east-1.amazonaws.com",
    :endpoint "https://codedeploy.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "codedeploy", :region "ap-southeast-1"},
    :ssl-common-name "codedeploy.ap-southeast-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "codedeploy", :region "cn-northwest-1"},
    :ssl-common-name "codedeploy.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://codedeploy.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "codedeploy", :region "ap-northeast-2"},
    :ssl-common-name "codedeploy.ap-northeast-2.amazonaws.com",
    :endpoint "https://codedeploy.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codedeploy", :region "eu-west-3"},
    :ssl-common-name "codedeploy.eu-west-3.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codedeploy", :region "ca-central-1"},
    :ssl-common-name "codedeploy.ca-central-1.amazonaws.com",
    :endpoint "https://codedeploy.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codedeploy", :region "eu-central-1"},
    :ssl-common-name "codedeploy.eu-central-1.amazonaws.com",
    :endpoint "https://codedeploy.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codedeploy", :region "eu-west-2"},
    :ssl-common-name "codedeploy.eu-west-2.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "codedeploy", :region "us-gov-west-1"},
    :ssl-common-name "codedeploy.us-gov-west-1.amazonaws.com",
    :endpoint "https://codedeploy.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codedeploy", :region "us-west-2"},
    :ssl-common-name "codedeploy.us-west-2.amazonaws.com",
    :endpoint "https://codedeploy.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codedeploy", :region "us-east-1"},
    :ssl-common-name "codedeploy.us-east-1.amazonaws.com",
    :endpoint "https://codedeploy.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codedeploy", :region "us-west-1"},
    :ssl-common-name "codedeploy.us-west-1.amazonaws.com",
    :endpoint "https://codedeploy.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codedeploy", :region "ap-south-1"},
    :ssl-common-name "codedeploy.ap-south-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
