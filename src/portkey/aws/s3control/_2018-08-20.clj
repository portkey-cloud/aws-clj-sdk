(ns portkey.aws.s3control.-2018-08-20 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "s3-control", :region "us-west-1"},
    :ssl-common-name "s3-control-fips.us-west-1.amazonaws.com",
    :endpoint "https://s3-control-fips.us-west-1.amazonaws.com",
    :signature-version :s3v4},
   "us-gov-east-1"
   {:credential-scope {:service "s3-control", :region "us-gov-east-1"},
    :ssl-common-name "s3-control.us-gov-east-1.amazonaws.com",
    :endpoint "https://s3-control.us-gov-east-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "s3-control", :region "ap-northeast-1"},
    :ssl-common-name "s3-control.ap-northeast-1.amazonaws.com",
    :endpoint "https://s3-control.ap-northeast-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-1"
   {:credential-scope {:service "s3-control", :region "eu-west-1"},
    :ssl-common-name "s3-control.eu-west-1.amazonaws.com",
    :endpoint "https://s3-control.eu-west-1.amazonaws.com",
    :signature-version :s3v4},
   "us-east-2"
   {:credential-scope {:service "s3-control", :region "us-east-2"},
    :ssl-common-name "s3-control.us-east-2.amazonaws.com",
    :endpoint "https://s3-control.us-east-2.amazonaws.com",
    :signature-version :s3v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "s3-control", :region "ap-southeast-2"},
    :ssl-common-name "s3-control.ap-southeast-2.amazonaws.com",
    :endpoint "https://s3-control.ap-southeast-2.amazonaws.com",
    :signature-version :s3v4},
   "cn-north-1"
   {:credential-scope {:service "s3-control", :region "cn-north-1"},
    :ssl-common-name "s3-control.cn-north-1.amazonaws.com.cn",
    :endpoint "https://s3-control.cn-north-1.amazonaws.com.cn",
    :signature-version :s3v4},
   "sa-east-1"
   {:credential-scope {:service "s3-control", :region "sa-east-1"},
    :ssl-common-name "s3-control.sa-east-1.amazonaws.com",
    :endpoint "https://s3-control.sa-east-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "s3-control", :region "ap-southeast-1"},
    :ssl-common-name "s3-control.ap-southeast-1.amazonaws.com",
    :endpoint "https://s3-control.ap-southeast-1.amazonaws.com",
    :signature-version :s3v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "s3-control", :region "cn-northwest-1"},
    :ssl-common-name "s3-control.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://s3-control.cn-northwest-1.amazonaws.com.cn",
    :signature-version :s3v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "s3-control", :region "ap-northeast-2"},
    :ssl-common-name "s3-control.ap-northeast-2.amazonaws.com",
    :endpoint "https://s3-control.ap-northeast-2.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-3"
   {:credential-scope {:service "s3-control", :region "eu-west-3"},
    :ssl-common-name "s3-control.eu-west-3.amazonaws.com",
    :endpoint "https://s3-control.eu-west-3.amazonaws.com",
    :signature-version :s3v4},
   "us-gov-west-1-fips"
   {:credential-scope {:service "s3-control", :region "us-gov-west-1"},
    :ssl-common-name "s3-control-fips.us-gov-west-1.amazonaws.com",
    :endpoint "https://s3-control-fips.us-gov-west-1.amazonaws.com",
    :signature-version :s3v4},
   "us-east-2-fips"
   {:credential-scope {:service "s3-control", :region "us-east-2"},
    :ssl-common-name "s3-control-fips.us-east-2.amazonaws.com",
    :endpoint "https://s3-control-fips.us-east-2.amazonaws.com",
    :signature-version :s3v4},
   "ca-central-1"
   {:credential-scope {:service "s3-control", :region "ca-central-1"},
    :ssl-common-name "s3-control.ca-central-1.amazonaws.com",
    :endpoint "https://s3-control.ca-central-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-central-1"
   {:credential-scope {:service "s3-control", :region "eu-central-1"},
    :ssl-common-name "s3-control.eu-central-1.amazonaws.com",
    :endpoint "https://s3-control.eu-central-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-2"
   {:credential-scope {:service "s3-control", :region "eu-west-2"},
    :ssl-common-name "s3-control.eu-west-2.amazonaws.com",
    :endpoint "https://s3-control.eu-west-2.amazonaws.com",
    :signature-version :s3v4},
   "us-gov-west-1"
   {:credential-scope {:service "s3-control", :region "us-gov-west-1"},
    :ssl-common-name "s3-control.us-gov-west-1.amazonaws.com",
    :endpoint "https://s3-control.us-gov-west-1.amazonaws.com",
    :signature-version :s3v4},
   "us-east-1-fips"
   {:credential-scope {:service "s3-control", :region "us-east-1"},
    :ssl-common-name "s3-control-fips.us-east-1.amazonaws.com",
    :endpoint "https://s3-control-fips.us-east-1.amazonaws.com",
    :signature-version :s3v4},
   "us-west-2"
   {:credential-scope {:service "s3-control", :region "us-west-2"},
    :ssl-common-name "s3-control.us-west-2.amazonaws.com",
    :endpoint "https://s3-control.us-west-2.amazonaws.com",
    :signature-version :s3v4},
   "us-gov-east-1-fips"
   {:credential-scope {:service "s3-control", :region "us-gov-east-1"},
    :ssl-common-name "s3-control-fips.us-gov-east-1.amazonaws.com",
    :endpoint "https://s3-control-fips.us-gov-east-1.amazonaws.com",
    :signature-version :s3v4},
   "us-west-2-fips"
   {:credential-scope {:service "s3-control", :region "us-west-2"},
    :ssl-common-name "s3-control-fips.us-west-2.amazonaws.com",
    :endpoint "https://s3-control-fips.us-west-2.amazonaws.com",
    :signature-version :s3v4},
   "us-east-1"
   {:credential-scope {:service "s3-control", :region "us-east-1"},
    :ssl-common-name "s3-control.us-east-1.amazonaws.com",
    :endpoint "https://s3-control.us-east-1.amazonaws.com",
    :signature-version :s3v4},
   "us-west-1"
   {:credential-scope {:service "s3-control", :region "us-west-1"},
    :ssl-common-name "s3-control.us-west-1.amazonaws.com",
    :endpoint "https://s3-control.us-west-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-south-1"
   {:credential-scope {:service "s3-control", :region "ap-south-1"},
    :ssl-common-name "s3-control.ap-south-1.amazonaws.com",
    :endpoint "https://s3-control.ap-south-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-north-1"
   {:credential-scope {:service "s3-control", :region "eu-north-1"},
    :ssl-common-name "s3-control.eu-north-1.amazonaws.com",
    :endpoint "https://s3-control.eu-north-1.amazonaws.com",
    :signature-version :s3v4}})

(clojure.core/declare ser-setting)

(clojure.core/declare ser-public-access-block-configuration)

(clojure.core/declare ser-account-id)

(clojure.core/defn- ser-setting [input] #:http.request.field{:value input, :shape "Setting"})

(clojure.core/defn- ser-public-access-block-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PublicAccessBlockConfiguration", :type "structure"} (clojure.core/contains? input :block-public-acls) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :block-public-acls)) #:http.request.field{:name "BlockPublicAcls", :shape "Setting", :location-name "BlockPublicAcls"})) (clojure.core/contains? input :ignore-public-acls) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :ignore-public-acls)) #:http.request.field{:name "IgnorePublicAcls", :shape "Setting", :location-name "IgnorePublicAcls"})) (clojure.core/contains? input :block-public-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :block-public-policy)) #:http.request.field{:name "BlockPublicPolicy", :shape "Setting", :location-name "BlockPublicPolicy"})) (clojure.core/contains? input :restrict-public-buckets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :restrict-public-buckets)) #:http.request.field{:name "RestrictPublicBuckets", :shape "Setting", :location-name "RestrictPublicBuckets"}))))

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- req-delete-public-access-block-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId", :location "header", :location-name "x-amz-account-id"})]}))

(clojure.core/defn- req-get-public-access-block-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId", :location "header", :location-name "x-amz-account-id"})]}))

(clojure.core/defn- req-put-public-access-block-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-access-block-configuration (input :public-access-block-configuration)) #:http.request.field{:name "PublicAccessBlockConfiguration", :shape "PublicAccessBlockConfiguration", :location-name "PublicAccessBlockConfiguration", :xml-namespace {"uri" "http://awss3control.amazonaws.com/doc/2018-08-20/"}})], :header [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId", :location "header", :location-name "x-amz-account-id"})]}))

(clojure.core/declare deser-setting)

(clojure.core/declare deser-public-access-block-configuration)

(clojure.core/declare deser-no-such-public-access-block-configuration-message)

(clojure.core/defn- deser-setting [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-public-access-block-configuration [input] (clojure.core/let [letvar1641981 {"BlockPublicAcls" (portkey.aws/search-for-tag input "BlockPublicAcls" :flattened? nil :xmlAttribute? nil), "IgnorePublicAcls" (portkey.aws/search-for-tag input "IgnorePublicAcls" :flattened? nil :xmlAttribute? nil), "BlockPublicPolicy" (portkey.aws/search-for-tag input "BlockPublicPolicy" :flattened? nil :xmlAttribute? nil), "RestrictPublicBuckets" (portkey.aws/search-for-tag input "RestrictPublicBuckets" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1641981 "BlockPublicAcls") (clojure.core/assoc :block-public-acls (deser-setting (clojure.core/get-in letvar1641981 ["BlockPublicAcls" :content]))) (letvar1641981 "IgnorePublicAcls") (clojure.core/assoc :ignore-public-acls (deser-setting (clojure.core/get-in letvar1641981 ["IgnorePublicAcls" :content]))) (letvar1641981 "BlockPublicPolicy") (clojure.core/assoc :block-public-policy (deser-setting (clojure.core/get-in letvar1641981 ["BlockPublicPolicy" :content]))) (letvar1641981 "RestrictPublicBuckets") (clojure.core/assoc :restrict-public-buckets (deser-setting (clojure.core/get-in letvar1641981 ["RestrictPublicBuckets" :content]))))))

(clojure.core/defn- deser-no-such-public-access-block-configuration-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-no-such-public-access-block-configuration ([input] (response-no-such-public-access-block-configuration nil input)) ([resultWrapper1641988 input] (clojure.core/let [rawinput1641987 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1641989 {"Message" (portkey.aws/search-for-tag rawinput1641987 "Message" :flattened? nil :result-wrapper resultWrapper1641988)}] (clojure.core/cond-> {} (letvar1641989 "Message") (clojure.core/assoc :message (deser-no-such-public-access-block-configuration-message (clojure.core/get-in letvar1641989 ["Message" :content])))))))

(clojure.core/defn- response-get-public-access-block-output ([input] (response-get-public-access-block-output nil input)) ([resultWrapper1641991 input] (clojure.core/let [rawinput1641990 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1641992 {"PublicAccessBlockConfiguration" (portkey.aws/search-for-tag rawinput1641990 "PublicAccessBlockConfiguration" :flattened? nil :result-wrapper resultWrapper1641991)}] (clojure.core/cond-> {} (letvar1641992 "PublicAccessBlockConfiguration") (clojure.core/assoc :public-access-block-configuration (deser-public-access-block-configuration (clojure.core/get-in letvar1641992 ["PublicAccessBlockConfiguration" :content])))))))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/setting clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20.no-such-public-access-block-configuration/message (clojure.spec.alpha/and :portkey.aws.s3control.-2018-08-20/no-such-public-access-block-configuration-message))
(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/no-such-public-access-block-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3control.-2018-08-20.no-such-public-access-block-configuration/message]))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20.public-access-block-configuration/block-public-acls (clojure.spec.alpha/and :portkey.aws.s3control.-2018-08-20/setting))
(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20.public-access-block-configuration/ignore-public-acls (clojure.spec.alpha/and :portkey.aws.s3control.-2018-08-20/setting))
(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20.public-access-block-configuration/block-public-policy (clojure.spec.alpha/and :portkey.aws.s3control.-2018-08-20/setting))
(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20.public-access-block-configuration/restrict-public-buckets (clojure.spec.alpha/and :portkey.aws.s3control.-2018-08-20/setting))
(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/public-access-block-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3control.-2018-08-20.public-access-block-configuration/block-public-acls :portkey.aws.s3control.-2018-08-20.public-access-block-configuration/ignore-public-acls :portkey.aws.s3control.-2018-08-20.public-access-block-configuration/block-public-policy :portkey.aws.s3control.-2018-08-20.public-access-block-configuration/restrict-public-buckets]))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/delete-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3control.-2018-08-20/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/get-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3control.-2018-08-20/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/put-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3control.-2018-08-20/public-access-block-configuration :portkey.aws.s3control.-2018-08-20/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/no-such-public-access-block-configuration-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3control.-2018-08-20/get-public-access-block-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3control.-2018-08-20/public-access-block-configuration]))

