(ns portkey.aws.sdb.-2009-04-15 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "sdb", :region "ap-northeast-1"},
    :ssl-common-name "sdb.ap-northeast-1.amazonaws.com",
    :endpoint "https://sdb.ap-northeast-1.amazonaws.com",
    :signature-version :v2},
   "eu-west-1"
   {:credential-scope {:service "sdb", :region "eu-west-1"},
    :ssl-common-name "sdb.eu-west-1.amazonaws.com",
    :endpoint "https://sdb.eu-west-1.amazonaws.com",
    :signature-version :v2},
   "ap-southeast-2"
   {:credential-scope {:service "sdb", :region "ap-southeast-2"},
    :ssl-common-name "sdb.ap-southeast-2.amazonaws.com",
    :endpoint "https://sdb.ap-southeast-2.amazonaws.com",
    :signature-version :v2},
   "sa-east-1"
   {:credential-scope {:service "sdb", :region "sa-east-1"},
    :ssl-common-name "sdb.sa-east-1.amazonaws.com",
    :endpoint "https://sdb.sa-east-1.amazonaws.com",
    :signature-version :v2},
   "ap-southeast-1"
   {:credential-scope {:service "sdb", :region "ap-southeast-1"},
    :ssl-common-name "sdb.ap-southeast-1.amazonaws.com",
    :endpoint "https://sdb.ap-southeast-1.amazonaws.com",
    :signature-version :v2},
   "us-west-2"
   {:credential-scope {:service "sdb", :region "us-west-2"},
    :ssl-common-name "sdb.us-west-2.amazonaws.com",
    :endpoint "https://sdb.us-west-2.amazonaws.com",
    :signature-version :v2},
   "us-east-1"
   {:credential-scope {:service "sdb", :region "us-east-1"},
    :ssl-common-name "sdb.amazonaws.com",
    :endpoint "https://sdb.amazonaws.com",
    :signature-version :v2},
   "us-west-1"
   {:credential-scope {:service "sdb", :region "us-west-1"},
    :ssl-common-name "sdb.us-west-1.amazonaws.com",
    :endpoint "https://sdb.us-west-1.amazonaws.com",
    :signature-version :v2}})

(comment TODO support "query")
