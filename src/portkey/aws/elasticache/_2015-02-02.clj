(ns portkey.aws.elasticache.-2015-02-02 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticache", :region "ap-northeast-1"},
    :ssl-common-name "elasticache.ap-northeast-1.amazonaws.com",
    :endpoint "https://elasticache.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "elasticache", :region "eu-west-1"},
    :ssl-common-name "elasticache.eu-west-1.amazonaws.com",
    :endpoint "https://elasticache.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "elasticache", :region "us-east-2"},
    :ssl-common-name "elasticache.us-east-2.amazonaws.com",
    :endpoint "https://elasticache.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticache", :region "ap-southeast-2"},
    :ssl-common-name "elasticache.ap-southeast-2.amazonaws.com",
    :endpoint "https://elasticache.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "elasticache", :region "cn-north-1"},
    :ssl-common-name "elasticache.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticache.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "elasticache", :region "sa-east-1"},
    :ssl-common-name "elasticache.sa-east-1.amazonaws.com",
    :endpoint "https://elasticache.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticache", :region "ap-southeast-1"},
    :ssl-common-name "elasticache.ap-southeast-1.amazonaws.com",
    :endpoint "https://elasticache.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticache", :region "ap-northeast-2"},
    :ssl-common-name "elasticache.ap-northeast-2.amazonaws.com",
    :endpoint "https://elasticache.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "elasticache", :region "ca-central-1"},
    :ssl-common-name "elasticache.ca-central-1.amazonaws.com",
    :endpoint "https://elasticache.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "elasticache", :region "eu-central-1"},
    :ssl-common-name "elasticache.eu-central-1.amazonaws.com",
    :endpoint "https://elasticache.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "elasticache", :region "eu-west-2"},
    :ssl-common-name "elasticache.eu-west-2.amazonaws.com",
    :endpoint "https://elasticache.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticache", :region "us-gov-west-1"},
    :ssl-common-name "elasticache.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticache.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "elasticache", :region "us-west-2"},
    :ssl-common-name "elasticache.us-west-2.amazonaws.com",
    :endpoint "https://elasticache.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "elasticache", :region "us-east-1"},
    :ssl-common-name "elasticache.us-east-1.amazonaws.com",
    :endpoint "https://elasticache.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "elasticache", :region "us-west-1"},
    :ssl-common-name "elasticache.us-west-1.amazonaws.com",
    :endpoint "https://elasticache.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "elasticache", :region "ap-south-1"},
    :ssl-common-name "elasticache.ap-south-1.amazonaws.com",
    :endpoint "https://elasticache.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "query")
