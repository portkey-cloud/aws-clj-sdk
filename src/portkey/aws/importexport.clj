(ns portkey.aws.importexport (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "sa-east-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "us-west-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"},
   "aws-global"
   {:credentialScope
    {"service" "IngestionService", "region" "us-east-1"},
    :sslCommonName "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com"}})

(comment TODO support "query")
