(ns portkey.aws.codepipeline (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "codepipeline", :region "ap-northeast-1"},
    :ssl-common-name "codepipeline.ap-northeast-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codepipeline", :region "eu-west-1"},
    :ssl-common-name "codepipeline.eu-west-1.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codepipeline", :region "us-east-2"},
    :ssl-common-name "codepipeline.us-east-2.amazonaws.com",
    :endpoint "https://codepipeline.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "codepipeline", :region "ap-southeast-2"},
    :ssl-common-name "codepipeline.ap-southeast-2.amazonaws.com",
    :endpoint "https://codepipeline.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codepipeline", :region "sa-east-1"},
    :ssl-common-name "codepipeline.sa-east-1.amazonaws.com",
    :endpoint "https://codepipeline.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "codepipeline", :region "ap-southeast-1"},
    :ssl-common-name "codepipeline.ap-southeast-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "codepipeline", :region "ap-northeast-2"},
    :ssl-common-name "codepipeline.ap-northeast-2.amazonaws.com",
    :endpoint "https://codepipeline.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codepipeline", :region "eu-west-3"},
    :ssl-common-name "codepipeline.eu-west-3.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "codepipeline", :region "ca-central-1"},
    :ssl-common-name "codepipeline.ca-central-1.amazonaws.com",
    :endpoint "https://codepipeline.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "codepipeline", :region "eu-central-1"},
    :ssl-common-name "codepipeline.eu-central-1.amazonaws.com",
    :endpoint "https://codepipeline.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codepipeline", :region "eu-west-2"},
    :ssl-common-name "codepipeline.eu-west-2.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codepipeline", :region "us-west-2"},
    :ssl-common-name "codepipeline.us-west-2.amazonaws.com",
    :endpoint "https://codepipeline.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codepipeline", :region "us-east-1"},
    :ssl-common-name "codepipeline.us-east-1.amazonaws.com",
    :endpoint "https://codepipeline.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codepipeline", :region "us-west-1"},
    :ssl-common-name "codepipeline.us-west-1.amazonaws.com",
    :endpoint "https://codepipeline.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codepipeline", :region "ap-south-1"},
    :ssl-common-name "codepipeline.ap-south-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
