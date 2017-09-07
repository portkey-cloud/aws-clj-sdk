(ns portkey.aws.codestar.-2017-04-19 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credentialScope {"service" "codestar", "region" "eu-west-1"},
    :sslCommonName "codestar.eu-west-1.amazonaws.com",
    :endpoint "https://codestar.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "codestar", "region" "us-east-2"},
    :sslCommonName "codestar.us-east-2.amazonaws.com",
    :endpoint "https://codestar.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "codestar", "region" "ap-southeast-2"},
    :sslCommonName "codestar.ap-southeast-2.amazonaws.com",
    :endpoint "https://codestar.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "codestar", "region" "ap-southeast-1"},
    :sslCommonName "codestar.ap-southeast-1.amazonaws.com",
    :endpoint "https://codestar.ap-southeast-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "codestar", "region" "eu-central-1"},
    :sslCommonName "codestar.eu-central-1.amazonaws.com",
    :endpoint "https://codestar.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "codestar", "region" "eu-west-2"},
    :sslCommonName "codestar.eu-west-2.amazonaws.com",
    :endpoint "https://codestar.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "codestar", "region" "us-west-2"},
    :sslCommonName "codestar.us-west-2.amazonaws.com",
    :endpoint "https://codestar.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "codestar", "region" "us-east-1"},
    :sslCommonName "codestar.us-east-1.amazonaws.com",
    :endpoint "https://codestar.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "codestar", "region" "us-west-1"},
    :sslCommonName "codestar.us-west-1.amazonaws.com",
    :endpoint "https://codestar.us-west-1.amazonaws.com"}})

(comment TODO support "json")
