(ns portkey.aws.workspaces (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "workspaces", "region" "ap-northeast-1"},
    :sslCommonName "workspaces.ap-northeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "workspaces", "region" "eu-west-1"},
    :sslCommonName "workspaces.eu-west-1.amazonaws.com",
    :endpoint "https://workspaces.eu-west-1.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "workspaces", "region" "ap-southeast-2"},
    :sslCommonName "workspaces.ap-southeast-2.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "workspaces", "region" "ap-southeast-1"},
    :sslCommonName "workspaces.ap-southeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "workspaces", "region" "eu-central-1"},
    :sslCommonName "workspaces.eu-central-1.amazonaws.com",
    :endpoint "https://workspaces.eu-central-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "workspaces", "region" "us-west-2"},
    :sslCommonName "workspaces.us-west-2.amazonaws.com",
    :endpoint "https://workspaces.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "workspaces", "region" "us-east-1"},
    :sslCommonName "workspaces.us-east-1.amazonaws.com",
    :endpoint "https://workspaces.us-east-1.amazonaws.com"}})

(comment TODO support "json")
