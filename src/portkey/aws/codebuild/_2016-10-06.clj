(ns portkey.aws.codebuild.-2016-10-06 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "codebuild", "region" "ap-northeast-1"},
    :sslCommonName "codebuild.ap-northeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "codebuild", "region" "eu-west-1"},
    :sslCommonName "codebuild.eu-west-1.amazonaws.com",
    :endpoint "https://codebuild.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "codebuild", "region" "us-east-2"},
    :sslCommonName "codebuild.us-east-2.amazonaws.com",
    :endpoint "https://codebuild.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "codebuild", "region" "ap-southeast-2"},
    :sslCommonName "codebuild.ap-southeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "codebuild", "region" "ap-southeast-1"},
    :sslCommonName "codebuild.ap-southeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-1.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "codebuild", "region" "ca-central-1"},
    :sslCommonName "codebuild.ca-central-1.amazonaws.com",
    :endpoint "https://codebuild.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "codebuild", "region" "eu-central-1"},
    :sslCommonName "codebuild.eu-central-1.amazonaws.com",
    :endpoint "https://codebuild.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "codebuild", "region" "eu-west-2"},
    :sslCommonName "codebuild.eu-west-2.amazonaws.com",
    :endpoint "https://codebuild.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "codebuild", "region" "us-west-2"},
    :sslCommonName "codebuild.us-west-2.amazonaws.com",
    :endpoint "https://codebuild.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "codebuild", "region" "us-east-1"},
    :sslCommonName "codebuild.us-east-1.amazonaws.com",
    :endpoint "https://codebuild.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "codebuild", "region" "us-west-1"},
    :sslCommonName "codebuild.us-west-1.amazonaws.com",
    :endpoint "https://codebuild.us-west-1.amazonaws.com"}})

(comment TODO support "json")
