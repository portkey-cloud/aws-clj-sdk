(ns portkey.aws.firehose.-2015-08-04 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope {"service" "firehose", "region" "eu-west-1"},
    :sslCommonName "firehose.eu-west-1.amazonaws.com",
    :endpoint "https://firehose.eu-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "firehose", "region" "us-west-2"},
    :sslCommonName "firehose.us-west-2.amazonaws.com",
    :endpoint "https://firehose.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "firehose", "region" "us-east-1"},
    :sslCommonName "firehose.us-east-1.amazonaws.com",
    :endpoint "https://firehose.us-east-1.amazonaws.com"}})

(comment TODO support "json")
