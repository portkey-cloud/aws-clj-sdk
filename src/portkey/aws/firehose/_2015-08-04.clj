(ns portkey.aws.firehose.-2015-08-04 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "firehose", :region "ap-northeast-1"},
    :ssl-common-name "firehose.ap-northeast-1.amazonaws.com",
    :endpoint "https://firehose.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "firehose", :region "eu-west-1"},
    :ssl-common-name "firehose.eu-west-1.amazonaws.com",
    :endpoint "https://firehose.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "firehose", :region "us-east-2"},
    :ssl-common-name "firehose.us-east-2.amazonaws.com",
    :endpoint "https://firehose.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "firehose", :region "ap-southeast-2"},
    :ssl-common-name "firehose.ap-southeast-2.amazonaws.com",
    :endpoint "https://firehose.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "firehose", :region "ap-southeast-1"},
    :ssl-common-name "firehose.ap-southeast-1.amazonaws.com",
    :endpoint "https://firehose.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "firehose", :region "eu-central-1"},
    :ssl-common-name "firehose.eu-central-1.amazonaws.com",
    :endpoint "https://firehose.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "firehose", :region "us-west-2"},
    :ssl-common-name "firehose.us-west-2.amazonaws.com",
    :endpoint "https://firehose.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "firehose", :region "us-east-1"},
    :ssl-common-name "firehose.us-east-1.amazonaws.com",
    :endpoint "https://firehose.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "firehose", :region "us-west-1"},
    :ssl-common-name "firehose.us-west-1.amazonaws.com",
    :endpoint "https://firehose.us-west-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
