(ns portkey.aws.cognito-idp (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cognito-idp", :region "ap-northeast-1"},
    :ssl-common-name "cognito-idp.ap-northeast-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "cognito-idp", :region "eu-west-1"},
    :ssl-common-name "cognito-idp.eu-west-1.amazonaws.com",
    :endpoint "https://cognito-idp.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "cognito-idp", :region "us-east-2"},
    :ssl-common-name "cognito-idp.us-east-2.amazonaws.com",
    :endpoint "https://cognito-idp.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope
    {:service "cognito-idp", :region "ap-southeast-2"},
    :ssl-common-name "cognito-idp.ap-southeast-2.amazonaws.com",
    :endpoint "https://cognito-idp.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope
    {:service "cognito-idp", :region "ap-southeast-1"},
    :ssl-common-name "cognito-idp.ap-southeast-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope
    {:service "cognito-idp", :region "ap-northeast-2"},
    :ssl-common-name "cognito-idp.ap-northeast-2.amazonaws.com",
    :endpoint "https://cognito-idp.ap-northeast-2.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "cognito-idp", :region "eu-central-1"},
    :ssl-common-name "cognito-idp.eu-central-1.amazonaws.com",
    :endpoint "https://cognito-idp.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "cognito-idp", :region "eu-west-2"},
    :ssl-common-name "cognito-idp.eu-west-2.amazonaws.com",
    :endpoint "https://cognito-idp.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "cognito-idp", :region "us-west-2"},
    :ssl-common-name "cognito-idp.us-west-2.amazonaws.com",
    :endpoint "https://cognito-idp.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "cognito-idp", :region "us-east-1"},
    :ssl-common-name "cognito-idp.us-east-1.amazonaws.com",
    :endpoint "https://cognito-idp.us-east-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "cognito-idp", :region "ap-south-1"},
    :ssl-common-name "cognito-idp.ap-south-1.amazonaws.com",
    :endpoint "https://cognito-idp.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
