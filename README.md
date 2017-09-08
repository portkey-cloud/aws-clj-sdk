# portkey-aws-clj-sdk

A Clojure library for AWS.

It's not a wrapper around `aws-java-sdk`, it's a pure Clojure, spec-based implementation generated from machine-readable API specifications provided by Amazon.

## Status

`aws-clj-sdk` can now be used for the following services (rest-json protocol)
“AWS Batch” “AWS Greengrass” “AWS IoT” “AWS IoT Data Plane”
“AWS Lambda” “AWS X-Ray” “Amazon API Gateway”
“Amazon CloudDirectory” “Amazon CloudSearch Domain”
“Amazon Cognito Sync” “Amazon Elastic File System”
“Amazon Elastic Transcoder” “Amazon Elasticsearch Service”
“Amazon Glacier” “Amazon Lex Model Building Service”
“Amazon Lex Runtime Service” “Amazon Pinpoint” “Amazon Polly”
“Amazon WorkDocs

## Usage

```clj
=> (require '[portkey.aws :as lambda])
=> (lambda/list-functions {})
{:functions [{:role "arn:aws:iam::238568392557:role/portkey", :description "", :code-size 5826344, :function-arn "arn:aws:lambda:eu-central-1:238568392557:function:user_Iflatter", :dead-letter-config {}, :master-arn nil, :last-modified "2017-07-13T10:08:40.196+0000", :code-sha256 "Nx3nojHfJakr8w5EVS6ZhbGq+vQ6uq0z0BRGBPpcFPg=", :runtime :java8, :memory-size 1536, :vpc-config {}, :environment {}, :tracing-config {:mode :pass-through}, :timeout 30, :version "$LATEST", :kmskey-arn nil, :handler "portkey.LambdaStub", :function-name "user_Iflatter"}], :next-marker nil}
```

All AWS operations are mapped to functions (the name case is changed to `kebab-case`).

`doc` doesn’t return a docstring at the moment but at least displays specs:
```=> (doc lambda/list-functions)
-------------------------
portkey.aws.lambda/list-functions
([input__8278__auto__])
Spec
  args: (tuple :portkey.aws.lambda/list-functions-request)
  ret: (and :portkey.aws.lambda/list-functions-response)```

## License

Copyright © 2017 Christophe Grand

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
