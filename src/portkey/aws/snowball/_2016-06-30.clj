(ns portkey.aws.snowball.-2016-06-30 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope {"service" "snowball", "region" "eu-west-1"},
    :sslCommonName "snowball.eu-west-1.amazonaws.com",
    :endpoint "https://snowball.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "snowball", "region" "us-east-2"},
    :sslCommonName "snowball.us-east-2.amazonaws.com",
    :endpoint "https://snowball.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "snowball", "region" "ap-southeast-2"},
    :sslCommonName "snowball.ap-southeast-2.amazonaws.com",
    :endpoint "https://snowball.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "snowball", "region" "sa-east-1"},
    :sslCommonName "snowball.sa-east-1.amazonaws.com",
    :endpoint "https://snowball.sa-east-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "snowball", "region" "eu-central-1"},
    :sslCommonName "snowball.eu-central-1.amazonaws.com",
    :endpoint "https://snowball.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "snowball", "region" "eu-west-2"},
    :sslCommonName "snowball.eu-west-2.amazonaws.com",
    :endpoint "https://snowball.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "snowball", "region" "us-gov-west-1"},
    :sslCommonName "snowball.us-gov-west-1.amazonaws.com",
    :endpoint "https://snowball.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "snowball", "region" "us-west-2"},
    :sslCommonName "snowball.us-west-2.amazonaws.com",
    :endpoint "https://snowball.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "snowball", "region" "us-east-1"},
    :sslCommonName "snowball.us-east-1.amazonaws.com",
    :endpoint "https://snowball.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "snowball", "region" "us-west-1"},
    :sslCommonName "snowball.us-west-1.amazonaws.com",
    :endpoint "https://snowball.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "snowball", "region" "ap-south-1"},
    :sslCommonName "snowball.ap-south-1.amazonaws.com",
    :endpoint "https://snowball.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
