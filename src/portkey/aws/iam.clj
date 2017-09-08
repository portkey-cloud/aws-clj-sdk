(ns portkey.aws.iam (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-cn-global"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-us-gov-global"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "query")
