(ns portkey.aws.kms (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "kms", "region" "ap-northeast-1"},
    :sslCommonName "kms.ap-northeast-1.amazonaws.com",
    :endpoint "https://kms.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "kms", "region" "eu-west-1"},
    :sslCommonName "kms.eu-west-1.amazonaws.com",
    :endpoint "https://kms.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "kms", "region" "us-east-2"},
    :sslCommonName "kms.us-east-2.amazonaws.com",
    :endpoint "https://kms.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "kms", "region" "ap-southeast-2"},
    :sslCommonName "kms.ap-southeast-2.amazonaws.com",
    :endpoint "https://kms.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "kms", "region" "sa-east-1"},
    :sslCommonName "kms.sa-east-1.amazonaws.com",
    :endpoint "https://kms.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "kms", "region" "ap-southeast-1"},
    :sslCommonName "kms.ap-southeast-1.amazonaws.com",
    :endpoint "https://kms.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "kms", "region" "ap-northeast-2"},
    :sslCommonName "kms.ap-northeast-2.amazonaws.com",
    :endpoint "https://kms.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "kms", "region" "ca-central-1"},
    :sslCommonName "kms.ca-central-1.amazonaws.com",
    :endpoint "https://kms.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "kms", "region" "eu-central-1"},
    :sslCommonName "kms.eu-central-1.amazonaws.com",
    :endpoint "https://kms.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "kms", "region" "eu-west-2"},
    :sslCommonName "kms.eu-west-2.amazonaws.com",
    :endpoint "https://kms.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "kms", "region" "us-gov-west-1"},
    :sslCommonName "kms.us-gov-west-1.amazonaws.com",
    :endpoint "https://kms.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "kms", "region" "us-west-2"},
    :sslCommonName "kms.us-west-2.amazonaws.com",
    :endpoint "https://kms.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "kms", "region" "us-east-1"},
    :sslCommonName "kms.us-east-1.amazonaws.com",
    :endpoint "https://kms.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "kms", "region" "us-west-1"},
    :sslCommonName "kms.us-west-1.amazonaws.com",
    :endpoint "https://kms.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "kms", "region" "ap-south-1"},
    :sslCommonName "kms.ap-south-1.amazonaws.com",
    :endpoint "https://kms.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
