(ns portkey.aws.importexport.-2010-06-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "query")
