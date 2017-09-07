(ns portkey.aws.ecs (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "ecs", "region" "ap-northeast-1"},
    :sslCommonName "ecs.ap-northeast-1.amazonaws.com",
    :endpoint "https://ecs.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "ecs", "region" "eu-west-1"},
    :sslCommonName "ecs.eu-west-1.amazonaws.com",
    :endpoint "https://ecs.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "ecs", "region" "us-east-2"},
    :sslCommonName "ecs.us-east-2.amazonaws.com",
    :endpoint "https://ecs.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "ecs", "region" "ap-southeast-2"},
    :sslCommonName "ecs.ap-southeast-2.amazonaws.com",
    :endpoint "https://ecs.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "ecs", "region" "cn-north-1"},
    :sslCommonName "ecs.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ecs.cn-north-1.amazonaws.com.cn"},
   "ap-southeast-1"
   {:credentialScope {"service" "ecs", "region" "ap-southeast-1"},
    :sslCommonName "ecs.ap-southeast-1.amazonaws.com",
    :endpoint "https://ecs.ap-southeast-1.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "ecs", "region" "ca-central-1"},
    :sslCommonName "ecs.ca-central-1.amazonaws.com",
    :endpoint "https://ecs.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "ecs", "region" "eu-central-1"},
    :sslCommonName "ecs.eu-central-1.amazonaws.com",
    :endpoint "https://ecs.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "ecs", "region" "eu-west-2"},
    :sslCommonName "ecs.eu-west-2.amazonaws.com",
    :endpoint "https://ecs.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "ecs", "region" "us-west-2"},
    :sslCommonName "ecs.us-west-2.amazonaws.com",
    :endpoint "https://ecs.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "ecs", "region" "us-east-1"},
    :sslCommonName "ecs.us-east-1.amazonaws.com",
    :endpoint "https://ecs.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "ecs", "region" "us-west-1"},
    :sslCommonName "ecs.us-west-1.amazonaws.com",
    :endpoint "https://ecs.us-west-1.amazonaws.com"}})

(comment TODO support "json")
