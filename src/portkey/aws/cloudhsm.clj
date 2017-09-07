(ns portkey.aws.cloudhsm (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "cloudhsm", "region" "ap-northeast-1"},
    :sslCommonName "cloudhsm.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudhsm.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "cloudhsm", "region" "eu-west-1"},
    :sslCommonName "cloudhsm.eu-west-1.amazonaws.com",
    :endpoint "https://cloudhsm.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "cloudhsm", "region" "us-east-2"},
    :sslCommonName "cloudhsm.us-east-2.amazonaws.com",
    :endpoint "https://cloudhsm.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "cloudhsm", "region" "ap-southeast-2"},
    :sslCommonName "cloudhsm.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudhsm.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "cloudhsm", "region" "ap-southeast-1"},
    :sslCommonName "cloudhsm.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudhsm.ap-southeast-1.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "cloudhsm", "region" "ca-central-1"},
    :sslCommonName "cloudhsm.ca-central-1.amazonaws.com",
    :endpoint "https://cloudhsm.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "cloudhsm", "region" "eu-central-1"},
    :sslCommonName "cloudhsm.eu-central-1.amazonaws.com",
    :endpoint "https://cloudhsm.eu-central-1.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "cloudhsm", "region" "us-gov-west-1"},
    :sslCommonName "cloudhsm.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudhsm.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "cloudhsm", "region" "us-west-2"},
    :sslCommonName "cloudhsm.us-west-2.amazonaws.com",
    :endpoint "https://cloudhsm.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "cloudhsm", "region" "us-east-1"},
    :sslCommonName "cloudhsm.us-east-1.amazonaws.com",
    :endpoint "https://cloudhsm.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "cloudhsm", "region" "us-west-1"},
    :sslCommonName "cloudhsm.us-west-1.amazonaws.com",
    :endpoint "https://cloudhsm.us-west-1.amazonaws.com"}})

(comment TODO support "json")
