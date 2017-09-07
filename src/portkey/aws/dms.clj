(ns portkey.aws.dms (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "dms", "region" "ap-northeast-1"},
    :sslCommonName "dms.ap-northeast-1.amazonaws.com",
    :endpoint "https://dms.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "dms", "region" "eu-west-1"},
    :sslCommonName "dms.eu-west-1.amazonaws.com",
    :endpoint "https://dms.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "dms", "region" "us-east-2"},
    :sslCommonName "dms.us-east-2.amazonaws.com",
    :endpoint "https://dms.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "dms", "region" "ap-southeast-2"},
    :sslCommonName "dms.ap-southeast-2.amazonaws.com",
    :endpoint "https://dms.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "dms", "region" "sa-east-1"},
    :sslCommonName "dms.sa-east-1.amazonaws.com",
    :endpoint "https://dms.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "dms", "region" "ap-southeast-1"},
    :sslCommonName "dms.ap-southeast-1.amazonaws.com",
    :endpoint "https://dms.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "dms", "region" "ap-northeast-2"},
    :sslCommonName "dms.ap-northeast-2.amazonaws.com",
    :endpoint "https://dms.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "dms", "region" "ca-central-1"},
    :sslCommonName "dms.ca-central-1.amazonaws.com",
    :endpoint "https://dms.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "dms", "region" "eu-central-1"},
    :sslCommonName "dms.eu-central-1.amazonaws.com",
    :endpoint "https://dms.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "dms", "region" "eu-west-2"},
    :sslCommonName "dms.eu-west-2.amazonaws.com",
    :endpoint "https://dms.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "dms", "region" "us-west-2"},
    :sslCommonName "dms.us-west-2.amazonaws.com",
    :endpoint "https://dms.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "dms", "region" "us-east-1"},
    :sslCommonName "dms.us-east-1.amazonaws.com",
    :endpoint "https://dms.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "dms", "region" "us-west-1"},
    :sslCommonName "dms.us-west-1.amazonaws.com",
    :endpoint "https://dms.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "dms", "region" "ap-south-1"},
    :sslCommonName "dms.ap-south-1.amazonaws.com",
    :endpoint "https://dms.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
