(ns portkey.aws.cloudformation (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cloudformation", :region "ap-northeast-1"},
    :ssl-common-name "cloudformation.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudformation", :region "eu-west-1"},
    :ssl-common-name "cloudformation.eu-west-1.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudformation", :region "us-east-2"},
    :ssl-common-name "cloudformation.us-east-2.amazonaws.com",
    :endpoint "https://cloudformation.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cloudformation", :region "ap-southeast-2"},
    :ssl-common-name "cloudformation.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudformation.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "cloudformation", :region "cn-north-1"},
    :ssl-common-name "cloudformation.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cloudformation.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudformation", :region "sa-east-1"},
    :ssl-common-name "cloudformation.sa-east-1.amazonaws.com",
    :endpoint "https://cloudformation.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cloudformation", :region "ap-southeast-1"},
    :ssl-common-name "cloudformation.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "cloudformation", :region "cn-northwest-1"},
    :ssl-common-name "cloudformation.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://cloudformation.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cloudformation", :region "ap-northeast-2"},
    :ssl-common-name "cloudformation.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudformation.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudformation", :region "eu-west-3"},
    :ssl-common-name "cloudformation.eu-west-3.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "cloudformation", :region "ca-central-1"},
    :ssl-common-name "cloudformation.ca-central-1.amazonaws.com",
    :endpoint "https://cloudformation.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "cloudformation", :region "eu-central-1"},
    :ssl-common-name "cloudformation.eu-central-1.amazonaws.com",
    :endpoint "https://cloudformation.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudformation", :region "eu-west-2"},
    :ssl-common-name "cloudformation.eu-west-2.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "cloudformation", :region "us-gov-west-1"},
    :ssl-common-name "cloudformation.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudformation.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudformation", :region "us-west-2"},
    :ssl-common-name "cloudformation.us-west-2.amazonaws.com",
    :endpoint "https://cloudformation.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudformation", :region "us-east-1"},
    :ssl-common-name "cloudformation.us-east-1.amazonaws.com",
    :endpoint "https://cloudformation.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudformation", :region "us-west-1"},
    :ssl-common-name "cloudformation.us-west-1.amazonaws.com",
    :endpoint "https://cloudformation.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "cloudformation", :region "ap-south-1"},
    :ssl-common-name "cloudformation.ap-south-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "query")
