(ns portkey.aws.codebuild (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "codebuild", :region "us-west-1"},
    :ssl-common-name "codebuild-fips.us-west-1.amazonaws.com",
    :endpoint "https://codebuild-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "codebuild", :region "ap-northeast-1"},
    :ssl-common-name "codebuild.ap-northeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codebuild", :region "eu-west-1"},
    :ssl-common-name "codebuild.eu-west-1.amazonaws.com",
    :endpoint "https://codebuild.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codebuild", :region "us-east-2"},
    :ssl-common-name "codebuild.us-east-2.amazonaws.com",
    :endpoint "https://codebuild.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "codebuild", :region "ap-southeast-2"},
    :ssl-common-name "codebuild.ap-southeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codebuild", :region "sa-east-1"},
    :ssl-common-name "codebuild.sa-east-1.amazonaws.com",
    :endpoint "https://codebuild.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "codebuild", :region "ap-southeast-1"},
    :ssl-common-name "codebuild.ap-southeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "codebuild", :region "ap-northeast-2"},
    :ssl-common-name "codebuild.ap-northeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codebuild", :region "eu-west-3"},
    :ssl-common-name "codebuild.eu-west-3.amazonaws.com",
    :endpoint "https://codebuild.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "codebuild", :region "us-east-2"},
    :ssl-common-name "codebuild-fips.us-east-2.amazonaws.com",
    :endpoint "https://codebuild-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codebuild", :region "ca-central-1"},
    :ssl-common-name "codebuild.ca-central-1.amazonaws.com",
    :endpoint "https://codebuild.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codebuild", :region "eu-central-1"},
    :ssl-common-name "codebuild.eu-central-1.amazonaws.com",
    :endpoint "https://codebuild.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codebuild", :region "eu-west-2"},
    :ssl-common-name "codebuild.eu-west-2.amazonaws.com",
    :endpoint "https://codebuild.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "codebuild", :region "us-east-1"},
    :ssl-common-name "codebuild-fips.us-east-1.amazonaws.com",
    :endpoint "https://codebuild-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codebuild", :region "us-west-2"},
    :ssl-common-name "codebuild.us-west-2.amazonaws.com",
    :endpoint "https://codebuild.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "codebuild", :region "us-west-2"},
    :ssl-common-name "codebuild-fips.us-west-2.amazonaws.com",
    :endpoint "https://codebuild-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codebuild", :region "us-east-1"},
    :ssl-common-name "codebuild.us-east-1.amazonaws.com",
    :endpoint "https://codebuild.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codebuild", :region "us-west-1"},
    :ssl-common-name "codebuild.us-west-1.amazonaws.com",
    :endpoint "https://codebuild.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codebuild", :region "ap-south-1"},
    :ssl-common-name "codebuild.ap-south-1.amazonaws.com",
    :endpoint "https://codebuild.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
