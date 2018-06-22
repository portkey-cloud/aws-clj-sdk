(ns portkey.aws.elasticmapreduce.-2009-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-northeast-1"},
    :ssl-common-name "ap-northeast-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-west-1"},
    :ssl-common-name "eu-west-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-east-2"},
    :ssl-common-name "us-east-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-southeast-2"},
    :ssl-common-name "ap-southeast-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "cn-north-1"},
    :ssl-common-name "elasticmapreduce.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticmapreduce.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "sa-east-1"},
    :ssl-common-name "sa-east-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-southeast-1"},
    :ssl-common-name "ap-southeast-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "cn-northwest-1"},
    :ssl-common-name
    "elasticmapreduce.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://elasticmapreduce.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-northeast-2"},
    :ssl-common-name "ap-northeast-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-west-3"},
    :ssl-common-name "eu-west-3.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ca-central-1"},
    :ssl-common-name "ca-central-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-central-1"},
    :ssl-common-name "elasticmapreduce.eu-central-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-west-2"},
    :ssl-common-name "eu-west-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-gov-west-1"},
    :ssl-common-name "elasticmapreduce.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-west-2"},
    :ssl-common-name "us-west-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-east-1"},
    :ssl-common-name "elasticmapreduce.us-east-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-west-1"},
    :ssl-common-name "us-west-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-south-1"},
    :ssl-common-name "ap-south-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
