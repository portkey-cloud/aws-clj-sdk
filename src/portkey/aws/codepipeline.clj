(ns portkey.aws.codepipeline (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "codepipeline", "region" "ap-northeast-1"},
    :sslCommonName "codepipeline.ap-northeast-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "codepipeline", "region" "eu-west-1"},
    :sslCommonName "codepipeline.eu-west-1.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "codepipeline", "region" "us-east-2"},
    :sslCommonName "codepipeline.us-east-2.amazonaws.com",
    :endpoint "https://codepipeline.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "codepipeline", "region" "ap-southeast-2"},
    :sslCommonName "codepipeline.ap-southeast-2.amazonaws.com",
    :endpoint "https://codepipeline.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "codepipeline", "region" "sa-east-1"},
    :sslCommonName "codepipeline.sa-east-1.amazonaws.com",
    :endpoint "https://codepipeline.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "codepipeline", "region" "ap-southeast-1"},
    :sslCommonName "codepipeline.ap-southeast-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "codepipeline", "region" "ap-northeast-2"},
    :sslCommonName "codepipeline.ap-northeast-2.amazonaws.com",
    :endpoint "https://codepipeline.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "codepipeline", "region" "ca-central-1"},
    :sslCommonName "codepipeline.ca-central-1.amazonaws.com",
    :endpoint "https://codepipeline.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "codepipeline", "region" "eu-central-1"},
    :sslCommonName "codepipeline.eu-central-1.amazonaws.com",
    :endpoint "https://codepipeline.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "codepipeline", "region" "eu-west-2"},
    :sslCommonName "codepipeline.eu-west-2.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "codepipeline", "region" "us-west-2"},
    :sslCommonName "codepipeline.us-west-2.amazonaws.com",
    :endpoint "https://codepipeline.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "codepipeline", "region" "us-east-1"},
    :sslCommonName "codepipeline.us-east-1.amazonaws.com",
    :endpoint "https://codepipeline.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "codepipeline", "region" "us-west-1"},
    :sslCommonName "codepipeline.us-west-1.amazonaws.com",
    :endpoint "https://codepipeline.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "codepipeline", "region" "ap-south-1"},
    :sslCommonName "codepipeline.ap-south-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
