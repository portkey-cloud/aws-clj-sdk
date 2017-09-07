(ns portkey.aws.dynamodb.-2012-08-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "dynamodb", "region" "ap-northeast-1"},
    :sslCommonName "dynamodb.ap-northeast-1.amazonaws.com",
    :endpoint "https://dynamodb.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "dynamodb", "region" "eu-west-1"},
    :sslCommonName "dynamodb.eu-west-1.amazonaws.com",
    :endpoint "https://dynamodb.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "dynamodb", "region" "us-east-2"},
    :sslCommonName "dynamodb.us-east-2.amazonaws.com",
    :endpoint "https://dynamodb.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "dynamodb", "region" "ap-southeast-2"},
    :sslCommonName "dynamodb.ap-southeast-2.amazonaws.com",
    :endpoint "https://dynamodb.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "dynamodb", "region" "cn-north-1"},
    :sslCommonName "dynamodb.cn-north-1.amazonaws.com.cn",
    :endpoint "https://dynamodb.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "dynamodb", "region" "sa-east-1"},
    :sslCommonName "dynamodb.sa-east-1.amazonaws.com",
    :endpoint "https://dynamodb.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "dynamodb", "region" "ap-southeast-1"},
    :sslCommonName "dynamodb.ap-southeast-1.amazonaws.com",
    :endpoint "https://dynamodb.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "dynamodb", "region" "ap-northeast-2"},
    :sslCommonName "dynamodb.ap-northeast-2.amazonaws.com",
    :endpoint "https://dynamodb.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "dynamodb", "region" "ca-central-1"},
    :sslCommonName "dynamodb.ca-central-1.amazonaws.com",
    :endpoint "https://dynamodb.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "dynamodb", "region" "eu-central-1"},
    :sslCommonName "dynamodb.eu-central-1.amazonaws.com",
    :endpoint "https://dynamodb.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "dynamodb", "region" "eu-west-2"},
    :sslCommonName "dynamodb.eu-west-2.amazonaws.com",
    :endpoint "https://dynamodb.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "dynamodb", "region" "us-gov-west-1"},
    :sslCommonName "dynamodb.us-gov-west-1.amazonaws.com",
    :endpoint "https://dynamodb.us-gov-west-1.amazonaws.com"},
   "local"
   {:credentialScope {"service" "dynamodb", "region" "us-east-1"},
    :sslCommonName "localhost:8000",
    :endpoint "http://localhost:8000"},
   "us-west-2"
   {:credentialScope {"service" "dynamodb", "region" "us-west-2"},
    :sslCommonName "dynamodb.us-west-2.amazonaws.com",
    :endpoint "https://dynamodb.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "dynamodb", "region" "us-east-1"},
    :sslCommonName "dynamodb.us-east-1.amazonaws.com",
    :endpoint "https://dynamodb.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "dynamodb", "region" "us-west-1"},
    :sslCommonName "dynamodb.us-west-1.amazonaws.com",
    :endpoint "https://dynamodb.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "dynamodb", "region" "ap-south-1"},
    :sslCommonName "dynamodb.ap-south-1.amazonaws.com",
    :endpoint "https://dynamodb.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
