(ns portkey.aws.sqs.-2012-11-05 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "sqs", "region" "ap-northeast-1"},
    :sslCommonName "ap-northeast-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "sqs", "region" "eu-west-1"},
    :sslCommonName "eu-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "sqs", "region" "us-east-2"},
    :sslCommonName "us-east-2.queue.amazonaws.com",
    :endpoint "https://sqs.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "sqs", "region" "ap-southeast-2"},
    :sslCommonName "ap-southeast-2.queue.amazonaws.com",
    :endpoint "https://sqs.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "sqs", "region" "cn-north-1"},
    :sslCommonName "cn-north-1.queue.amazonaws.com.cn",
    :endpoint "https://sqs.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "sqs", "region" "sa-east-1"},
    :sslCommonName "sa-east-1.queue.amazonaws.com",
    :endpoint "https://sqs.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "sqs", "region" "ap-southeast-1"},
    :sslCommonName "ap-southeast-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "sqs", "region" "ap-northeast-2"},
    :sslCommonName "ap-northeast-2.queue.amazonaws.com",
    :endpoint "https://sqs.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "sqs", "region" "ca-central-1"},
    :sslCommonName "ca-central-1.queue.amazonaws.com",
    :endpoint "https://sqs.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "sqs", "region" "eu-central-1"},
    :sslCommonName "eu-central-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "sqs", "region" "eu-west-2"},
    :sslCommonName "eu-west-2.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "sqs", "region" "us-gov-west-1"},
    :sslCommonName "us-gov-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "sqs", "region" "us-west-2"},
    :sslCommonName "us-west-2.queue.amazonaws.com",
    :endpoint "https://sqs.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "sqs", "region" "us-east-1"},
    :sslCommonName "queue.amazonaws.com",
    :endpoint "https://sqs.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "sqs", "region" "us-west-1"},
    :sslCommonName "us-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "sqs", "region" "ap-south-1"},
    :sslCommonName "ap-south-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
