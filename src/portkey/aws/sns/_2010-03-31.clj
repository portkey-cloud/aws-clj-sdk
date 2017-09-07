(ns portkey.aws.sns.-2010-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "sns", "region" "ap-northeast-1"},
    :sslCommonName "sns.ap-northeast-1.amazonaws.com",
    :endpoint "https://sns.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "sns", "region" "eu-west-1"},
    :sslCommonName "sns.eu-west-1.amazonaws.com",
    :endpoint "https://sns.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "sns", "region" "us-east-2"},
    :sslCommonName "sns.us-east-2.amazonaws.com",
    :endpoint "https://sns.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "sns", "region" "ap-southeast-2"},
    :sslCommonName "sns.ap-southeast-2.amazonaws.com",
    :endpoint "https://sns.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope {"service" "sns", "region" "cn-north-1"},
    :sslCommonName "sns.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sns.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credentialScope {"service" "sns", "region" "sa-east-1"},
    :sslCommonName "sns.sa-east-1.amazonaws.com",
    :endpoint "https://sns.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "sns", "region" "ap-southeast-1"},
    :sslCommonName "sns.ap-southeast-1.amazonaws.com",
    :endpoint "https://sns.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "sns", "region" "ap-northeast-2"},
    :sslCommonName "sns.ap-northeast-2.amazonaws.com",
    :endpoint "https://sns.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "sns", "region" "ca-central-1"},
    :sslCommonName "sns.ca-central-1.amazonaws.com",
    :endpoint "https://sns.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "sns", "region" "eu-central-1"},
    :sslCommonName "sns.eu-central-1.amazonaws.com",
    :endpoint "https://sns.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "sns", "region" "eu-west-2"},
    :sslCommonName "sns.eu-west-2.amazonaws.com",
    :endpoint "https://sns.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "sns", "region" "us-gov-west-1"},
    :sslCommonName "sns.us-gov-west-1.amazonaws.com",
    :endpoint "https://sns.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "sns", "region" "us-west-2"},
    :sslCommonName "sns.us-west-2.amazonaws.com",
    :endpoint "https://sns.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "sns", "region" "us-east-1"},
    :sslCommonName "sns.us-east-1.amazonaws.com",
    :endpoint "https://sns.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "sns", "region" "us-west-1"},
    :sslCommonName "sns.us-west-1.amazonaws.com",
    :endpoint "https://sns.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "sns", "region" "ap-south-1"},
    :sslCommonName "sns.ap-south-1.amazonaws.com",
    :endpoint "https://sns.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