(clojure.core/defn delete-public-access-block "Removes the Public Access Block configuration for an Amazon Web Services\naccount." ([delete-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-public-access-block-request delete-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3control.-2018-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/v20180820/configuration/publicAccessBlock", :http.request.configuration/version "2018-08-20", :http.request.configuration/service-id "S3 Control", :http.request.spec/input-spec :portkey.aws.s3control.-2018-08-20/delete-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePublicAccessBlock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3control.-2018-08-20/delete-public-access-block-request) :ret clojure.core/true?)

(clojure.core/defn get-public-access-block "Retrieves the Public Access Block configuration for an Amazon Web Services\naccount." ([get-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-public-access-block-request get-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3control.-2018-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3control.-2018-08-20/get-public-access-block-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/v20180820/configuration/publicAccessBlock", :http.request.configuration/version "2018-08-20", :http.request.configuration/service-id "S3 Control", :http.request.spec/input-spec :portkey.aws.s3control.-2018-08-20/get-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicAccessBlock", :http.request.configuration/output-deser-fn response-get-public-access-block-output, :http.request.spec/error-spec {"NoSuchPublicAccessBlockConfiguration" :portkey.aws.s3control.-2018-08-20/no-such-public-access-block-configuration}})))))
(clojure.spec.alpha/fdef get-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3control.-2018-08-20/get-public-access-block-request) :ret (clojure.spec.alpha/and :portkey.aws.s3control.-2018-08-20/get-public-access-block-output))

(clojure.core/defn put-public-access-block "Creates or modifies the Public Access Block configuration for an Amazon Web\nServices account." ([put-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-public-access-block-request put-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3control.-2018-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/v20180820/configuration/publicAccessBlock", :http.request.configuration/version "2018-08-20", :http.request.configuration/service-id "S3 Control", :http.request.spec/input-spec :portkey.aws.s3control.-2018-08-20/put-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPublicAccessBlock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3control.-2018-08-20/put-public-access-block-request) :ret clojure.core/true?)
