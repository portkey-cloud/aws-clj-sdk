(ns portkey.aws.workspaces (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "workspaces", :region "ap-northeast-1"},
    :ssl-common-name "workspaces.ap-northeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "workspaces", :region "eu-west-1"},
    :ssl-common-name "workspaces.eu-west-1.amazonaws.com",
    :endpoint "https://workspaces.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "workspaces", :region "ap-southeast-2"},
    :ssl-common-name "workspaces.ap-southeast-2.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "workspaces", :region "sa-east-1"},
    :ssl-common-name "workspaces.sa-east-1.amazonaws.com",
    :endpoint "https://workspaces.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "workspaces", :region "ap-southeast-1"},
    :ssl-common-name "workspaces.ap-southeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "workspaces", :region "ap-northeast-2"},
    :ssl-common-name "workspaces.ap-northeast-2.amazonaws.com",
    :endpoint "https://workspaces.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "workspaces", :region "eu-central-1"},
    :ssl-common-name "workspaces.eu-central-1.amazonaws.com",
    :endpoint "https://workspaces.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "workspaces", :region "eu-west-2"},
    :ssl-common-name "workspaces.eu-west-2.amazonaws.com",
    :endpoint "https://workspaces.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "workspaces", :region "us-west-2"},
    :ssl-common-name "workspaces.us-west-2.amazonaws.com",
    :endpoint "https://workspaces.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "workspaces", :region "us-east-1"},
    :ssl-common-name "workspaces.us-east-1.amazonaws.com",
    :endpoint "https://workspaces.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
