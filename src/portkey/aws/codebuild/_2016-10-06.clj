(ns portkey.aws.codebuild.-2016-10-06 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "codebuild", :region "ap-northeast-1"},
    :ssl-common-name "codebuild.ap-northeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "codebuild", :region "eu-west-1"},
    :ssl-common-name "codebuild.eu-west-1.amazonaws.com",
    :endpoint "https://codebuild.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "codebuild", :region "us-east-2"},
    :ssl-common-name "codebuild.us-east-2.amazonaws.com",
    :endpoint "https://codebuild.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "codebuild", :region "ap-southeast-2"},
    :ssl-common-name "codebuild.ap-southeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "codebuild", :region "ap-southeast-1"},
    :ssl-common-name "codebuild.ap-southeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-1.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "codebuild", :region "ca-central-1"},
    :ssl-common-name "codebuild.ca-central-1.amazonaws.com",
    :endpoint "https://codebuild.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "codebuild", :region "eu-central-1"},
    :ssl-common-name "codebuild.eu-central-1.amazonaws.com",
    :endpoint "https://codebuild.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "codebuild", :region "eu-west-2"},
    :ssl-common-name "codebuild.eu-west-2.amazonaws.com",
    :endpoint "https://codebuild.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "codebuild", :region "us-west-2"},
    :ssl-common-name "codebuild.us-west-2.amazonaws.com",
    :endpoint "https://codebuild.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "codebuild", :region "us-east-1"},
    :ssl-common-name "codebuild.us-east-1.amazonaws.com",
    :endpoint "https://codebuild.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "codebuild", :region "us-west-1"},
    :ssl-common-name "codebuild.us-west-1.amazonaws.com",
    :endpoint "https://codebuild.us-west-1.amazonaws.com"}})

(comment TODO support "json")
