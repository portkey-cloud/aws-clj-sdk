(ns portkey.aws.devicefarm.-2015-06-23 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "devicefarm", :region "us-west-2"},
    :ssl-common-name "devicefarm.us-west-2.amazonaws.com",
    :endpoint "https://devicefarm.us-west-2.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-artifact-category)

(clojure.core/declare ser-vpce-configuration-description)

(clojure.core/declare ser-double)

(clojure.core/declare ser-vpce-configuration-name)

(clojure.core/declare ser-skip-app-resign)

(clojure.core/declare ser-android-paths)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-vpce-service-name)

(clojure.core/declare ser-device-host-paths)

(clojure.core/declare ser-percent-integer)

(clojure.core/declare ser-ssh-public-key)

(clojure.core/declare ser-customer-artifact-paths)

(clojure.core/declare ser-amazon-resource-name)

(clojure.core/declare ser-rule-operator)

(clojure.core/declare ser-offering-promotion-identifier)

(clojure.core/declare ser-test-type)

(clojure.core/declare ser-radios)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-billing-method)

(clojure.core/declare ser-location)

(clojure.core/declare ser-amazon-resource-names)

(clojure.core/declare ser-upload-type)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-execution-configuration)

(clojure.core/declare ser-accounts-cleanup)

(clojure.core/declare ser-interaction-mode)

(clojure.core/declare ser-device-pool-type)

(clojure.core/declare ser-offering-identifier)

(clojure.core/declare ser-video-capture)

(clojure.core/declare ser-message)

(clojure.core/declare ser-test-parameters)

(clojure.core/declare ser-job-timeout-minutes)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-service-dns-name)

(clojure.core/declare ser-network-profile-type)

(clojure.core/declare ser-schedule-run-test)

(clojure.core/declare ser-rule)

(clojure.core/declare ser-instance-labels)

(clojure.core/declare ser-client-id)

(clojure.core/declare ser-long)

(clojure.core/declare ser-schedule-run-configuration)

(clojure.core/declare ser-device-attribute)

(clojure.core/declare ser-package-ids)

(clojure.core/declare ser-app-packages-cleanup)

(clojure.core/declare ser-name)

(clojure.core/declare ser-rules)

(clojure.core/declare ser-ios-paths)

(clojure.core/declare ser-create-remote-access-session-configuration)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-artifact-category [input] #:http.request.field{:value (clojure.core/get {"SCREENSHOT" "SCREENSHOT", :screenshot "SCREENSHOT", "FILE" "FILE", :file "FILE", "LOG" "LOG", :log "LOG"} input), :shape "ArtifactCategory"})

(clojure.core/defn- ser-vpce-configuration-description [input] #:http.request.field{:value input, :shape "VPCEConfigurationDescription"})

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-vpce-configuration-name [input] #:http.request.field{:value input, :shape "VPCEConfigurationName"})

(clojure.core/defn- ser-skip-app-resign [input] #:http.request.field{:value input, :shape "SkipAppResign"})

(clojure.core/defn- ser-android-paths [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "AndroidPaths", :type "list"})

(clojure.core/defn- ser-filter [input] #:http.request.field{:value input, :shape "Filter"})

(clojure.core/defn- ser-vpce-service-name [input] #:http.request.field{:value input, :shape "VPCEServiceName"})

(clojure.core/defn- ser-device-host-paths [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "DeviceHostPaths", :type "list"})

(clojure.core/defn- ser-percent-integer [input] #:http.request.field{:value input, :shape "PercentInteger"})

(clojure.core/defn- ser-ssh-public-key [input] #:http.request.field{:value input, :shape "SshPublicKey"})

(clojure.core/defn- ser-customer-artifact-paths [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CustomerArtifactPaths", :type "structure"} (clojure.core/contains? input :ios-paths) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ios-paths (input :ios-paths)) #:http.request.field{:name "iosPaths", :shape "IosPaths"})) (clojure.core/contains? input :android-paths) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-android-paths (input :android-paths)) #:http.request.field{:name "androidPaths", :shape "AndroidPaths"})) (clojure.core/contains? input :device-host-paths) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-host-paths (input :device-host-paths)) #:http.request.field{:name "deviceHostPaths", :shape "DeviceHostPaths"}))))

(clojure.core/defn- ser-amazon-resource-name [input] #:http.request.field{:value input, :shape "AmazonResourceName"})

(clojure.core/defn- ser-rule-operator [input] #:http.request.field{:value (clojure.core/get {"NOT_IN" "NOT_IN", "GREATER_THAN" "GREATER_THAN", :less-than "LESS_THAN", :contains "CONTAINS", "CONTAINS" "CONTAINS", :greater-than "GREATER_THAN", "LESS_THAN" "LESS_THAN", :equals "EQUALS", :not-in "NOT_IN", "EQUALS" "EQUALS", "IN" "IN", :in "IN"} input), :shape "RuleOperator"})

(clojure.core/defn- ser-offering-promotion-identifier [input] #:http.request.field{:value input, :shape "OfferingPromotionIdentifier"})

(clojure.core/defn- ser-test-type [input] #:http.request.field{:value (clojure.core/get {:xctest-ui "XCTEST_UI", "XCTEST" "XCTEST", :appium-java-junit "APPIUM_JAVA_JUNIT", "APPIUM_WEB_JAVA_TESTNG" "APPIUM_WEB_JAVA_TESTNG", "BUILTIN_EXPLORER" "BUILTIN_EXPLORER", "APPIUM_WEB_PYTHON" "APPIUM_WEB_PYTHON", :uiautomator "UIAUTOMATOR", "UIAUTOMATOR" "UIAUTOMATOR", "UIAUTOMATION" "UIAUTOMATION", "CALABASH" "CALABASH", :appium-web-python "APPIUM_WEB_PYTHON", "APPIUM_JAVA_JUNIT" "APPIUM_JAVA_JUNIT", :appium-web-java-junit "APPIUM_WEB_JAVA_JUNIT", "BUILTIN_FUZZ" "BUILTIN_FUZZ", :uiautomation "UIAUTOMATION", "WEB_PERFORMANCE_PROFILE" "WEB_PERFORMANCE_PROFILE", :appium-web-java-testng "APPIUM_WEB_JAVA_TESTNG", :xctest "XCTEST", :remote-access-record "REMOTE_ACCESS_RECORD", "APPIUM_PYTHON" "APPIUM_PYTHON", :appium-python "APPIUM_PYTHON", :remote-access-replay "REMOTE_ACCESS_REPLAY", "REMOTE_ACCESS_REPLAY" "REMOTE_ACCESS_REPLAY", :builtin-explorer "BUILTIN_EXPLORER", :calabash "CALABASH", "APPIUM_JAVA_TESTNG" "APPIUM_JAVA_TESTNG", "APPIUM_WEB_JAVA_JUNIT" "APPIUM_WEB_JAVA_JUNIT", :web-performance-profile "WEB_PERFORMANCE_PROFILE", :instrumentation "INSTRUMENTATION", "INSTRUMENTATION" "INSTRUMENTATION", :builtin-fuzz "BUILTIN_FUZZ", :appium-java-testng "APPIUM_JAVA_TESTNG", "XCTEST_UI" "XCTEST_UI", "REMOTE_ACCESS_RECORD" "REMOTE_ACCESS_RECORD"} input), :shape "TestType"})

(clojure.core/defn- ser-radios [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Radios", :type "structure"} (clojure.core/contains? input :wifi) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :wifi)) #:http.request.field{:name "wifi", :shape "Boolean"})) (clojure.core/contains? input :bluetooth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :bluetooth)) #:http.request.field{:name "bluetooth", :shape "Boolean"})) (clojure.core/contains? input :nfc) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :nfc)) #:http.request.field{:name "nfc", :shape "Boolean"})) (clojure.core/contains? input :gps) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :gps)) #:http.request.field{:name "gps", :shape "Boolean"}))))

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-billing-method [input] #:http.request.field{:value (clojure.core/get {"METERED" "METERED", :metered "METERED", "UNMETERED" "UNMETERED", :unmetered "UNMETERED"} input), :shape "BillingMethod"})

(clojure.core/defn- ser-location [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-double (:latitude input)) #:http.request.field{:name "latitude", :shape "Double"}) (clojure.core/into (ser-double (:longitude input)) #:http.request.field{:name "longitude", :shape "Double"})], :shape "Location", :type "structure"}))

(clojure.core/defn- ser-amazon-resource-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-amazon-resource-name coll) #:http.request.field{:shape "AmazonResourceName"}))) input), :shape "AmazonResourceNames", :type "list"})

(clojure.core/defn- ser-upload-type [input] #:http.request.field{:value (clojure.core/get {"UIAUTOMATOR_TEST_PACKAGE" "UIAUTOMATOR_TEST_PACKAGE", :appium-web-java-junit-test-spec "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC", :appium-web-java-testng-test-spec "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC", "XCTEST_UI_TEST_SPEC" "XCTEST_UI_TEST_SPEC", :appium-java-junit-test-spec "APPIUM_JAVA_JUNIT_TEST_SPEC", "EXTERNAL_DATA" "EXTERNAL_DATA", "APPIUM_JAVA_TESTNG_TEST_SPEC" "APPIUM_JAVA_TESTNG_TEST_SPEC", "XCTEST_TEST_PACKAGE" "XCTEST_TEST_PACKAGE", :appium-python-test-spec "APPIUM_PYTHON_TEST_SPEC", "APPIUM_JAVA_TESTNG_TEST_PACKAGE" "APPIUM_JAVA_TESTNG_TEST_PACKAGE", "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC" "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC", :instrumentation-test-package "INSTRUMENTATION_TEST_PACKAGE", "APPIUM_PYTHON_TEST_PACKAGE" "APPIUM_PYTHON_TEST_PACKAGE", :xctest-ui-test-spec "XCTEST_UI_TEST_SPEC", :xctest-ui-test-package "XCTEST_UI_TEST_PACKAGE", "WEB_APP" "WEB_APP", :web-app "WEB_APP", "ANDROID_APP" "ANDROID_APP", "INSTRUMENTATION_TEST_PACKAGE" "INSTRUMENTATION_TEST_PACKAGE", "IOS_APP" "IOS_APP", "APPIUM_JAVA_JUNIT_TEST_SPEC" "APPIUM_JAVA_JUNIT_TEST_SPEC", :appium-web-java-testng-test-package "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE", :calabash-test-package "CALABASH_TEST_PACKAGE", :xctest-test-package "XCTEST_TEST_PACKAGE", :external-data "EXTERNAL_DATA", "INSTRUMENTATION_TEST_SPEC" "INSTRUMENTATION_TEST_SPEC", "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE" "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE", :appium-python-test-package "APPIUM_PYTHON_TEST_PACKAGE", "APPIUM_WEB_PYTHON_TEST_PACKAGE" "APPIUM_WEB_PYTHON_TEST_PACKAGE", :uiautomation-test-package "UIAUTOMATION_TEST_PACKAGE", "APPIUM_PYTHON_TEST_SPEC" "APPIUM_PYTHON_TEST_SPEC", "UIAUTOMATION_TEST_PACKAGE" "UIAUTOMATION_TEST_PACKAGE", "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC" "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC", :appium-web-python-test-spec "APPIUM_WEB_PYTHON_TEST_SPEC", :android-app "ANDROID_APP", "APPIUM_JAVA_JUNIT_TEST_PACKAGE" "APPIUM_JAVA_JUNIT_TEST_PACKAGE", :appium-java-junit-test-package "APPIUM_JAVA_JUNIT_TEST_PACKAGE", "XCTEST_UI_TEST_PACKAGE" "XCTEST_UI_TEST_PACKAGE", :appium-web-python-test-package "APPIUM_WEB_PYTHON_TEST_PACKAGE", :instrumentation-test-spec "INSTRUMENTATION_TEST_SPEC", :appium-web-java-junit-test-package "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE", "APPIUM_WEB_PYTHON_TEST_SPEC" "APPIUM_WEB_PYTHON_TEST_SPEC", :appium-java-testng-test-package "APPIUM_JAVA_TESTNG_TEST_PACKAGE", "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE" "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE", :ios-app "IOS_APP", :uiautomator-test-package "UIAUTOMATOR_TEST_PACKAGE", :appium-java-testng-test-spec "APPIUM_JAVA_TESTNG_TEST_SPEC", "CALABASH_TEST_PACKAGE" "CALABASH_TEST_PACKAGE"} input), :shape "UploadType"})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value input, :shape "ContentType"})

(clojure.core/defn- ser-execution-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ExecutionConfiguration", :type "structure"} (clojure.core/contains? input :job-timeout-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-timeout-minutes (input :job-timeout-minutes)) #:http.request.field{:name "jobTimeoutMinutes", :shape "JobTimeoutMinutes"})) (clojure.core/contains? input :accounts-cleanup) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accounts-cleanup (input :accounts-cleanup)) #:http.request.field{:name "accountsCleanup", :shape "AccountsCleanup"})) (clojure.core/contains? input :app-packages-cleanup) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-packages-cleanup (input :app-packages-cleanup)) #:http.request.field{:name "appPackagesCleanup", :shape "AppPackagesCleanup"})) (clojure.core/contains? input :video-capture) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-capture (input :video-capture)) #:http.request.field{:name "videoCapture", :shape "VideoCapture"})) (clojure.core/contains? input :skip-app-resign) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skip-app-resign (input :skip-app-resign)) #:http.request.field{:name "skipAppResign", :shape "SkipAppResign"}))))

(clojure.core/defn- ser-accounts-cleanup [input] #:http.request.field{:value input, :shape "AccountsCleanup"})

(clojure.core/defn- ser-interaction-mode [input] #:http.request.field{:value (clojure.core/get {"INTERACTIVE" "INTERACTIVE", :interactive "INTERACTIVE", "NO_VIDEO" "NO_VIDEO", :no-video "NO_VIDEO", "VIDEO_ONLY" "VIDEO_ONLY", :video-only "VIDEO_ONLY"} input), :shape "InteractionMode"})

(clojure.core/defn- ser-device-pool-type [input] #:http.request.field{:value (clojure.core/get {"CURATED" "CURATED", :curated "CURATED", "PRIVATE" "PRIVATE", :private "PRIVATE"} input), :shape "DevicePoolType"})

(clojure.core/defn- ser-offering-identifier [input] #:http.request.field{:value input, :shape "OfferingIdentifier"})

(clojure.core/defn- ser-video-capture [input] #:http.request.field{:value input, :shape "VideoCapture"})

(clojure.core/defn- ser-message [input] #:http.request.field{:value input, :shape "Message"})

(clojure.core/defn- ser-test-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "TestParameters", :type "map"})

(clojure.core/defn- ser-job-timeout-minutes [input] #:http.request.field{:value input, :shape "JobTimeoutMinutes"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-service-dns-name [input] #:http.request.field{:value input, :shape "ServiceDnsName"})

(clojure.core/defn- ser-network-profile-type [input] #:http.request.field{:value (clojure.core/get {"CURATED" "CURATED", :curated "CURATED", "PRIVATE" "PRIVATE", :private "PRIVATE"} input), :shape "NetworkProfileType"})

(clojure.core/defn- ser-schedule-run-test [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-test-type (:type input)) #:http.request.field{:name "type", :shape "TestType"})], :shape "ScheduleRunTest", :type "structure"} (clojure.core/contains? input :test-package-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :test-package-arn)) #:http.request.field{:name "testPackageArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :test-spec-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :test-spec-arn)) #:http.request.field{:name "testSpecArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter (input :filter)) #:http.request.field{:name "filter", :shape "Filter"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-test-parameters (input :parameters)) #:http.request.field{:name "parameters", :shape "TestParameters"}))))

(clojure.core/defn- ser-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Rule", :type "structure"} (clojure.core/contains? input :attribute) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-attribute (input :attribute)) #:http.request.field{:name "attribute", :shape "DeviceAttribute"})) (clojure.core/contains? input :operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-operator (input :operator)) #:http.request.field{:name "operator", :shape "RuleOperator"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"}))))

(clojure.core/defn- ser-instance-labels [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "InstanceLabels", :type "list"})

(clojure.core/defn- ser-client-id [input] #:http.request.field{:value input, :shape "ClientId"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-schedule-run-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ScheduleRunConfiguration", :type "structure"} (clojure.core/contains? input :customer-artifact-paths) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-artifact-paths (input :customer-artifact-paths)) #:http.request.field{:name "customerArtifactPaths", :shape "CustomerArtifactPaths"})) (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :locale)) #:http.request.field{:name "locale", :shape "String"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "location", :shape "Location"})) (clojure.core/contains? input :radios) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radios (input :radios)) #:http.request.field{:name "radios", :shape "Radios"})) (clojure.core/contains? input :auxiliary-apps) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-names (input :auxiliary-apps)) #:http.request.field{:name "auxiliaryApps", :shape "AmazonResourceNames"})) (clojure.core/contains? input :billing-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-billing-method (input :billing-method)) #:http.request.field{:name "billingMethod", :shape "BillingMethod"})) (clojure.core/contains? input :vpce-configuration-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-names (input :vpce-configuration-arns)) #:http.request.field{:name "vpceConfigurationArns", :shape "AmazonResourceNames"})) (clojure.core/contains? input :extra-data-package-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :extra-data-package-arn)) #:http.request.field{:name "extraDataPackageArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :network-profile-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :network-profile-arn)) #:http.request.field{:name "networkProfileArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- ser-device-attribute [input] #:http.request.field{:value (clojure.core/get {"FORM_FACTOR" "FORM_FACTOR", :remote-debug-enabled "REMOTE_DEBUG_ENABLED", "APPIUM_VERSION" "APPIUM_VERSION", "ARN" "ARN", "REMOTE_DEBUG_ENABLED" "REMOTE_DEBUG_ENABLED", "INSTANCE_LABELS" "INSTANCE_LABELS", "INSTANCE_ARN" "INSTANCE_ARN", :form-factor "FORM_FACTOR", :remote-access-enabled "REMOTE_ACCESS_ENABLED", :instance-labels "INSTANCE_LABELS", "PLATFORM" "PLATFORM", :instance-arn "INSTANCE_ARN", :manufacturer "MANUFACTURER", :appium-version "APPIUM_VERSION", "FLEET_TYPE" "FLEET_TYPE", "MANUFACTURER" "MANUFACTURER", "REMOTE_ACCESS_ENABLED" "REMOTE_ACCESS_ENABLED", :arn "ARN", :platform "PLATFORM", :fleet-type "FLEET_TYPE"} input), :shape "DeviceAttribute"})

(clojure.core/defn- ser-package-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "PackageIds", :type "list"})

(clojure.core/defn- ser-app-packages-cleanup [input] #:http.request.field{:value input, :shape "AppPackagesCleanup"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule coll) #:http.request.field{:shape "Rule"}))) input), :shape "Rules", :type "list"})

(clojure.core/defn- ser-ios-paths [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "IosPaths", :type "list"})

(clojure.core/defn- ser-create-remote-access-session-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CreateRemoteAccessSessionConfiguration", :type "structure"} (clojure.core/contains? input :billing-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-billing-method (input :billing-method)) #:http.request.field{:name "billingMethod", :shape "BillingMethod"})) (clojure.core/contains? input :vpce-configuration-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-names (input :vpce-configuration-arns)) #:http.request.field{:name "vpceConfigurationArns", :shape "AmazonResourceNames"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-device-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :description)) #:http.request.field{:name "description", :shape "Message"})) (clojure.core/contains? input :rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rules (input :rules)) #:http.request.field{:name "rules", :shape "Rules"}))))

(clojure.core/defn- req-get-device-pool-compatibility-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :device-pool-arn)) #:http.request.field{:name "devicePoolArn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :app-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :app-arn)) #:http.request.field{:name "appArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :test-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-test-type (input :test-type)) #:http.request.field{:name "testType", :shape "TestType"})) (clojure.core/contains? input :test) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-run-test (input :test)) #:http.request.field{:name "test", :shape "ScheduleRunTest"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-run-configuration (input :configuration)) #:http.request.field{:name "configuration", :shape "ScheduleRunConfiguration"}))))

(clojure.core/defn- req-list-projects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-get-vpce-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-get-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-tests-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-schedule-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :project-arn)) #:http.request.field{:name "projectArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-amazon-resource-name (input :device-pool-arn)) #:http.request.field{:name "devicePoolArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-schedule-run-test (input :test)) #:http.request.field{:name "test", :shape "ScheduleRunTest"})]} (clojure.core/contains? input :app-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :app-arn)) #:http.request.field{:name "appArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-run-configuration (input :configuration)) #:http.request.field{:name "configuration", :shape "ScheduleRunConfiguration"})) (clojure.core/contains? input :execution-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-configuration (input :execution-configuration)) #:http.request.field{:name "executionConfiguration", :shape "ExecutionConfiguration"}))))

(clojure.core/defn- req-list-artifacts-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"}) (clojure.core/into (ser-artifact-category (input :type)) #:http.request.field{:name "type", :shape "ArtifactCategory"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-get-offering-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-create-device-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :project-arn)) #:http.request.field{:name "projectArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-rules (input :rules)) #:http.request.field{:name "rules", :shape "Rules"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :description)) #:http.request.field{:name "description", :shape "Message"}))))

(clojure.core/defn- req-stop-remote-access-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-unique-problems-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-create-network-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :project-arn)) #:http.request.field{:name "projectArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})]} (clojure.core/contains? input :uplink-jitter-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :uplink-jitter-ms)) #:http.request.field{:name "uplinkJitterMs", :shape "Long"})) (clojure.core/contains? input :uplink-delay-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :uplink-delay-ms)) #:http.request.field{:name "uplinkDelayMs", :shape "Long"})) (clojure.core/contains? input :downlink-loss-percent) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent-integer (input :downlink-loss-percent)) #:http.request.field{:name "downlinkLossPercent", :shape "PercentInteger"})) (clojure.core/contains? input :downlink-bandwidth-bits) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :downlink-bandwidth-bits)) #:http.request.field{:name "downlinkBandwidthBits", :shape "Long"})) (clojure.core/contains? input :downlink-delay-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :downlink-delay-ms)) #:http.request.field{:name "downlinkDelayMs", :shape "Long"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-profile-type (input :type)) #:http.request.field{:name "type", :shape "NetworkProfileType"})) (clojure.core/contains? input :uplink-loss-percent) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent-integer (input :uplink-loss-percent)) #:http.request.field{:name "uplinkLossPercent", :shape "PercentInteger"})) (clojure.core/contains? input :uplink-bandwidth-bits) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :uplink-bandwidth-bits)) #:http.request.field{:name "uplinkBandwidthBits", :shape "Long"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :description)) #:http.request.field{:name "description", :shape "Message"})) (clojure.core/contains? input :downlink-jitter-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :downlink-jitter-ms)) #:http.request.field{:name "downlinkJitterMs", :shape "Long"}))))

(clojure.core/defn- req-get-device-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-update-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "contentType", :shape "ContentType"})) (clojure.core/contains? input :edit-content) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :edit-content)) #:http.request.field{:name "editContent", :shape "Boolean"}))))

(clojure.core/defn- req-install-to-remote-access-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :remote-access-session-arn)) #:http.request.field{:name "remoteAccessSessionArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-amazon-resource-name (input :app-arn)) #:http.request.field{:name "appArn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-delete-remote-access-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-get-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-stop-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-remote-access-sessions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-update-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :default-job-timeout-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-timeout-minutes (input :default-job-timeout-minutes)) #:http.request.field{:name "defaultJobTimeoutMinutes", :shape "JobTimeoutMinutes"}))))

(clojure.core/defn- req-delete-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-suites-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-get-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-create-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})]} (clojure.core/contains? input :default-job-timeout-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-timeout-minutes (input :default-job-timeout-minutes)) #:http.request.field{:name "defaultJobTimeoutMinutes", :shape "JobTimeoutMinutes"}))))

(clojure.core/defn- req-delete-device-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-get-suite-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-stop-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-get-remote-access-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-instance-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-list-offerings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-purchase-offering-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :offering-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-offering-identifier (input :offering-id)) #:http.request.field{:name "offeringId", :shape "OfferingIdentifier"})) (clojure.core/contains? input :quantity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :quantity)) #:http.request.field{:name "quantity", :shape "Integer"})) (clojure.core/contains? input :offering-promotion-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-offering-promotion-identifier (input :offering-promotion-id)) #:http.request.field{:name "offeringPromotionId", :shape "OfferingPromotionIdentifier"}))))

(clojure.core/defn- req-get-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-samples-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-delete-vpce-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-update-network-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :uplink-jitter-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :uplink-jitter-ms)) #:http.request.field{:name "uplinkJitterMs", :shape "Long"})) (clojure.core/contains? input :uplink-delay-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :uplink-delay-ms)) #:http.request.field{:name "uplinkDelayMs", :shape "Long"})) (clojure.core/contains? input :downlink-loss-percent) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent-integer (input :downlink-loss-percent)) #:http.request.field{:name "downlinkLossPercent", :shape "PercentInteger"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :downlink-bandwidth-bits) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :downlink-bandwidth-bits)) #:http.request.field{:name "downlinkBandwidthBits", :shape "Long"})) (clojure.core/contains? input :downlink-delay-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :downlink-delay-ms)) #:http.request.field{:name "downlinkDelayMs", :shape "Long"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-profile-type (input :type)) #:http.request.field{:name "type", :shape "NetworkProfileType"})) (clojure.core/contains? input :uplink-loss-percent) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent-integer (input :uplink-loss-percent)) #:http.request.field{:name "uplinkLossPercent", :shape "PercentInteger"})) (clojure.core/contains? input :uplink-bandwidth-bits) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :uplink-bandwidth-bits)) #:http.request.field{:name "uplinkBandwidthBits", :shape "Long"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :description)) #:http.request.field{:name "description", :shape "Message"})) (clojure.core/contains? input :downlink-jitter-ms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :downlink-jitter-ms)) #:http.request.field{:name "downlinkJitterMs", :shape "Long"}))))

(clojure.core/defn- req-create-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :project-arn)) #:http.request.field{:name "projectArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-upload-type (input :type)) #:http.request.field{:name "type", :shape "UploadType"})]} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "contentType", :shape "ContentType"}))))

(clojure.core/defn- req-list-vpce-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-create-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :description)) #:http.request.field{:name "description", :shape "Message"})) (clojure.core/contains? input :package-cleanup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :package-cleanup)) #:http.request.field{:name "packageCleanup", :shape "Boolean"})) (clojure.core/contains? input :exclude-app-packages-from-cleanup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-package-ids (input :exclude-app-packages-from-cleanup)) #:http.request.field{:name "excludeAppPackagesFromCleanup", :shape "PackageIds"})) (clojure.core/contains? input :reboot-after-use) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :reboot-after-use)) #:http.request.field{:name "rebootAfterUse", :shape "Boolean"}))))

(clojure.core/defn- req-list-device-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-delete-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-offering-promotions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-get-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-runs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-create-vpce-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-vpce-configuration-name (input :vpce-configuration-name)) #:http.request.field{:name "vpceConfigurationName", :shape "VPCEConfigurationName"}) (clojure.core/into (ser-vpce-service-name (input :vpce-service-name)) #:http.request.field{:name "vpceServiceName", :shape "VPCEServiceName"}) (clojure.core/into (ser-service-dns-name (input :service-dns-name)) #:http.request.field{:name "serviceDnsName", :shape "ServiceDnsName"})]} (clojure.core/contains? input :vpce-configuration-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpce-configuration-description (input :vpce-configuration-description)) #:http.request.field{:name "vpceConfigurationDescription", :shape "VPCEConfigurationDescription"}))))

(clojure.core/defn- req-list-devices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-update-device-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :profile-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :profile-arn)) #:http.request.field{:name "profileArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :labels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-labels (input :labels)) #:http.request.field{:name "labels", :shape "InstanceLabels"}))))

(clojure.core/defn- req-create-remote-access-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :project-arn)) #:http.request.field{:name "projectArn", :shape "AmazonResourceName"}) (clojure.core/into (ser-amazon-resource-name (input :device-arn)) #:http.request.field{:name "deviceArn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :skip-app-resign) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :skip-app-resign)) #:http.request.field{:name "skipAppResign", :shape "Boolean"})) (clojure.core/contains? input :remote-record-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :remote-record-enabled)) #:http.request.field{:name "remoteRecordEnabled", :shape "Boolean"})) (clojure.core/contains? input :remote-debug-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :remote-debug-enabled)) #:http.request.field{:name "remoteDebugEnabled", :shape "Boolean"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-remote-access-session-configuration (input :configuration)) #:http.request.field{:name "configuration", :shape "CreateRemoteAccessSessionConfiguration"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssh-public-key (input :ssh-public-key)) #:http.request.field{:name "sshPublicKey", :shape "SshPublicKey"})) (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-id (input :client-id)) #:http.request.field{:name "clientId", :shape "ClientId"})) (clojure.core/contains? input :remote-record-app-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :remote-record-app-arn)) #:http.request.field{:name "remoteRecordAppArn", :shape "AmazonResourceName"})) (clojure.core/contains? input :interaction-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-interaction-mode (input :interaction-mode)) #:http.request.field{:name "interactionMode", :shape "InteractionMode"})) (clojure.core/contains? input :instance-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-resource-name (input :instance-arn)) #:http.request.field{:name "instanceArn", :shape "AmazonResourceName"}))))

(clojure.core/defn- req-renew-offering-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :offering-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-offering-identifier (input :offering-id)) #:http.request.field{:name "offeringId", :shape "OfferingIdentifier"})) (clojure.core/contains? input :quantity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :quantity)) #:http.request.field{:name "quantity", :shape "Integer"}))))

(clojure.core/defn- req-update-vpce-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :vpce-configuration-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpce-configuration-name (input :vpce-configuration-name)) #:http.request.field{:name "vpceConfigurationName", :shape "VPCEConfigurationName"})) (clojure.core/contains? input :vpce-service-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpce-service-name (input :vpce-service-name)) #:http.request.field{:name "vpceServiceName", :shape "VPCEServiceName"})) (clojure.core/contains? input :service-dns-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-dns-name (input :service-dns-name)) #:http.request.field{:name "serviceDnsName", :shape "ServiceDnsName"})) (clojure.core/contains? input :vpce-configuration-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpce-configuration-description (input :vpce-configuration-description)) #:http.request.field{:name "vpceConfigurationDescription", :shape "VPCEConfigurationDescription"}))))

(clojure.core/defn- req-delete-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-get-device-pool-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-update-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :description)) #:http.request.field{:name "description", :shape "Message"})) (clojure.core/contains? input :package-cleanup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :package-cleanup)) #:http.request.field{:name "packageCleanup", :shape "Boolean"})) (clojure.core/contains? input :exclude-app-packages-from-cleanup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-package-ids (input :exclude-app-packages-from-cleanup)) #:http.request.field{:name "excludeAppPackagesFromCleanup", :shape "PackageIds"})) (clojure.core/contains? input :reboot-after-use) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :reboot-after-use)) #:http.request.field{:name "rebootAfterUse", :shape "Boolean"}))))

(clojure.core/defn- req-delete-network-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-device-pools-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-pool-type (input :type)) #:http.request.field{:name "type", :shape "DevicePoolType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-delete-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-get-account-settings-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-test-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-offering-transactions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-list-network-profiles-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-profile-type (input :type)) #:http.request.field{:name "type", :shape "NetworkProfileType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-get-network-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-get-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]}))

(clojure.core/defn- req-list-uploads-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :arn)) #:http.request.field{:name "arn", :shape "AmazonResourceName"})]} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-upload-type (input :type)) #:http.request.field{:name "type", :shape "UploadType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/declare deser-url)

(clojure.core/declare deser-offering-transaction-type)

(clojure.core/declare deser-vpce-configuration-description)

(clojure.core/declare deser-double)

(clojure.core/declare deser-vpce-configuration-name)

(clojure.core/declare deser-currency-code)

(clojure.core/declare deser-max-slot-map)

(clojure.core/declare deser-skip-app-resign)

(clojure.core/declare deser-android-paths)

(clojure.core/declare deser-device-instance)

(clojure.core/declare deser-run)

(clojure.core/declare deser-execution-result)

(clojure.core/declare deser-vpce-service-name)

(clojure.core/declare deser-offering-status-map)

(clojure.core/declare deser-execution-result-code)

(clojure.core/declare deser-uploads)

(clojure.core/declare deser-device-host-paths)

(clojure.core/declare deser-transaction-identifier)

(clojure.core/declare deser-offerings)

(clojure.core/declare deser-upload)

(clojure.core/declare deser-device-platform)

(clojure.core/declare deser-percent-integer)

(clojure.core/declare deser-instance-profile)

(clojure.core/declare deser-host-address)

(clojure.core/declare deser-test)

(clojure.core/declare deser-customer-artifact-paths)

(clojure.core/declare deser-amazon-resource-name)

(clojure.core/declare deser-rule-operator)

(clojure.core/declare deser-account-settings)

(clojure.core/declare deser-offering-promotion)

(clojure.core/declare deser-vpce-configurations)

(clojure.core/declare deser-remote-access-sessions)

(clojure.core/declare deser-offering-promotion-identifier)

(clojure.core/declare deser-test-type)

(clojure.core/declare deser-radios)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-billing-method)

(clojure.core/declare deser-location)

(clojure.core/declare deser-trial-minutes)

(clojure.core/declare deser-resolution)

(clojure.core/declare deser-network-profiles)

(clojure.core/declare deser-cpu)

(clojure.core/declare deser-offering-transactions)

(clojure.core/declare deser-offering)

(clojure.core/declare deser-device-instances)

(clojure.core/declare deser-artifacts)

(clojure.core/declare deser-artifact)

(clojure.core/declare deser-unique-problems)

(clojure.core/declare deser-upload-type)

(clojure.core/declare deser-suites)

(clojure.core/declare deser-recurring-charge)

(clojure.core/declare deser-unique-problem)

(clojure.core/declare deser-instance-profiles)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-device-pool-compatibility-result)

(clojure.core/declare deser-remote-access-session)

(clojure.core/declare deser-samples)

(clojure.core/declare deser-upload-category)

(clojure.core/declare deser-interaction-mode)

(clojure.core/declare deser-vpce-configuration)

(clojure.core/declare deser-problems)

(clojure.core/declare deser-device-pool-type)

(clojure.core/declare deser-offering-promotions)

(clojure.core/declare deser-runs)

(clojure.core/declare deser-offering-identifier)

(clojure.core/declare deser-problem)

(clojure.core/declare deser-video-capture)

(clojure.core/declare deser-message)

(clojure.core/declare deser-offering-transaction)

(clojure.core/declare deser-incompatibility-message)

(clojure.core/declare deser-aws-account-number)

(clojure.core/declare deser-job-timeout-minutes)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-sample-type)

(clojure.core/declare deser-service-dns-name)

(clojure.core/declare deser-network-profile-type)

(clojure.core/declare deser-project)

(clojure.core/declare deser-tests)

(clojure.core/declare deser-counters)

(clojure.core/declare deser-rule)

(clojure.core/declare deser-instance-labels)

(clojure.core/declare deser-device-pool)

(clojure.core/declare deser-client-id)

(clojure.core/declare deser-suite)

(clojure.core/declare deser-long)

(clojure.core/declare deser-artifact-type)

(clojure.core/declare deser-jobs)

(clojure.core/declare deser-device-form-factor)

(clojure.core/declare deser-problem-detail)

(clojure.core/declare deser-metadata)

(clojure.core/declare deser-execution-status)

(clojure.core/declare deser-unique-problems-by-execution-result-map)

(clojure.core/declare deser-recurring-charge-frequency)

(clojure.core/declare deser-device-attribute)

(clojure.core/declare deser-sample)

(clojure.core/declare deser-instance-status)

(clojure.core/declare deser-projects)

(clojure.core/declare deser-purchased-devices-map)

(clojure.core/declare deser-device-pools)

(clojure.core/declare deser-job)

(clojure.core/declare deser-recurring-charges)

(clojure.core/declare deser-offering-type)

(clojure.core/declare deser-package-ids)

(clojure.core/declare deser-name)

(clojure.core/declare deser-device-pool-compatibility-results)

(clojure.core/declare deser-rules)

(clojure.core/declare deser-device)

(clojure.core/declare deser-ios-paths)

(clojure.core/declare deser-network-profile)

(clojure.core/declare deser-monetary-amount)

(clojure.core/declare deser-device-minutes)

(clojure.core/declare deser-upload-status)

(clojure.core/declare deser-incompatibility-messages)

(clojure.core/declare deser-offering-status)

(clojure.core/declare deser-devices)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-offering-transaction-type [input] (clojure.core/get {"PURCHASE" :purchase, "RENEW" :renew, "SYSTEM" :system} input))

(clojure.core/defn- deser-vpce-configuration-description [input] input)

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-vpce-configuration-name [input] input)

(clojure.core/defn- deser-currency-code [input] (clojure.core/get {"USD" :usd} input))

(clojure.core/defn- deser-max-slot-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-integer v)])) input))

(clojure.core/defn- deser-skip-app-resign [input] input)

(clojure.core/defn- deser-android-paths [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-device-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "deviceArn") (clojure.core/assoc :device-arn (deser-amazon-resource-name (input "deviceArn"))) (clojure.core/contains? input "labels") (clojure.core/assoc :labels (deser-instance-labels (input "labels"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-instance-status (input "status"))) (clojure.core/contains? input "udid") (clojure.core/assoc :udid (deser-string (input "udid"))) (clojure.core/contains? input "instanceProfile") (clojure.core/assoc :instance-profile (deser-instance-profile (input "instanceProfile")))))

(clojure.core/defn- deser-run [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-date-time (input "created"))) (clojure.core/contains? input "skipAppResign") (clojure.core/assoc :skip-app-resign (deser-skip-app-resign (input "skipAppResign"))) (clojure.core/contains? input "networkProfile") (clojure.core/assoc :network-profile (deser-network-profile (input "networkProfile"))) (clojure.core/contains? input "started") (clojure.core/assoc :started (deser-date-time (input "started"))) (clojure.core/contains? input "parsingResultUrl") (clojure.core/assoc :parsing-result-url (deser-string (input "parsingResultUrl"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "appUpload") (clojure.core/assoc :app-upload (deser-amazon-resource-name (input "appUpload"))) (clojure.core/contains? input "resultCode") (clojure.core/assoc :result-code (deser-execution-result-code (input "resultCode"))) (clojure.core/contains? input "jobTimeoutMinutes") (clojure.core/assoc :job-timeout-minutes (deser-job-timeout-minutes (input "jobTimeoutMinutes"))) (clojure.core/contains? input "completedJobs") (clojure.core/assoc :completed-jobs (deser-integer (input "completedJobs"))) (clojure.core/contains? input "customerArtifactPaths") (clojure.core/assoc :customer-artifact-paths (deser-customer-artifact-paths (input "customerArtifactPaths"))) (clojure.core/contains? input "counters") (clojure.core/assoc :counters (deser-counters (input "counters"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "locale") (clojure.core/assoc :locale (deser-string (input "locale"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location (input "location"))) (clojure.core/contains? input "seed") (clojure.core/assoc :seed (deser-integer (input "seed"))) (clojure.core/contains? input "radios") (clojure.core/assoc :radios (deser-radios (input "radios"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-execution-status (input "status"))) (clojure.core/contains? input "eventCount") (clojure.core/assoc :event-count (deser-integer (input "eventCount"))) (clojure.core/contains? input "stopped") (clojure.core/assoc :stopped (deser-date-time (input "stopped"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-test-type (input "type"))) (clojure.core/contains? input "devicePoolArn") (clojure.core/assoc :device-pool-arn (deser-amazon-resource-name (input "devicePoolArn"))) (clojure.core/contains? input "billingMethod") (clojure.core/assoc :billing-method (deser-billing-method (input "billingMethod"))) (clojure.core/contains? input "testSpecArn") (clojure.core/assoc :test-spec-arn (deser-amazon-resource-name (input "testSpecArn"))) (clojure.core/contains? input "platform") (clojure.core/assoc :platform (deser-device-platform (input "platform"))) (clojure.core/contains? input "deviceMinutes") (clojure.core/assoc :device-minutes (deser-device-minutes (input "deviceMinutes"))) (clojure.core/contains? input "webUrl") (clojure.core/assoc :web-url (deser-string (input "webUrl"))) (clojure.core/contains? input "totalJobs") (clojure.core/assoc :total-jobs (deser-integer (input "totalJobs"))) (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-execution-result (input "result")))))

(clojure.core/defn- deser-execution-result [input] (clojure.core/get {"PENDING" :pending, "PASSED" :passed, "WARNED" :warned, "FAILED" :failed, "SKIPPED" :skipped, "ERRORED" :errored, "STOPPED" :stopped} input))

(clojure.core/defn- deser-vpce-service-name [input] input)

(clojure.core/defn- deser-offering-status-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-offering-identifier k) (deser-offering-status v)])) input))

(clojure.core/defn- deser-execution-result-code [input] (clojure.core/get {"PARSING_FAILED" :parsing-failed, "VPC_ENDPOINT_SETUP_FAILED" :vpc-endpoint-setup-failed} input))

(clojure.core/defn- deser-uploads [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-upload coll))) input))

(clojure.core/defn- deser-device-host-paths [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-transaction-identifier [input] input)

(clojure.core/defn- deser-offerings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-offering coll))) input))

(clojure.core/defn- deser-upload [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-date-time (input "created"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-url (input "url"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-upload-status (input "status"))) (clojure.core/contains? input "metadata") (clojure.core/assoc :metadata (deser-metadata (input "metadata"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-upload-type (input "type"))) (clojure.core/contains? input "contentType") (clojure.core/assoc :content-type (deser-content-type (input "contentType"))) (clojure.core/contains? input "category") (clojure.core/assoc :category (deser-upload-category (input "category")))))

(clojure.core/defn- deser-device-platform [input] (clojure.core/get {"ANDROID" :android, "IOS" :ios} input))

(clojure.core/defn- deser-percent-integer [input] input)

(clojure.core/defn- deser-instance-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "packageCleanup") (clojure.core/assoc :package-cleanup (deser-boolean (input "packageCleanup"))) (clojure.core/contains? input "excludeAppPackagesFromCleanup") (clojure.core/assoc :exclude-app-packages-from-cleanup (deser-package-ids (input "excludeAppPackagesFromCleanup"))) (clojure.core/contains? input "rebootAfterUse") (clojure.core/assoc :reboot-after-use (deser-boolean (input "rebootAfterUse"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-message (input "description")))))

(clojure.core/defn- deser-host-address [input] input)

(clojure.core/defn- deser-test [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-date-time (input "created"))) (clojure.core/contains? input "started") (clojure.core/assoc :started (deser-date-time (input "started"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "counters") (clojure.core/assoc :counters (deser-counters (input "counters"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-execution-status (input "status"))) (clojure.core/contains? input "stopped") (clojure.core/assoc :stopped (deser-date-time (input "stopped"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-test-type (input "type"))) (clojure.core/contains? input "deviceMinutes") (clojure.core/assoc :device-minutes (deser-device-minutes (input "deviceMinutes"))) (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-execution-result (input "result")))))

(clojure.core/defn- deser-customer-artifact-paths [input] (clojure.core/cond-> {} (clojure.core/contains? input "iosPaths") (clojure.core/assoc :ios-paths (deser-ios-paths (input "iosPaths"))) (clojure.core/contains? input "androidPaths") (clojure.core/assoc :android-paths (deser-android-paths (input "androidPaths"))) (clojure.core/contains? input "deviceHostPaths") (clojure.core/assoc :device-host-paths (deser-device-host-paths (input "deviceHostPaths")))))

(clojure.core/defn- deser-amazon-resource-name [input] input)

(clojure.core/defn- deser-rule-operator [input] (clojure.core/get {"EQUALS" :equals, "LESS_THAN" :less-than, "GREATER_THAN" :greater-than, "IN" :in, "NOT_IN" :not-in, "CONTAINS" :contains} input))

(clojure.core/defn- deser-account-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "awsAccountNumber") (clojure.core/assoc :aws-account-number (deser-aws-account-number (input "awsAccountNumber"))) (clojure.core/contains? input "unmeteredDevices") (clojure.core/assoc :unmetered-devices (deser-purchased-devices-map (input "unmeteredDevices"))) (clojure.core/contains? input "unmeteredRemoteAccessDevices") (clojure.core/assoc :unmetered-remote-access-devices (deser-purchased-devices-map (input "unmeteredRemoteAccessDevices"))) (clojure.core/contains? input "maxJobTimeoutMinutes") (clojure.core/assoc :max-job-timeout-minutes (deser-job-timeout-minutes (input "maxJobTimeoutMinutes"))) (clojure.core/contains? input "trialMinutes") (clojure.core/assoc :trial-minutes (deser-trial-minutes (input "trialMinutes"))) (clojure.core/contains? input "maxSlots") (clojure.core/assoc :max-slots (deser-max-slot-map (input "maxSlots"))) (clojure.core/contains? input "defaultJobTimeoutMinutes") (clojure.core/assoc :default-job-timeout-minutes (deser-job-timeout-minutes (input "defaultJobTimeoutMinutes"))) (clojure.core/contains? input "skipAppResign") (clojure.core/assoc :skip-app-resign (deser-skip-app-resign (input "skipAppResign")))))

(clojure.core/defn- deser-offering-promotion [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-offering-promotion-identifier (input "id"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-message (input "description")))))

(clojure.core/defn- deser-vpce-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpce-configuration coll))) input))

(clojure.core/defn- deser-remote-access-sessions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-remote-access-session coll))) input))

(clojure.core/defn- deser-offering-promotion-identifier [input] input)

(clojure.core/defn- deser-test-type [input] (clojure.core/get {"XCTEST" :xctest, "APPIUM_WEB_JAVA_TESTNG" :appium-web-java-testng, "BUILTIN_EXPLORER" :builtin-explorer, "APPIUM_WEB_PYTHON" :appium-web-python, "UIAUTOMATOR" :uiautomator, "UIAUTOMATION" :uiautomation, "CALABASH" :calabash, "APPIUM_JAVA_JUNIT" :appium-java-junit, "BUILTIN_FUZZ" :builtin-fuzz, "WEB_PERFORMANCE_PROFILE" :web-performance-profile, "APPIUM_PYTHON" :appium-python, "REMOTE_ACCESS_REPLAY" :remote-access-replay, "APPIUM_JAVA_TESTNG" :appium-java-testng, "APPIUM_WEB_JAVA_JUNIT" :appium-web-java-junit, "INSTRUMENTATION" :instrumentation, "XCTEST_UI" :xctest-ui, "REMOTE_ACCESS_RECORD" :remote-access-record} input))

(clojure.core/defn- deser-radios [input] (clojure.core/cond-> {} (clojure.core/contains? input "wifi") (clojure.core/assoc :wifi (deser-boolean (input "wifi"))) (clojure.core/contains? input "bluetooth") (clojure.core/assoc :bluetooth (deser-boolean (input "bluetooth"))) (clojure.core/contains? input "nfc") (clojure.core/assoc :nfc (deser-boolean (input "nfc"))) (clojure.core/contains? input "gps") (clojure.core/assoc :gps (deser-boolean (input "gps")))))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-billing-method [input] (clojure.core/get {"METERED" :metered, "UNMETERED" :unmetered} input))

(clojure.core/defn- deser-location [input] (clojure.core/cond-> {:latitude (deser-double (input "latitude")), :longitude (deser-double (input "longitude"))}))

(clojure.core/defn- deser-trial-minutes [input] (clojure.core/cond-> {} (clojure.core/contains? input "total") (clojure.core/assoc :total (deser-double (input "total"))) (clojure.core/contains? input "remaining") (clojure.core/assoc :remaining (deser-double (input "remaining")))))

(clojure.core/defn- deser-resolution [input] (clojure.core/cond-> {} (clojure.core/contains? input "width") (clojure.core/assoc :width (deser-integer (input "width"))) (clojure.core/contains? input "height") (clojure.core/assoc :height (deser-integer (input "height")))))

(clojure.core/defn- deser-network-profiles [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-network-profile coll))) input))

(clojure.core/defn- deser-cpu [input] (clojure.core/cond-> {} (clojure.core/contains? input "frequency") (clojure.core/assoc :frequency (deser-string (input "frequency"))) (clojure.core/contains? input "architecture") (clojure.core/assoc :architecture (deser-string (input "architecture"))) (clojure.core/contains? input "clock") (clojure.core/assoc :clock (deser-double (input "clock")))))

(clojure.core/defn- deser-offering-transactions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-offering-transaction coll))) input))

(clojure.core/defn- deser-offering [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-offering-identifier (input "id"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-message (input "description"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-offering-type (input "type"))) (clojure.core/contains? input "platform") (clojure.core/assoc :platform (deser-device-platform (input "platform"))) (clojure.core/contains? input "recurringCharges") (clojure.core/assoc :recurring-charges (deser-recurring-charges (input "recurringCharges")))))

(clojure.core/defn- deser-device-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-instance coll))) input))

(clojure.core/defn- deser-artifacts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-artifact coll))) input))

(clojure.core/defn- deser-artifact [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-artifact-type (input "type"))) (clojure.core/contains? input "extension") (clojure.core/assoc :extension (deser-string (input "extension"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-url (input "url")))))

(clojure.core/defn- deser-unique-problems [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unique-problem coll))) input))

(clojure.core/defn- deser-upload-type [input] (clojure.core/get {"UIAUTOMATOR_TEST_PACKAGE" :uiautomator-test-package, "XCTEST_UI_TEST_SPEC" :xctest-ui-test-spec, "EXTERNAL_DATA" :external-data, "APPIUM_JAVA_TESTNG_TEST_SPEC" :appium-java-testng-test-spec, "XCTEST_TEST_PACKAGE" :xctest-test-package, "APPIUM_JAVA_TESTNG_TEST_PACKAGE" :appium-java-testng-test-package, "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC" :appium-web-java-testng-test-spec, "APPIUM_PYTHON_TEST_PACKAGE" :appium-python-test-package, "WEB_APP" :web-app, "ANDROID_APP" :android-app, "INSTRUMENTATION_TEST_PACKAGE" :instrumentation-test-package, "IOS_APP" :ios-app, "APPIUM_JAVA_JUNIT_TEST_SPEC" :appium-java-junit-test-spec, "INSTRUMENTATION_TEST_SPEC" :instrumentation-test-spec, "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE" :appium-web-java-testng-test-package, "APPIUM_WEB_PYTHON_TEST_PACKAGE" :appium-web-python-test-package, "APPIUM_PYTHON_TEST_SPEC" :appium-python-test-spec, "UIAUTOMATION_TEST_PACKAGE" :uiautomation-test-package, "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC" :appium-web-java-junit-test-spec, "APPIUM_JAVA_JUNIT_TEST_PACKAGE" :appium-java-junit-test-package, "XCTEST_UI_TEST_PACKAGE" :xctest-ui-test-package, "APPIUM_WEB_PYTHON_TEST_SPEC" :appium-web-python-test-spec, "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE" :appium-web-java-junit-test-package, "CALABASH_TEST_PACKAGE" :calabash-test-package} input))

(clojure.core/defn- deser-suites [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-suite coll))) input))

(clojure.core/defn- deser-recurring-charge [input] (clojure.core/cond-> {} (clojure.core/contains? input "cost") (clojure.core/assoc :cost (deser-monetary-amount (input "cost"))) (clojure.core/contains? input "frequency") (clojure.core/assoc :frequency (deser-recurring-charge-frequency (input "frequency")))))

(clojure.core/defn- deser-unique-problem [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "problems") (clojure.core/assoc :problems (deser-problems (input "problems")))))

(clojure.core/defn- deser-instance-profiles [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-profile coll))) input))

(clojure.core/defn- deser-content-type [input] input)

(clojure.core/defn- deser-device-pool-compatibility-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "device") (clojure.core/assoc :device (deser-device (input "device"))) (clojure.core/contains? input "compatible") (clojure.core/assoc :compatible (deser-boolean (input "compatible"))) (clojure.core/contains? input "incompatibilityMessages") (clojure.core/assoc :incompatibility-messages (deser-incompatibility-messages (input "incompatibilityMessages")))))

(clojure.core/defn- deser-remote-access-session [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-date-time (input "created"))) (clojure.core/contains? input "device") (clojure.core/assoc :device (deser-device (input "device"))) (clojure.core/contains? input "skipAppResign") (clojure.core/assoc :skip-app-resign (deser-skip-app-resign (input "skipAppResign"))) (clojure.core/contains? input "started") (clojure.core/assoc :started (deser-date-time (input "started"))) (clojure.core/contains? input "deviceUdid") (clojure.core/assoc :device-udid (deser-string (input "deviceUdid"))) (clojure.core/contains? input "hostAddress") (clojure.core/assoc :host-address (deser-host-address (input "hostAddress"))) (clojure.core/contains? input "remoteRecordEnabled") (clojure.core/assoc :remote-record-enabled (deser-boolean (input "remoteRecordEnabled"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "remoteDebugEnabled") (clojure.core/assoc :remote-debug-enabled (deser-boolean (input "remoteDebugEnabled"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-execution-status (input "status"))) (clojure.core/contains? input "clientId") (clojure.core/assoc :client-id (deser-client-id (input "clientId"))) (clojure.core/contains? input "stopped") (clojure.core/assoc :stopped (deser-date-time (input "stopped"))) (clojure.core/contains? input "remoteRecordAppArn") (clojure.core/assoc :remote-record-app-arn (deser-amazon-resource-name (input "remoteRecordAppArn"))) (clojure.core/contains? input "endpoint") (clojure.core/assoc :endpoint (deser-string (input "endpoint"))) (clojure.core/contains? input "interactionMode") (clojure.core/assoc :interaction-mode (deser-interaction-mode (input "interactionMode"))) (clojure.core/contains? input "billingMethod") (clojure.core/assoc :billing-method (deser-billing-method (input "billingMethod"))) (clojure.core/contains? input "deviceMinutes") (clojure.core/assoc :device-minutes (deser-device-minutes (input "deviceMinutes"))) (clojure.core/contains? input "instanceArn") (clojure.core/assoc :instance-arn (deser-amazon-resource-name (input "instanceArn"))) (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-execution-result (input "result")))))

(clojure.core/defn- deser-samples [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sample coll))) input))

(clojure.core/defn- deser-upload-category [input] (clojure.core/get {"CURATED" :curated, "PRIVATE" :private} input))

(clojure.core/defn- deser-interaction-mode [input] (clojure.core/get {"INTERACTIVE" :interactive, "NO_VIDEO" :no-video, "VIDEO_ONLY" :video-only} input))

(clojure.core/defn- deser-vpce-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "vpceConfigurationName") (clojure.core/assoc :vpce-configuration-name (deser-vpce-configuration-name (input "vpceConfigurationName"))) (clojure.core/contains? input "vpceServiceName") (clojure.core/assoc :vpce-service-name (deser-vpce-service-name (input "vpceServiceName"))) (clojure.core/contains? input "serviceDnsName") (clojure.core/assoc :service-dns-name (deser-service-dns-name (input "serviceDnsName"))) (clojure.core/contains? input "vpceConfigurationDescription") (clojure.core/assoc :vpce-configuration-description (deser-vpce-configuration-description (input "vpceConfigurationDescription")))))

(clojure.core/defn- deser-problems [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-problem coll))) input))

(clojure.core/defn- deser-device-pool-type [input] (clojure.core/get {"CURATED" :curated, "PRIVATE" :private} input))

(clojure.core/defn- deser-offering-promotions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-offering-promotion coll))) input))

(clojure.core/defn- deser-runs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-run coll))) input))

(clojure.core/defn- deser-offering-identifier [input] input)

(clojure.core/defn- deser-problem [input] (clojure.core/cond-> {} (clojure.core/contains? input "run") (clojure.core/assoc :run (deser-problem-detail (input "run"))) (clojure.core/contains? input "job") (clojure.core/assoc :job (deser-problem-detail (input "job"))) (clojure.core/contains? input "suite") (clojure.core/assoc :suite (deser-problem-detail (input "suite"))) (clojure.core/contains? input "test") (clojure.core/assoc :test (deser-problem-detail (input "test"))) (clojure.core/contains? input "device") (clojure.core/assoc :device (deser-device (input "device"))) (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-execution-result (input "result"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-video-capture [input] input)

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-offering-transaction [input] (clojure.core/cond-> {} (clojure.core/contains? input "offeringStatus") (clojure.core/assoc :offering-status (deser-offering-status (input "offeringStatus"))) (clojure.core/contains? input "transactionId") (clojure.core/assoc :transaction-id (deser-transaction-identifier (input "transactionId"))) (clojure.core/contains? input "offeringPromotionId") (clojure.core/assoc :offering-promotion-id (deser-offering-promotion-identifier (input "offeringPromotionId"))) (clojure.core/contains? input "createdOn") (clojure.core/assoc :created-on (deser-date-time (input "createdOn"))) (clojure.core/contains? input "cost") (clojure.core/assoc :cost (deser-monetary-amount (input "cost")))))

(clojure.core/defn- deser-incompatibility-message [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-device-attribute (input "type")))))

(clojure.core/defn- deser-aws-account-number [input] input)

(clojure.core/defn- deser-job-timeout-minutes [input] input)

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-sample-type [input] (clojure.core/get {"RX" :rx, "OPENGL_MAX_DRAWTIME" :opengl-max-drawtime, "NATIVE_MAX_DRAWTIME" :native-max-drawtime, "MEMORY" :memory, "NATIVE_FRAMES" :native-frames, "RX_RATE" :rx-rate, "CPU" :cpu, "THREADS" :threads, "OPENGL_FRAMES" :opengl-frames, "OPENGL_MIN_DRAWTIME" :opengl-min-drawtime, "NATIVE_MIN_DRAWTIME" :native-min-drawtime, "NATIVE_FPS" :native-fps, "TX" :tx, "OPENGL_AVG_DRAWTIME" :opengl-avg-drawtime, "NATIVE_AVG_DRAWTIME" :native-avg-drawtime, "OPENGL_FPS" :opengl-fps, "TX_RATE" :tx-rate} input))

(clojure.core/defn- deser-service-dns-name [input] input)

(clojure.core/defn- deser-network-profile-type [input] (clojure.core/get {"CURATED" :curated, "PRIVATE" :private} input))

(clojure.core/defn- deser-project [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "defaultJobTimeoutMinutes") (clojure.core/assoc :default-job-timeout-minutes (deser-job-timeout-minutes (input "defaultJobTimeoutMinutes"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-date-time (input "created")))))

(clojure.core/defn- deser-tests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-test coll))) input))

(clojure.core/defn- deser-counters [input] (clojure.core/cond-> {} (clojure.core/contains? input "total") (clojure.core/assoc :total (deser-integer (input "total"))) (clojure.core/contains? input "passed") (clojure.core/assoc :passed (deser-integer (input "passed"))) (clojure.core/contains? input "failed") (clojure.core/assoc :failed (deser-integer (input "failed"))) (clojure.core/contains? input "warned") (clojure.core/assoc :warned (deser-integer (input "warned"))) (clojure.core/contains? input "errored") (clojure.core/assoc :errored (deser-integer (input "errored"))) (clojure.core/contains? input "stopped") (clojure.core/assoc :stopped (deser-integer (input "stopped"))) (clojure.core/contains? input "skipped") (clojure.core/assoc :skipped (deser-integer (input "skipped")))))

(clojure.core/defn- deser-rule [input] (clojure.core/cond-> {} (clojure.core/contains? input "attribute") (clojure.core/assoc :attribute (deser-device-attribute (input "attribute"))) (clojure.core/contains? input "operator") (clojure.core/assoc :operator (deser-rule-operator (input "operator"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value")))))

(clojure.core/defn- deser-instance-labels [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-device-pool [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-message (input "description"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-device-pool-type (input "type"))) (clojure.core/contains? input "rules") (clojure.core/assoc :rules (deser-rules (input "rules")))))

(clojure.core/defn- deser-client-id [input] input)

(clojure.core/defn- deser-suite [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-date-time (input "created"))) (clojure.core/contains? input "started") (clojure.core/assoc :started (deser-date-time (input "started"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "counters") (clojure.core/assoc :counters (deser-counters (input "counters"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-execution-status (input "status"))) (clojure.core/contains? input "stopped") (clojure.core/assoc :stopped (deser-date-time (input "stopped"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-test-type (input "type"))) (clojure.core/contains? input "deviceMinutes") (clojure.core/assoc :device-minutes (deser-device-minutes (input "deviceMinutes"))) (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-execution-result (input "result")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-artifact-type [input] (clojure.core/get {"CUSTOMER_ARTIFACT" :customer-artifact, "UNKNOWN" :unknown, "CALABASH_JSON_OUTPUT" :calabash-json-output, "APPIUM_SERVER_OUTPUT" :appium-server-output, "CALABASH_STANDARD_OUTPUT" :calabash-standard-output, "APPIUM_PYTHON_OUTPUT" :appium-python-output, "EXERCISER_MONKEY_OUTPUT" :exerciser-monkey-output, "RESULT_LOG" :result-log, "VIDEO" :video, "SCREENSHOT" :screenshot, "EXPLORER_SUMMARY_LOG" :explorer-summary-log, "INSTRUMENTATION_OUTPUT" :instrumentation-output, "VIDEO_LOG" :video-log, "APPIUM_JAVA_XML_OUTPUT" :appium-java-xml-output, "SERVICE_LOG" :service-log, "EXPLORER_EVENT_LOG" :explorer-event-log, "MESSAGE_LOG" :message-log, "WEBKIT_LOG" :webkit-log, "AUTOMATION_OUTPUT" :automation-output, "CALABASH_PRETTY_OUTPUT" :calabash-pretty-output, "TESTSPEC_OUTPUT" :testspec-output, "DEVICE_LOG" :device-log, "APPLICATION_CRASH_REPORT" :application-crash-report, "CUSTOMER_ARTIFACT_LOG" :customer-artifact-log, "APPIUM_PYTHON_XML_OUTPUT" :appium-python-xml-output, "XCTEST_LOG" :xctest-log, "APPIUM_JAVA_OUTPUT" :appium-java-output, "CALABASH_JAVA_XML_OUTPUT" :calabash-java-xml-output} input))

(clojure.core/defn- deser-jobs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job coll))) input))

(clojure.core/defn- deser-device-form-factor [input] (clojure.core/get {"PHONE" :phone, "TABLET" :tablet} input))

(clojure.core/defn- deser-problem-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name")))))

(clojure.core/defn- deser-metadata [input] input)

(clojure.core/defn- deser-execution-status [input] (clojure.core/get {"COMPLETED" :completed, "PENDING_CONCURRENCY" :pending-concurrency, "PENDING" :pending, "PREPARING" :preparing, "PENDING_DEVICE" :pending-device, "SCHEDULING" :scheduling, "STOPPING" :stopping, "PROCESSING" :processing, "RUNNING" :running} input))

(clojure.core/defn- deser-unique-problems-by-execution-result-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-execution-result k) (deser-unique-problems v)])) input))

(clojure.core/defn- deser-recurring-charge-frequency [input] (clojure.core/get {"MONTHLY" :monthly} input))

(clojure.core/defn- deser-device-attribute [input] (clojure.core/get {"FORM_FACTOR" :form-factor, "APPIUM_VERSION" :appium-version, "ARN" :arn, "REMOTE_DEBUG_ENABLED" :remote-debug-enabled, "INSTANCE_LABELS" :instance-labels, "INSTANCE_ARN" :instance-arn, "PLATFORM" :platform, "FLEET_TYPE" :fleet-type, "MANUFACTURER" :manufacturer, "REMOTE_ACCESS_ENABLED" :remote-access-enabled} input))

(clojure.core/defn- deser-sample [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-sample-type (input "type"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-url (input "url")))))

(clojure.core/defn- deser-instance-status [input] (clojure.core/get {"IN_USE" :in-use, "PREPARING" :preparing, "AVAILABLE" :available, "NOT_AVAILABLE" :not-available} input))

(clojure.core/defn- deser-projects [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project coll))) input))

(clojure.core/defn- deser-purchased-devices-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-device-platform k) (deser-integer v)])) input))

(clojure.core/defn- deser-device-pools [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-pool coll))) input))

(clojure.core/defn- deser-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-date-time (input "created"))) (clojure.core/contains? input "device") (clojure.core/assoc :device (deser-device (input "device"))) (clojure.core/contains? input "started") (clojure.core/assoc :started (deser-date-time (input "started"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "videoEndpoint") (clojure.core/assoc :video-endpoint (deser-string (input "videoEndpoint"))) (clojure.core/contains? input "counters") (clojure.core/assoc :counters (deser-counters (input "counters"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-execution-status (input "status"))) (clojure.core/contains? input "videoCapture") (clojure.core/assoc :video-capture (deser-video-capture (input "videoCapture"))) (clojure.core/contains? input "stopped") (clojure.core/assoc :stopped (deser-date-time (input "stopped"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-test-type (input "type"))) (clojure.core/contains? input "deviceMinutes") (clojure.core/assoc :device-minutes (deser-device-minutes (input "deviceMinutes"))) (clojure.core/contains? input "instanceArn") (clojure.core/assoc :instance-arn (deser-amazon-resource-name (input "instanceArn"))) (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-execution-result (input "result")))))

(clojure.core/defn- deser-recurring-charges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-recurring-charge coll))) input))

(clojure.core/defn- deser-offering-type [input] (clojure.core/get {"RECURRING" :recurring} input))

(clojure.core/defn- deser-package-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-device-pool-compatibility-results [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-pool-compatibility-result coll))) input))

(clojure.core/defn- deser-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule coll))) input))

(clojure.core/defn- deser-device [input] (clojure.core/cond-> {} (clojure.core/contains? input "model") (clojure.core/assoc :model (deser-string (input "model"))) (clojure.core/contains? input "fleetType") (clojure.core/assoc :fleet-type (deser-string (input "fleetType"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "remoteAccessEnabled") (clojure.core/assoc :remote-access-enabled (deser-boolean (input "remoteAccessEnabled"))) (clojure.core/contains? input "fleetName") (clojure.core/assoc :fleet-name (deser-string (input "fleetName"))) (clojure.core/contains? input "image") (clojure.core/assoc :image (deser-string (input "image"))) (clojure.core/contains? input "os") (clojure.core/assoc :os (deser-string (input "os"))) (clojure.core/contains? input "remoteDebugEnabled") (clojure.core/assoc :remote-debug-enabled (deser-boolean (input "remoteDebugEnabled"))) (clojure.core/contains? input "modelId") (clojure.core/assoc :model-id (deser-string (input "modelId"))) (clojure.core/contains? input "manufacturer") (clojure.core/assoc :manufacturer (deser-string (input "manufacturer"))) (clojure.core/contains? input "cpu") (clojure.core/assoc :cpu (deser-cpu (input "cpu"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "radio") (clojure.core/assoc :radio (deser-string (input "radio"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-long (input "memory"))) (clojure.core/contains? input "formFactor") (clojure.core/assoc :form-factor (deser-device-form-factor (input "formFactor"))) (clojure.core/contains? input "instances") (clojure.core/assoc :instances (deser-device-instances (input "instances"))) (clojure.core/contains? input "carrier") (clojure.core/assoc :carrier (deser-string (input "carrier"))) (clojure.core/contains? input "platform") (clojure.core/assoc :platform (deser-device-platform (input "platform"))) (clojure.core/contains? input "heapSize") (clojure.core/assoc :heap-size (deser-long (input "heapSize"))) (clojure.core/contains? input "resolution") (clojure.core/assoc :resolution (deser-resolution (input "resolution")))))

(clojure.core/defn- deser-ios-paths [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-network-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "uplinkJitterMs") (clojure.core/assoc :uplink-jitter-ms (deser-long (input "uplinkJitterMs"))) (clojure.core/contains? input "uplinkDelayMs") (clojure.core/assoc :uplink-delay-ms (deser-long (input "uplinkDelayMs"))) (clojure.core/contains? input "downlinkLossPercent") (clojure.core/assoc :downlink-loss-percent (deser-percent-integer (input "downlinkLossPercent"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-amazon-resource-name (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "downlinkBandwidthBits") (clojure.core/assoc :downlink-bandwidth-bits (deser-long (input "downlinkBandwidthBits"))) (clojure.core/contains? input "downlinkDelayMs") (clojure.core/assoc :downlink-delay-ms (deser-long (input "downlinkDelayMs"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-network-profile-type (input "type"))) (clojure.core/contains? input "uplinkLossPercent") (clojure.core/assoc :uplink-loss-percent (deser-percent-integer (input "uplinkLossPercent"))) (clojure.core/contains? input "uplinkBandwidthBits") (clojure.core/assoc :uplink-bandwidth-bits (deser-long (input "uplinkBandwidthBits"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-message (input "description"))) (clojure.core/contains? input "downlinkJitterMs") (clojure.core/assoc :downlink-jitter-ms (deser-long (input "downlinkJitterMs")))))

(clojure.core/defn- deser-monetary-amount [input] (clojure.core/cond-> {} (clojure.core/contains? input "amount") (clojure.core/assoc :amount (deser-double (input "amount"))) (clojure.core/contains? input "currencyCode") (clojure.core/assoc :currency-code (deser-currency-code (input "currencyCode")))))

(clojure.core/defn- deser-device-minutes [input] (clojure.core/cond-> {} (clojure.core/contains? input "total") (clojure.core/assoc :total (deser-double (input "total"))) (clojure.core/contains? input "metered") (clojure.core/assoc :metered (deser-double (input "metered"))) (clojure.core/contains? input "unmetered") (clojure.core/assoc :unmetered (deser-double (input "unmetered")))))

(clojure.core/defn- deser-upload-status [input] (clojure.core/get {"INITIALIZED" :initialized, "PROCESSING" :processing, "SUCCEEDED" :succeeded, "FAILED" :failed} input))

(clojure.core/defn- deser-incompatibility-messages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-incompatibility-message coll))) input))

(clojure.core/defn- deser-offering-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-offering-transaction-type (input "type"))) (clojure.core/contains? input "offering") (clojure.core/assoc :offering (deser-offering (input "offering"))) (clojure.core/contains? input "quantity") (clojure.core/assoc :quantity (deser-integer (input "quantity"))) (clojure.core/contains? input "effectiveOn") (clojure.core/assoc :effective-on (deser-date-time (input "effectiveOn")))))

(clojure.core/defn- deser-devices [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device coll))) input))

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-argument-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-list-projects-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "projects") (clojure.core/assoc :projects (deser-projects (input "projects"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-update-project-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "project") (clojure.core/assoc :project (deser-project (input "project")))))

(clojure.core/defn- deser-list-remote-access-sessions-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "remoteAccessSessions") (clojure.core/assoc :remote-access-sessions (deser-remote-access-sessions (input "remoteAccessSessions"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-suites-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "suites") (clojure.core/assoc :suites (deser-suites (input "suites"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-stop-job-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "job") (clojure.core/assoc :job (deser-job (input "job")))))

(clojure.core/defn- deser-get-network-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "networkProfile") (clojure.core/assoc :network-profile (deser-network-profile (input "networkProfile")))))

(clojure.core/defn- deser-get-job-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "job") (clojure.core/assoc :job (deser-job (input "job")))))

(clojure.core/defn- deser-list-tests-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "tests") (clojure.core/assoc :tests (deser-tests (input "tests"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-get-remote-access-session-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "remoteAccessSession") (clojure.core/assoc :remote-access-session (deser-remote-access-session (input "remoteAccessSession")))))

(clojure.core/defn- deser-list-device-pools-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "devicePools") (clojure.core/assoc :device-pools (deser-device-pools (input "devicePools"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-get-device-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "device") (clojure.core/assoc :device (deser-device (input "device")))))

(clojure.core/defn- deser-get-account-settings-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "accountSettings") (clojure.core/assoc :account-settings (deser-account-settings (input "accountSettings")))))

(clojure.core/defn- deser-create-upload-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "upload") (clojure.core/assoc :upload (deser-upload (input "upload")))))

(clojure.core/defn- deser-get-project-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "project") (clojure.core/assoc :project (deser-project (input "project")))))

(clojure.core/defn- deser-schedule-run-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "run") (clojure.core/assoc :run (deser-run (input "run")))))

(clojure.core/defn- deser-get-instance-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceProfile") (clojure.core/assoc :instance-profile (deser-instance-profile (input "instanceProfile")))))

(clojure.core/defn- deser-list-instance-profiles-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceProfiles") (clojure.core/assoc :instance-profiles (deser-instance-profiles (input "instanceProfiles"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-delete-network-profile-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-samples-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "samples") (clojure.core/assoc :samples (deser-samples (input "samples"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-service-account-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-list-offerings-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "offerings") (clojure.core/assoc :offerings (deser-offerings (input "offerings"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-create-vpce-configuration-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpceConfiguration") (clojure.core/assoc :vpce-configuration (deser-vpce-configuration (input "vpceConfiguration")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-create-instance-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceProfile") (clojure.core/assoc :instance-profile (deser-instance-profile (input "instanceProfile")))))

(clojure.core/defn- deser-delete-instance-profile-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-device-pool-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-uploads-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "uploads") (clojure.core/assoc :uploads (deser-uploads (input "uploads"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-artifacts-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "artifacts") (clojure.core/assoc :artifacts (deser-artifacts (input "artifacts"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-get-test-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "test") (clojure.core/assoc :test (deser-test (input "test")))))

(clojure.core/defn- deser-create-network-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "networkProfile") (clojure.core/assoc :network-profile (deser-network-profile (input "networkProfile")))))

(clojure.core/defn- deser-get-device-pool-compatibility-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "compatibleDevices") (clojure.core/assoc :compatible-devices (deser-device-pool-compatibility-results (input "compatibleDevices"))) (clojure.core/contains? input "incompatibleDevices") (clojure.core/assoc :incompatible-devices (deser-device-pool-compatibility-results (input "incompatibleDevices")))))

(clojure.core/defn- deser-idempotency-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-list-offering-promotions-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "offeringPromotions") (clojure.core/assoc :offering-promotions (deser-offering-promotions (input "offeringPromotions"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-invalid-operation-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-delete-remote-access-session-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-device-instances-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "deviceInstances") (clojure.core/assoc :device-instances (deser-device-instances (input "deviceInstances"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-renew-offering-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "offeringTransaction") (clojure.core/assoc :offering-transaction (deser-offering-transaction (input "offeringTransaction")))))

(clojure.core/defn- deser-update-device-pool-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "devicePool") (clojure.core/assoc :device-pool (deser-device-pool (input "devicePool")))))

(clojure.core/defn- deser-create-project-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "project") (clojure.core/assoc :project (deser-project (input "project")))))

(clojure.core/defn- deser-list-unique-problems-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "uniqueProblems") (clojure.core/assoc :unique-problems (deser-unique-problems-by-execution-result-map (input "uniqueProblems"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-get-offering-status-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "current") (clojure.core/assoc :current (deser-offering-status-map (input "current"))) (clojure.core/contains? input "nextPeriod") (clojure.core/assoc :next-period (deser-offering-status-map (input "nextPeriod"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-vpce-configurations-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpceConfigurations") (clojure.core/assoc :vpce-configurations (deser-vpce-configurations (input "vpceConfigurations"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-get-run-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "run") (clojure.core/assoc :run (deser-run (input "run")))))

(clojure.core/defn- deser-update-instance-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceProfile") (clojure.core/assoc :instance-profile (deser-instance-profile (input "instanceProfile")))))

(clojure.core/defn- deser-not-eligible-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-update-vpce-configuration-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpceConfiguration") (clojure.core/assoc :vpce-configuration (deser-vpce-configuration (input "vpceConfiguration")))))

(clojure.core/defn- deser-list-devices-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "devices") (clojure.core/assoc :devices (deser-devices (input "devices"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-update-device-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "deviceInstance") (clojure.core/assoc :device-instance (deser-device-instance (input "deviceInstance")))))

(clojure.core/defn- deser-stop-run-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "run") (clojure.core/assoc :run (deser-run (input "run")))))

(clojure.core/defn- deser-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-get-suite-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "suite") (clojure.core/assoc :suite (deser-suite (input "suite")))))

(clojure.core/defn- deser-install-to-remote-access-session-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "appUpload") (clojure.core/assoc :app-upload (deser-upload (input "appUpload")))))

(clojure.core/defn- deser-delete-project-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-stop-remote-access-session-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "remoteAccessSession") (clojure.core/assoc :remote-access-session (deser-remote-access-session (input "remoteAccessSession")))))

(clojure.core/defn- deser-list-jobs-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "jobs") (clojure.core/assoc :jobs (deser-jobs (input "jobs"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-update-upload-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "upload") (clojure.core/assoc :upload (deser-upload (input "upload")))))

(clojure.core/defn- deser-create-remote-access-session-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "remoteAccessSession") (clojure.core/assoc :remote-access-session (deser-remote-access-session (input "remoteAccessSession")))))

(clojure.core/defn- deser-get-device-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "deviceInstance") (clojure.core/assoc :device-instance (deser-device-instance (input "deviceInstance")))))

(clojure.core/defn- deser-delete-upload-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-update-network-profile-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "networkProfile") (clojure.core/assoc :network-profile (deser-network-profile (input "networkProfile")))))

(clojure.core/defn- deser-create-device-pool-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "devicePool") (clojure.core/assoc :device-pool (deser-device-pool (input "devicePool")))))

(clojure.core/defn- deser-get-upload-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "upload") (clojure.core/assoc :upload (deser-upload (input "upload")))))

(clojure.core/defn- deser-delete-run-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-purchase-offering-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "offeringTransaction") (clojure.core/assoc :offering-transaction (deser-offering-transaction (input "offeringTransaction")))))

(clojure.core/defn- deser-delete-vpce-configuration-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-network-profiles-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "networkProfiles") (clojure.core/assoc :network-profiles (deser-network-profiles (input "networkProfiles"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-offering-transactions-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "offeringTransactions") (clojure.core/assoc :offering-transactions (deser-offering-transactions (input "offeringTransactions"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-runs-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "runs") (clojure.core/assoc :runs (deser-runs (input "runs"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-get-vpce-configuration-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpceConfiguration") (clojure.core/assoc :vpce-configuration (deser-vpce-configuration (input "vpceConfiguration")))))

(clojure.core/defn- deser-get-device-pool-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "devicePool") (clojure.core/assoc :device-pool (deser-device-pool (input "devicePool")))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/rules (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/rules))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-device-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/name :portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/description :portkey.aws.devicefarm.-2015-06-23.update-device-pool-request/rules]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/artifact-category #{"FILE" "SCREENSHOT" :file :log :screenshot "LOG"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/device-pool-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/app-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/test-type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/test (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/schedule-run-test))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/configuration (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/schedule-run-configuration))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-pool-compatibility-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/device-pool-arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/app-arn :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/test-type :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/test :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-request/configuration]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.argument-exception/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-projects-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-projects-request/arn :portkey.aws.devicefarm.-2015-06-23.list-projects-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-transaction-type #{"SYSTEM" :system :renew :purchase "RENEW" "PURCHASE"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-projects-result/projects (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/projects))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-projects-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-projects-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-projects-result/projects :portkey.aws.devicefarm.-2015-06-23.list-projects-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-project-result/project (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/project))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-project-result/project]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-result/remote-access-sessions (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/remote-access-sessions))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-remote-access-sessions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-result/remote-access-sessions :portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/currency-code #{:usd "USD"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-suites-result/suites (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/suites))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-suites-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-suites-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-suites-result/suites :portkey.aws.devicefarm.-2015-06-23.list-suites-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/max-slot-map (clojure.spec.alpha/map-of :portkey.aws.devicefarm.-2015-06-23/string :portkey.aws.devicefarm.-2015-06-23/integer))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.stop-job-result/job (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/stop-job-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.stop-job-result/job]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/skip-app-resign clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/android-paths (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/string))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-instance/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-instance/device-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-instance/labels (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-labels))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-instance/status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-instance/udid (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-instance/instance-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.device-instance/arn :portkey.aws.devicefarm.-2015-06-23.device-instance/device-arn :portkey.aws.devicefarm.-2015-06-23.device-instance/labels :portkey.aws.devicefarm.-2015-06-23.device-instance/status :portkey.aws.devicefarm.-2015-06-23.device-instance/udid :portkey.aws.devicefarm.-2015-06-23.device-instance/instance-profile]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-network-profile-result/network-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-network-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-network-profile-result/network-profile]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/filter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/created (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/skip-app-resign (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/skip-app-resign))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/network-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/started (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/parsing-result-url (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/app-upload (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/result-code (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-result-code))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/job-timeout-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/completed-jobs (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/customer-artifact-paths (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/customer-artifact-paths))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/counters (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/counters))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/locale (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/location (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/location))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/seed (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/radios (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/radios))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/event-count (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/stopped (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/device-pool-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/billing-method (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/billing-method))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/test-spec-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/platform (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-platform))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/device-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/web-url (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/total-jobs (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.run/result (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-result))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/run (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.run/message :portkey.aws.devicefarm.-2015-06-23.run/created :portkey.aws.devicefarm.-2015-06-23.run/skip-app-resign :portkey.aws.devicefarm.-2015-06-23.run/network-profile :portkey.aws.devicefarm.-2015-06-23.run/started :portkey.aws.devicefarm.-2015-06-23.run/parsing-result-url :portkey.aws.devicefarm.-2015-06-23.run/arn :portkey.aws.devicefarm.-2015-06-23.run/app-upload :portkey.aws.devicefarm.-2015-06-23.run/result-code :portkey.aws.devicefarm.-2015-06-23.run/job-timeout-minutes :portkey.aws.devicefarm.-2015-06-23.run/completed-jobs :portkey.aws.devicefarm.-2015-06-23.run/customer-artifact-paths :portkey.aws.devicefarm.-2015-06-23.run/counters :portkey.aws.devicefarm.-2015-06-23.run/name :portkey.aws.devicefarm.-2015-06-23.run/locale :portkey.aws.devicefarm.-2015-06-23.run/location :portkey.aws.devicefarm.-2015-06-23.run/seed :portkey.aws.devicefarm.-2015-06-23.run/radios :portkey.aws.devicefarm.-2015-06-23.run/status :portkey.aws.devicefarm.-2015-06-23.run/event-count :portkey.aws.devicefarm.-2015-06-23.run/stopped :portkey.aws.devicefarm.-2015-06-23.run/type :portkey.aws.devicefarm.-2015-06-23.run/device-pool-arn :portkey.aws.devicefarm.-2015-06-23.run/billing-method :portkey.aws.devicefarm.-2015-06-23.run/test-spec-arn :portkey.aws.devicefarm.-2015-06-23.run/platform :portkey.aws.devicefarm.-2015-06-23.run/device-minutes :portkey.aws.devicefarm.-2015-06-23.run/web-url :portkey.aws.devicefarm.-2015-06-23.run/total-jobs :portkey.aws.devicefarm.-2015-06-23.run/result]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-job-result/job (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-job-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-job-result/job]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-tests-result/tests (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/tests))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-tests-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-tests-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-tests-result/tests :portkey.aws.devicefarm.-2015-06-23.list-tests-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-vpce-configuration-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-vpce-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-vpce-configuration-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/execution-result #{:passed :pending "WARNED" "PENDING" :skipped :stopped "STOPPED" :errored "PASSED" "ERRORED" "FAILED" :failed :warned "SKIPPED"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/vpce-service-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-run-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-run-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-status-map (clojure.spec.alpha/map-of :portkey.aws.devicefarm.-2015-06-23/offering-identifier :portkey.aws.devicefarm.-2015-06-23/offering-status))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/execution-result-code #{"PARSING_FAILED" "VPC_ENDPOINT_SETUP_FAILED" :vpc-endpoint-setup-failed :parsing-failed})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-tests-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-tests-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-tests-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-tests-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-tests-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/uploads (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/upload))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-host-paths (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/string))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/transaction-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 32 (clojure.core/count s__27879__auto__)))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-remote-access-session-result/remote-access-session (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/remote-access-session))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-remote-access-session-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-remote-access-session-result/remote-access-session]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-pools-result/device-pools (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pools))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-pools-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-device-pools-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-device-pools-result/device-pools :portkey.aws.devicefarm.-2015-06-23.list-device-pools-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/project-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/app-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/device-pool-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/test (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/schedule-run-test))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/configuration (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/schedule-run-configuration))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/execution-configuration (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-configuration))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/schedule-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.schedule-run-request/project-arn :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/device-pool-arn :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/test] :opt-un [:portkey.aws.devicefarm.-2015-06-23.schedule-run-request/app-arn :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/name :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/configuration :portkey.aws.devicefarm.-2015-06-23.schedule-run-request/execution-configuration]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-artifacts-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-artifacts-request/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/artifact-category))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-artifacts-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-artifacts-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-artifacts-request/arn :portkey.aws.devicefarm.-2015-06-23.list-artifacts-request/type] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-artifacts-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-result/device (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-device-result/device]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-account-settings-result/account-settings (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/account-settings))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-account-settings-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-account-settings-result/account-settings]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offerings (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/offering))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/created (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/url (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/url))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/metadata (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/metadata))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/content-type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/content-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.upload/category (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload-category))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.upload/message :portkey.aws.devicefarm.-2015-06-23.upload/created :portkey.aws.devicefarm.-2015-06-23.upload/url :portkey.aws.devicefarm.-2015-06-23.upload/arn :portkey.aws.devicefarm.-2015-06-23.upload/name :portkey.aws.devicefarm.-2015-06-23.upload/status :portkey.aws.devicefarm.-2015-06-23.upload/metadata :portkey.aws.devicefarm.-2015-06-23.upload/type :portkey.aws.devicefarm.-2015-06-23.upload/content-type :portkey.aws.devicefarm.-2015-06-23.upload/category]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-upload-result/upload (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-upload-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-upload-result/upload]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-platform #{:ios "IOS" :android "ANDROID"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-project-result/project (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/project))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-project-result/project]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/percent-integer (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.instance-profile/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.instance-profile/package-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.instance-profile/exclude-app-packages-from-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/package-ids))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.instance-profile/reboot-after-use (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.instance-profile/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.instance-profile/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/instance-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.instance-profile/arn :portkey.aws.devicefarm.-2015-06-23.instance-profile/package-cleanup :portkey.aws.devicefarm.-2015-06-23.instance-profile/exclude-app-packages-from-cleanup :portkey.aws.devicefarm.-2015-06-23.instance-profile/reboot-after-use :portkey.aws.devicefarm.-2015-06-23.instance-profile/name :portkey.aws.devicefarm.-2015-06-23.instance-profile/description]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-offering-status-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-offering-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-offering-status-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-result/run (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/run))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/schedule-run-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.schedule-run-result/run]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/project-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/rules (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/rules))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-device-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/project-arn :portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/name :portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/rules] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-device-pool-request/description]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-instance-profile-result/instance-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-instance-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-instance-profile-result/instance-profile]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/host-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.stop-remote-access-session-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/stop-remote-access-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.stop-remote-access-session-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-unique-problems-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-unique-problems-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-unique-problems-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-unique-problems-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-unique-problems-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/created (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/started (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/counters (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/counters))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/stopped (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/device-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.test/result (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-result))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/test (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.test/message :portkey.aws.devicefarm.-2015-06-23.test/created :portkey.aws.devicefarm.-2015-06-23.test/started :portkey.aws.devicefarm.-2015-06-23.test/arn :portkey.aws.devicefarm.-2015-06-23.test/counters :portkey.aws.devicefarm.-2015-06-23.test/name :portkey.aws.devicefarm.-2015-06-23.test/status :portkey.aws.devicefarm.-2015-06-23.test/stopped :portkey.aws.devicefarm.-2015-06-23.test/type :portkey.aws.devicefarm.-2015-06-23.test/device-minutes :portkey.aws.devicefarm.-2015-06-23.test/result]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/ssh-public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-jobs-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-jobs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-jobs-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-jobs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.customer-artifact-paths/ios-paths (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/ios-paths))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.customer-artifact-paths/android-paths (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/android-paths))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.customer-artifact-paths/device-host-paths (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-host-paths))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/customer-artifact-paths (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.customer-artifact-paths/ios-paths :portkey.aws.devicefarm.-2015-06-23.customer-artifact-paths/android-paths :portkey.aws.devicefarm.-2015-06-23.customer-artifact-paths/device-host-paths]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 32 (clojure.core/count s__27879__auto__)))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/rule-operator #{"NOT_IN" "GREATER_THAN" :less-than :contains "CONTAINS" :greater-than "LESS_THAN" :equals :not-in "EQUALS" "IN" :in})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/aws-account-number (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/aws-account-number))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/unmetered-devices (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/purchased-devices-map))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/unmetered-remote-access-devices (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/purchased-devices-map))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/max-job-timeout-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/trial-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/trial-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/max-slots (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/max-slot-map))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/default-job-timeout-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.account-settings/skip-app-resign (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/skip-app-resign))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/account-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.account-settings/aws-account-number :portkey.aws.devicefarm.-2015-06-23.account-settings/unmetered-devices :portkey.aws.devicefarm.-2015-06-23.account-settings/unmetered-remote-access-devices :portkey.aws.devicefarm.-2015-06-23.account-settings/max-job-timeout-minutes :portkey.aws.devicefarm.-2015-06-23.account-settings/trial-minutes :portkey.aws.devicefarm.-2015-06-23.account-settings/max-slots :portkey.aws.devicefarm.-2015-06-23.account-settings/default-job-timeout-minutes :portkey.aws.devicefarm.-2015-06-23.account-settings/skip-app-resign]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-result/instance-profiles (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-profiles))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-instance-profiles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-result/instance-profiles :portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-promotion/id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-promotion-identifier))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-promotion/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-promotion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.offering-promotion/id :portkey.aws.devicefarm.-2015-06-23.offering-promotion/description]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-jitter-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-delay-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-loss-percent (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/percent-integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/project-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-bandwidth-bits (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-delay-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-loss-percent (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/percent-integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-bandwidth-bits (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-jitter-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-network-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/project-arn :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/name] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-jitter-ms :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-delay-ms :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-loss-percent :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-bandwidth-bits :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-delay-ms :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/type :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-loss-percent :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/uplink-bandwidth-bits :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/description :portkey.aws.devicefarm.-2015-06-23.create-network-profile-request/downlink-jitter-ms]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/vpce-configurations (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/vpce-configuration))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-instance-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-device-instance-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/remote-access-sessions (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/remote-access-session))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-network-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-promotion-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 4 (clojure.core/count s__27879__auto__)))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-samples-result/samples (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/samples))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-samples-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-samples-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-samples-result/samples :portkey.aws.devicefarm.-2015-06-23.list-samples-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.service-account-exception/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/service-account-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.service-account-exception/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-upload-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-upload-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-upload-request/content-type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/content-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-upload-request/edit-content (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.update-upload-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-upload-request/name :portkey.aws.devicefarm.-2015-06-23.update-upload-request/content-type :portkey.aws.devicefarm.-2015-06-23.update-upload-request/edit-content]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offerings-result/offerings (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offerings))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offerings-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-offerings-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-offerings-result/offerings :portkey.aws.devicefarm.-2015-06-23.list-offerings-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.install-to-remote-access-session-request/remote-access-session-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.install-to-remote-access-session-request/app-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/install-to-remote-access-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.install-to-remote-access-session-request/remote-access-session-arn :portkey.aws.devicefarm.-2015-06-23.install-to-remote-access-session-request/app-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/test-type #{:xctest-ui "XCTEST" :appium-java-junit "APPIUM_WEB_JAVA_TESTNG" "BUILTIN_EXPLORER" "APPIUM_WEB_PYTHON" :uiautomator "UIAUTOMATOR" "UIAUTOMATION" "CALABASH" :appium-web-python "APPIUM_JAVA_JUNIT" :appium-web-java-junit "BUILTIN_FUZZ" :uiautomation "WEB_PERFORMANCE_PROFILE" :appium-web-java-testng :xctest :remote-access-record "APPIUM_PYTHON" :appium-python :remote-access-replay "REMOTE_ACCESS_REPLAY" :builtin-explorer :calabash "APPIUM_JAVA_TESTNG" "APPIUM_WEB_JAVA_JUNIT" :web-performance-profile :instrumentation "INSTRUMENTATION" :builtin-fuzz :appium-java-testng "XCTEST_UI" "REMOTE_ACCESS_RECORD"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-remote-access-session-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-remote-access-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-remote-access-session-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-device-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-result/vpce-configuration (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-vpce-configuration-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-result/vpce-configuration]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.radios/wifi (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.radios/bluetooth (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.radios/nfc (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.radios/gps (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/radios (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.radios/wifi :portkey.aws.devicefarm.-2015-06-23.radios/bluetooth :portkey.aws.devicefarm.-2015-06-23.radios/nfc :portkey.aws.devicefarm.-2015-06-23.radios/gps]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 4 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/billing-method #{"UNMETERED" :unmetered "METERED" :metered})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.location/latitude (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.location/longitude (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/location (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.location/latitude :portkey.aws.devicefarm.-2015-06-23.location/longitude] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.trial-minutes/total (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.trial-minutes/remaining (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/trial-minutes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.trial-minutes/total :portkey.aws.devicefarm.-2015-06-23.trial-minutes/remaining]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.stop-job-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/stop-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.stop-job-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.resolution/width (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.resolution/height (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/resolution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.resolution/width :portkey.aws.devicefarm.-2015-06-23.resolution/height]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-result/instance-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-instance-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-instance-profile-result/instance-profile]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-instance-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-device-pool-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-uploads-result/uploads (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/uploads))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-uploads-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-uploads-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-uploads-result/uploads :portkey.aws.devicefarm.-2015-06-23.list-uploads-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/network-profiles (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/network-profile))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-artifacts-result/artifacts (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/artifacts))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-artifacts-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-artifacts-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-artifacts-result/artifacts :portkey.aws.devicefarm.-2015-06-23.list-artifacts-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-remote-access-sessions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-remote-access-sessions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-test-result/test (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-test-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-test-result/test]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/amazon-resource-names (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-network-profile-result/network-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-network-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-network-profile-result/network-profile]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-project-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-project-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-project-request/default-job-timeout-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.update-project-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-project-request/name :portkey.aws.devicefarm.-2015-06-23.update-project-request/default-job-timeout-minutes]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.cpu/frequency (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.cpu/architecture (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.cpu/clock (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/cpu (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.cpu/frequency :portkey.aws.devicefarm.-2015-06-23.cpu/architecture :portkey.aws.devicefarm.-2015-06-23.cpu/clock]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-result/compatible-devices (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pool-compatibility-results))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-result/incompatible-devices (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pool-compatibility-results))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-pool-compatibility-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-result/compatible-devices :portkey.aws.devicefarm.-2015-06-23.get-device-pool-compatibility-result/incompatible-devices]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-transactions (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/offering-transaction))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering/id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-identifier))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering/platform (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-platform))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering/recurring-charges (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/recurring-charges))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.offering/id :portkey.aws.devicefarm.-2015-06-23.offering/description :portkey.aws.devicefarm.-2015-06-23.offering/type :portkey.aws.devicefarm.-2015-06-23.offering/platform :portkey.aws.devicefarm.-2015-06-23.offering/recurring-charges]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-run-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-run-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-instances (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/device-instance))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-suites-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-suites-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-suites-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-suites-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-suites-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-upload-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-upload-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.idempotency-exception/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/idempotency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.idempotency-exception/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/artifacts (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/artifact))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.artifact/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.artifact/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.artifact/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/artifact-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.artifact/extension (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.artifact/url (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/url))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/artifact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.artifact/arn :portkey.aws.devicefarm.-2015-06-23.artifact/name :portkey.aws.devicefarm.-2015-06-23.artifact/type :portkey.aws.devicefarm.-2015-06-23.artifact/extension :portkey.aws.devicefarm.-2015-06-23.artifact/url]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-project-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-project-request/default-job-timeout-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.create-project-request/name] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-project-request/default-job-timeout-minutes]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/unique-problems (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/unique-problem))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/upload-type #{"UIAUTOMATOR_TEST_PACKAGE" :appium-web-java-junit-test-spec :appium-web-java-testng-test-spec "XCTEST_UI_TEST_SPEC" :appium-java-junit-test-spec "EXTERNAL_DATA" "APPIUM_JAVA_TESTNG_TEST_SPEC" "XCTEST_TEST_PACKAGE" :appium-python-test-spec "APPIUM_JAVA_TESTNG_TEST_PACKAGE" "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC" :instrumentation-test-package "APPIUM_PYTHON_TEST_PACKAGE" :xctest-ui-test-spec :xctest-ui-test-package "WEB_APP" :web-app "ANDROID_APP" "INSTRUMENTATION_TEST_PACKAGE" "IOS_APP" "APPIUM_JAVA_JUNIT_TEST_SPEC" :appium-web-java-testng-test-package :calabash-test-package :xctest-test-package :external-data "INSTRUMENTATION_TEST_SPEC" "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE" :appium-python-test-package "APPIUM_WEB_PYTHON_TEST_PACKAGE" :uiautomation-test-package "APPIUM_PYTHON_TEST_SPEC" "UIAUTOMATION_TEST_PACKAGE" "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC" :appium-web-python-test-spec :android-app "APPIUM_JAVA_JUNIT_TEST_PACKAGE" :appium-java-junit-test-package "XCTEST_UI_TEST_PACKAGE" :appium-web-python-test-package :instrumentation-test-spec :appium-web-java-junit-test-package "APPIUM_WEB_PYTHON_TEST_SPEC" :appium-java-testng-test-package "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE" :ios-app :uiautomator-test-package :appium-java-testng-test-spec "CALABASH_TEST_PACKAGE"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-device-pool-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-device-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-device-pool-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/suites (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/suite))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offering-promotions-result/offering-promotions (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-promotions))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offering-promotions-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-offering-promotions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-offering-promotions-result/offering-promotions :portkey.aws.devicefarm.-2015-06-23.list-offering-promotions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.recurring-charge/cost (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/monetary-amount))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.recurring-charge/frequency (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/recurring-charge-frequency))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/recurring-charge (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.recurring-charge/cost :portkey.aws.devicefarm.-2015-06-23.recurring-charge/frequency]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.unique-problem/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.unique-problem/problems (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/problems))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/unique-problem (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.unique-problem/message :portkey.aws.devicefarm.-2015-06-23.unique-problem/problems]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-remote-access-session-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-instances-result/device-instances (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-instances))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-instances-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-device-instances-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-device-instances-result/device-instances :portkey.aws.devicefarm.-2015-06-23.list-device-instances-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/instance-profiles (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/instance-profile))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.renew-offering-result/offering-transaction (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-transaction))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/renew-offering-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.renew-offering-result/offering-transaction]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool-compatibility-result/device (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool-compatibility-result/compatible (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool-compatibility-result/incompatibility-messages (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/incompatibility-messages))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-pool-compatibility-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.device-pool-compatibility-result/device :portkey.aws.devicefarm.-2015-06-23.device-pool-compatibility-result/compatible :portkey.aws.devicefarm.-2015-06-23.device-pool-compatibility-result/incompatibility-messages]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.execution-configuration/job-timeout-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.execution-configuration/accounts-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/accounts-cleanup))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.execution-configuration/app-packages-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/app-packages-cleanup))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.execution-configuration/video-capture (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/video-capture))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.execution-configuration/skip-app-resign (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/skip-app-resign))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/execution-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.execution-configuration/job-timeout-minutes :portkey.aws.devicefarm.-2015-06-23.execution-configuration/accounts-cleanup :portkey.aws.devicefarm.-2015-06-23.execution-configuration/app-packages-cleanup :portkey.aws.devicefarm.-2015-06-23.execution-configuration/video-capture :portkey.aws.devicefarm.-2015-06-23.execution-configuration/skip-app-resign]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/created (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/device (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/skip-app-resign (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/skip-app-resign))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/started (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/device-udid (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/host-address (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/host-address))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/remote-record-enabled (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/remote-debug-enabled (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/client-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/client-id))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/stopped (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/remote-record-app-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/endpoint (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/interaction-mode (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/interaction-mode))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/billing-method (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/billing-method))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/device-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/instance-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.remote-access-session/result (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-result))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/remote-access-session (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.remote-access-session/message :portkey.aws.devicefarm.-2015-06-23.remote-access-session/created :portkey.aws.devicefarm.-2015-06-23.remote-access-session/device :portkey.aws.devicefarm.-2015-06-23.remote-access-session/skip-app-resign :portkey.aws.devicefarm.-2015-06-23.remote-access-session/started :portkey.aws.devicefarm.-2015-06-23.remote-access-session/device-udid :portkey.aws.devicefarm.-2015-06-23.remote-access-session/host-address :portkey.aws.devicefarm.-2015-06-23.remote-access-session/remote-record-enabled :portkey.aws.devicefarm.-2015-06-23.remote-access-session/arn :portkey.aws.devicefarm.-2015-06-23.remote-access-session/remote-debug-enabled :portkey.aws.devicefarm.-2015-06-23.remote-access-session/name :portkey.aws.devicefarm.-2015-06-23.remote-access-session/status :portkey.aws.devicefarm.-2015-06-23.remote-access-session/client-id :portkey.aws.devicefarm.-2015-06-23.remote-access-session/stopped :portkey.aws.devicefarm.-2015-06-23.remote-access-session/remote-record-app-arn :portkey.aws.devicefarm.-2015-06-23.remote-access-session/endpoint :portkey.aws.devicefarm.-2015-06-23.remote-access-session/interaction-mode :portkey.aws.devicefarm.-2015-06-23.remote-access-session/billing-method :portkey.aws.devicefarm.-2015-06-23.remote-access-session/device-minutes :portkey.aws.devicefarm.-2015-06-23.remote-access-session/instance-arn :portkey.aws.devicefarm.-2015-06-23.remote-access-session/result]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/samples (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/sample))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-pool-result/device-pool (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pool))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-device-pool-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-device-pool-result/device-pool]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-project-result/project (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/project))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-project-result/project]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/accounts-cleanup clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/upload-category #{"CURATED" :private :curated "PRIVATE"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/interaction-mode #{:interactive "NO_VIDEO" :video-only "VIDEO_ONLY" "INTERACTIVE" :no-video})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-suite-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-suite-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-suite-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/vpce-configuration-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/vpce-service-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-service-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/service-dns-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/service-dns-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/vpce-configuration-description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-description))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/vpce-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.vpce-configuration/arn :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/vpce-configuration-name :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/vpce-service-name :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/service-dns-name :portkey.aws.devicefarm.-2015-06-23.vpce-configuration/vpce-configuration-description]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/problems (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/problem))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.stop-run-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/stop-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.stop-run-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-unique-problems-result/unique-problems (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/unique-problems-by-execution-result-map))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-unique-problems-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-unique-problems-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-unique-problems-result/unique-problems :portkey.aws.devicefarm.-2015-06-23.list-unique-problems-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-pool-type #{"CURATED" :private :curated "PRIVATE"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-remote-access-session-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-remote-access-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-remote-access-session-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-promotions (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/offering-promotion))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-offering-status-result/current (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-status-map))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-offering-status-result/next-period (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-status-map))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-offering-status-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-offering-status-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-offering-status-result/current :portkey.aws.devicefarm.-2015-06-23.get-offering-status-result/next-period :portkey.aws.devicefarm.-2015-06-23.get-offering-status-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-instance-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-request/max-results :portkey.aws.devicefarm.-2015-06-23.list-instance-profiles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/runs (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/run))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-result/vpce-configurations (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configurations))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-vpce-configurations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-result/vpce-configurations :portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-run-result/run (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/run))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-run-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-run-result/run]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 32 (clojure.core/count s__27879__auto__)))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem/run (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/problem-detail))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem/job (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/problem-detail))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem/suite (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/problem-detail))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem/test (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/problem-detail))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem/device (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem/result (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-result))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/problem (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.problem/run :portkey.aws.devicefarm.-2015-06-23.problem/job :portkey.aws.devicefarm.-2015-06-23.problem/suite :portkey.aws.devicefarm.-2015-06-23.problem/test :portkey.aws.devicefarm.-2015-06-23.problem/device :portkey.aws.devicefarm.-2015-06-23.problem/result :portkey.aws.devicefarm.-2015-06-23.problem/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-result/instance-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-instance-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-instance-profile-result/instance-profile]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offerings-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-offerings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-offerings-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.not-eligible-exception/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/not-eligible-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.not-eligible-exception/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/video-capture clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-result/vpce-configuration (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-vpce-configuration-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-result/vpce-configuration]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-devices-result/devices (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/devices))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-devices-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-devices-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-devices-result/devices :portkey.aws.devicefarm.-2015-06-23.list-devices-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-instance-result/device-instance (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-instance))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-device-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-device-instance-result/device-instance]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.stop-run-result/run (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/run))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/stop-run-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.stop-run-result/run]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-transaction/offering-status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-transaction/transaction-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/transaction-identifier))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-transaction/offering-promotion-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-promotion-identifier))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-transaction/created-on (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-transaction/cost (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/monetary-amount))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-transaction (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.offering-transaction/offering-status :portkey.aws.devicefarm.-2015-06-23.offering-transaction/transaction-id :portkey.aws.devicefarm.-2015-06-23.offering-transaction/offering-promotion-id :portkey.aws.devicefarm.-2015-06-23.offering-transaction/created-on :portkey.aws.devicefarm.-2015-06-23.offering-transaction/cost]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/test-parameters (clojure.spec.alpha/map-of :portkey.aws.devicefarm.-2015-06-23/string :portkey.aws.devicefarm.-2015-06-23/string))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.purchase-offering-request/offering-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-identifier))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.purchase-offering-request/quantity (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.purchase-offering-request/offering-promotion-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-promotion-identifier))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/purchase-offering-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.purchase-offering-request/offering-id :portkey.aws.devicefarm.-2015-06-23.purchase-offering-request/quantity :portkey.aws.devicefarm.-2015-06-23.purchase-offering-request/offering-promotion-id]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.incompatibility-message/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.incompatibility-message/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-attribute))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/incompatibility-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.incompatibility-message/message :portkey.aws.devicefarm.-2015-06-23.incompatibility-message/type]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/aws-account-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 2 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 16))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-job-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-job-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-suite-result/suite (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/suite))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-suite-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-suite-result/suite]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-samples-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-samples-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-samples-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-samples-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-samples-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-vpce-configuration-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-vpce-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-vpce-configuration-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/sample-type #{"RX" :native-max-drawtime :native-frames "OPENGL_MAX_DRAWTIME" :rx "NATIVE_MAX_DRAWTIME" :opengl-max-drawtime :opengl-min-drawtime "MEMORY" "NATIVE_FRAMES" "RX_RATE" :memory "CPU" :opengl-avg-drawtime "THREADS" "OPENGL_FRAMES" "OPENGL_MIN_DRAWTIME" "NATIVE_MIN_DRAWTIME" :native-fps :threads :tx "NATIVE_FPS" :tx-rate "TX" "OPENGL_AVG_DRAWTIME" :native-avg-drawtime "NATIVE_AVG_DRAWTIME" :rx-rate "OPENGL_FPS" :cpu :opengl-frames :native-min-drawtime :opengl-fps "TX_RATE"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-jitter-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-delay-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-loss-percent (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/percent-integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-bandwidth-bits (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-delay-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-loss-percent (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/percent-integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-bandwidth-bits (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-jitter-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-network-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-jitter-ms :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-delay-ms :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-loss-percent :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/name :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-bandwidth-bits :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-delay-ms :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/type :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-loss-percent :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/uplink-bandwidth-bits :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/description :portkey.aws.devicefarm.-2015-06-23.update-network-profile-request/downlink-jitter-ms]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/service-dns-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.install-to-remote-access-session-result/app-upload (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/install-to-remote-access-session-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.install-to-remote-access-session-result/app-upload]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-upload-request/project-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-upload-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-upload-request/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-upload-request/content-type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/content-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.create-upload-request/project-arn :portkey.aws.devicefarm.-2015-06-23.create-upload-request/name :portkey.aws.devicefarm.-2015-06-23.create-upload-request/type] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-upload-request/content-type]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/network-profile-type #{"CURATED" :private :curated "PRIVATE"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/test-package-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/test-spec-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/filter (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/filter))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/parameters (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test-parameters))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/schedule-run-test (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.schedule-run-test/type] :opt-un [:portkey.aws.devicefarm.-2015-06-23.schedule-run-test/test-package-arn :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/test-spec-arn :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/filter :portkey.aws.devicefarm.-2015-06-23.schedule-run-test/parameters]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.project/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.project/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.project/default-job-timeout-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/job-timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.project/created (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/project (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.project/arn :portkey.aws.devicefarm.-2015-06-23.project/name :portkey.aws.devicefarm.-2015-06-23.project/default-job-timeout-minutes :portkey.aws.devicefarm.-2015-06-23.project/created]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.stop-remote-access-session-result/remote-access-session (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/remote-access-session))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/stop-remote-access-session-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.stop-remote-access-session-result/remote-access-session]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/tests (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/test))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.counters/total (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.counters/passed (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.counters/failed (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.counters/warned (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.counters/errored (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.counters/stopped (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.counters/skipped (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.counters/total :portkey.aws.devicefarm.-2015-06-23.counters/passed :portkey.aws.devicefarm.-2015-06-23.counters/failed :portkey.aws.devicefarm.-2015-06-23.counters/warned :portkey.aws.devicefarm.-2015-06-23.counters/errored :portkey.aws.devicefarm.-2015-06-23.counters/stopped :portkey.aws.devicefarm.-2015-06-23.counters/skipped]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.rule/attribute (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-attribute))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.rule/operator (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/rule-operator))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.rule/value (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.rule/attribute :portkey.aws.devicefarm.-2015-06-23.rule/operator :portkey.aws.devicefarm.-2015-06-23.rule/value]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-vpce-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-request/max-results :portkey.aws.devicefarm.-2015-06-23.list-vpce-configurations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/instance-labels (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/string))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pool-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-pool/rules (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/rules))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-pool (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.device-pool/arn :portkey.aws.devicefarm.-2015-06-23.device-pool/name :portkey.aws.devicefarm.-2015-06-23.device-pool/description :portkey.aws.devicefarm.-2015-06-23.device-pool/type :portkey.aws.devicefarm.-2015-06-23.device-pool/rules]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/package-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/exclude-app-packages-from-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/package-ids))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/reboot-after-use (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/name] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/description :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/package-cleanup :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/exclude-app-packages-from-cleanup :portkey.aws.devicefarm.-2015-06-23.create-instance-profile-request/reboot-after-use]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-instances-request/max-results (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-instances-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-device-instances-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-device-instances-request/max-results :portkey.aws.devicefarm.-2015-06-23.list-device-instances-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-instance-profile-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-instance-profile-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/created (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/started (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/counters (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/counters))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/stopped (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/device-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.suite/result (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-result))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/suite (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.suite/message :portkey.aws.devicefarm.-2015-06-23.suite/created :portkey.aws.devicefarm.-2015-06-23.suite/started :portkey.aws.devicefarm.-2015-06-23.suite/arn :portkey.aws.devicefarm.-2015-06-23.suite/counters :portkey.aws.devicefarm.-2015-06-23.suite/name :portkey.aws.devicefarm.-2015-06-23.suite/status :portkey.aws.devicefarm.-2015-06-23.suite/stopped :portkey.aws.devicefarm.-2015-06-23.suite/type :portkey.aws.devicefarm.-2015-06-23.suite/device-minutes :portkey.aws.devicefarm.-2015-06-23.suite/result]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-jobs-result/jobs (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/jobs))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-jobs-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-jobs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-jobs-result/jobs :portkey.aws.devicefarm.-2015-06-23.list-jobs-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-upload-result/upload (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-upload-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-upload-result/upload]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/artifact-type #{"CUSTOMER_ARTIFACT" :device-log "UNKNOWN" :video "CALABASH_JSON_OUTPUT" :result-log :service-log "APPIUM_SERVER_OUTPUT" "CALABASH_STANDARD_OUTPUT" :appium-server-output :calabash-json-output "APPIUM_PYTHON_OUTPUT" :unknown "EXERCISER_MONKEY_OUTPUT" :appium-java-xml-output "RESULT_LOG" "VIDEO" "SCREENSHOT" "EXPLORER_SUMMARY_LOG" :automation-output :application-crash-report :customer-artifact-log :appium-java-output :customer-artifact :explorer-summary-log "INSTRUMENTATION_OUTPUT" "VIDEO_LOG" :calabash-java-xml-output "APPIUM_JAVA_XML_OUTPUT" "SERVICE_LOG" :appium-python-xml-output "EXPLORER_EVENT_LOG" :calabash-standard-output :message-log "MESSAGE_LOG" :webkit-log "WEBKIT_LOG" :exerciser-monkey-output "AUTOMATION_OUTPUT" :video-log "CALABASH_PRETTY_OUTPUT" :testspec-output "TESTSPEC_OUTPUT" "DEVICE_LOG" "APPLICATION_CRASH_REPORT" "CUSTOMER_ARTIFACT_LOG" :xctest-log "APPIUM_PYTHON_XML_OUTPUT" "XCTEST_LOG" :explorer-event-log :appium-python-output "APPIUM_JAVA_OUTPUT" "CALABASH_JAVA_XML_OUTPUT" :instrumentation-output :calabash-pretty-output :screenshot})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/jobs (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/job))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offering-promotions-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-offering-promotions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-offering-promotions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-form-factor #{:tablet :phone "PHONE" "TABLET"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/customer-artifact-paths (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/customer-artifact-paths))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/locale (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/location (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/location))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/radios (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/radios))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/auxiliary-apps (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-names))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/billing-method (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/billing-method))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/vpce-configuration-arns (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-names))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/extra-data-package-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/network-profile-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/schedule-run-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/customer-artifact-paths :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/locale :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/location :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/radios :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/auxiliary-apps :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/billing-method :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/vpce-configuration-arns :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/extra-data-package-arn :portkey.aws.devicefarm.-2015-06-23.schedule-run-configuration/network-profile-arn]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem-detail/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.problem-detail/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/problem-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.problem-detail/arn :portkey.aws.devicefarm.-2015-06-23.problem-detail/name]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/metadata (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-instance-profile-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-instance-profile-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-runs-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-runs-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-runs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/execution-status #{"COMPLETED" :scheduling :preparing "PENDING_CONCURRENCY" :processing :pending :completed "PENDING" :running :stopping "PREPARING" "PENDING_DEVICE" :pending-device :pending-concurrency "SCHEDULING" "STOPPING" "PROCESSING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-result/remote-access-session (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/remote-access-session))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-result/remote-access-session]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-instance-result/device-instance (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-instance))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-device-instance-result/device-instance]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/unique-problems-by-execution-result-map (clojure.spec.alpha/map-of :portkey.aws.devicefarm.-2015-06-23/execution-result :portkey.aws.devicefarm.-2015-06-23/unique-problems))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/vpce-configuration-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/vpce-service-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-service-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/service-dns-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/service-dns-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/vpce-configuration-description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-description))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-vpce-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/vpce-configuration-name :portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/vpce-service-name :portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/service-dns-name] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-vpce-configuration-request/vpce-configuration-description]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/recurring-charge-frequency #{:monthly "MONTHLY"})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-upload-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-attribute #{"FORM_FACTOR" :remote-debug-enabled "APPIUM_VERSION" "ARN" "REMOTE_DEBUG_ENABLED" "INSTANCE_LABELS" "INSTANCE_ARN" :form-factor :remote-access-enabled :instance-labels "PLATFORM" :instance-arn :manufacturer :appium-version "FLEET_TYPE" "MANUFACTURER" "REMOTE_ACCESS_ENABLED" :arn :platform :fleet-type})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.sample/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.sample/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/sample-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.sample/url (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/url))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/sample (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.sample/arn :portkey.aws.devicefarm.-2015-06-23.sample/type :portkey.aws.devicefarm.-2015-06-23.sample/url]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-devices-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-devices-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-devices-request/arn :portkey.aws.devicefarm.-2015-06-23.list-devices-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/instance-status #{"IN_USE" :preparing "AVAILABLE" :in-use "NOT_AVAILABLE" "PREPARING" :not-available :available})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/projects (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/project))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-network-profile-result/network-profile (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-network-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-network-profile-result/network-profile]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/purchased-devices-map (clojure.spec.alpha/map-of :portkey.aws.devicefarm.-2015-06-23/device-platform :portkey.aws.devicefarm.-2015-06-23/integer))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-instance-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-instance-request/profile-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-device-instance-request/labels (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/instance-labels))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-device-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.update-device-instance-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-device-instance-request/profile-arn :portkey.aws.devicefarm.-2015-06-23.update-device-instance-request/labels]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-pools (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/device-pool))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-device-pool-result/device-pool (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pool))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-device-pool-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-device-pool-result/device-pool]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/skip-app-resign (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/remote-record-enabled (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/device-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/remote-debug-enabled (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/configuration (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-configuration))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/project-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/client-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/client-id))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/remote-record-app-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/interaction-mode (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/interaction-mode))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/instance-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/project-arn :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/device-arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/skip-app-resign :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/remote-record-enabled :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/remote-debug-enabled :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/configuration :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/name :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/ssh-public-key :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/client-id :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/remote-record-app-arn :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/interaction-mode :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-request/instance-arn]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/message (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/created (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/device (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/started (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/video-endpoint (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/counters (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/counters))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/status (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/video-capture (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/video-capture))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/stopped (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/test-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/device-minutes (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-minutes))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/instance-arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.job/result (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/execution-result))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.job/message :portkey.aws.devicefarm.-2015-06-23.job/created :portkey.aws.devicefarm.-2015-06-23.job/device :portkey.aws.devicefarm.-2015-06-23.job/started :portkey.aws.devicefarm.-2015-06-23.job/arn :portkey.aws.devicefarm.-2015-06-23.job/video-endpoint :portkey.aws.devicefarm.-2015-06-23.job/counters :portkey.aws.devicefarm.-2015-06-23.job/name :portkey.aws.devicefarm.-2015-06-23.job/status :portkey.aws.devicefarm.-2015-06-23.job/video-capture :portkey.aws.devicefarm.-2015-06-23.job/stopped :portkey.aws.devicefarm.-2015-06-23.job/type :portkey.aws.devicefarm.-2015-06-23.job/device-minutes :portkey.aws.devicefarm.-2015-06-23.job/instance-arn :portkey.aws.devicefarm.-2015-06-23.job/result]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/recurring-charges (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/recurring-charge))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-type #{"RECURRING" :recurring})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/package-ids (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/string))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/app-packages-cleanup clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.renew-offering-request/offering-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-identifier))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.renew-offering-request/quantity (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/renew-offering-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.renew-offering-request/offering-id :portkey.aws.devicefarm.-2015-06-23.renew-offering-request/quantity]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-pool-compatibility-results (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/device-pool-compatibility-result))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/rules (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/rule))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-upload-result/upload (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-upload-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-upload-result/upload]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-run-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/vpce-configuration-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/vpce-service-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-service-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/service-dns-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/service-dns-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/vpce-configuration-description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration-description))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-vpce-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/vpce-configuration-name :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/vpce-service-name :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/service-dns-name :portkey.aws.devicefarm.-2015-06-23.update-vpce-configuration-request/vpce-configuration-description]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.purchase-offering-result/offering-transaction (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-transaction))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/purchase-offering-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.purchase-offering-result/offering-transaction]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-upload-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-upload-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/model (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/fleet-type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/remote-access-enabled (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/fleet-name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/image (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/os (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/remote-debug-enabled (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/model-id (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/manufacturer (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/cpu (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/cpu))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/radio (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/memory (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/form-factor (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-form-factor))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/instances (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-instances))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/carrier (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/string))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/platform (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-platform))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/heap-size (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device/resolution (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/resolution))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.device/model :portkey.aws.devicefarm.-2015-06-23.device/fleet-type :portkey.aws.devicefarm.-2015-06-23.device/arn :portkey.aws.devicefarm.-2015-06-23.device/remote-access-enabled :portkey.aws.devicefarm.-2015-06-23.device/fleet-name :portkey.aws.devicefarm.-2015-06-23.device/image :portkey.aws.devicefarm.-2015-06-23.device/os :portkey.aws.devicefarm.-2015-06-23.device/remote-debug-enabled :portkey.aws.devicefarm.-2015-06-23.device/model-id :portkey.aws.devicefarm.-2015-06-23.device/manufacturer :portkey.aws.devicefarm.-2015-06-23.device/cpu :portkey.aws.devicefarm.-2015-06-23.device/name :portkey.aws.devicefarm.-2015-06-23.device/radio :portkey.aws.devicefarm.-2015-06-23.device/memory :portkey.aws.devicefarm.-2015-06-23.device/form-factor :portkey.aws.devicefarm.-2015-06-23.device/instances :portkey.aws.devicefarm.-2015-06-23.device/carrier :portkey.aws.devicefarm.-2015-06-23.device/platform :portkey.aws.devicefarm.-2015-06-23.device/heap-size :portkey.aws.devicefarm.-2015-06-23.device/resolution]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-pool-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-device-pool-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/package-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/exclude-app-packages-from-cleanup (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/package-ids))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/reboot-after-use (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/boolean))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/update-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/name :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/description :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/package-cleanup :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/exclude-app-packages-from-cleanup :portkey.aws.devicefarm.-2015-06-23.update-instance-profile-request/reboot-after-use]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/ios-paths (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/string))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-vpce-configuration-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-jitter-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-delay-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-loss-percent (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/percent-integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/name (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-bandwidth-bits (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-delay-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-loss-percent (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/percent-integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-bandwidth-bits (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/description (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/message))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-jitter-ms (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/long))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/network-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-jitter-ms :portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-delay-ms :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-loss-percent :portkey.aws.devicefarm.-2015-06-23.network-profile/arn :portkey.aws.devicefarm.-2015-06-23.network-profile/name :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-bandwidth-bits :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-delay-ms :portkey.aws.devicefarm.-2015-06-23.network-profile/type :portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-loss-percent :portkey.aws.devicefarm.-2015-06-23.network-profile/uplink-bandwidth-bits :portkey.aws.devicefarm.-2015-06-23.network-profile/description :portkey.aws.devicefarm.-2015-06-23.network-profile/downlink-jitter-ms]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.monetary-amount/amount (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.monetary-amount/currency-code (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/currency-code))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/monetary-amount (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.monetary-amount/amount :portkey.aws.devicefarm.-2015-06-23.monetary-amount/currency-code]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-minutes/total (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-minutes/metered (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.device-minutes/unmetered (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/double))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/device-minutes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.device-minutes/total :portkey.aws.devicefarm.-2015-06-23.device-minutes/metered :portkey.aws.devicefarm.-2015-06-23.device-minutes/unmetered]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-network-profile-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-network-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-network-profile-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-pools-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-pools-request/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pool-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-device-pools-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-device-pools-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-device-pools-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-device-pools-request/type :portkey.aws.devicefarm.-2015-06-23.list-device-pools-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/upload-status #{:processing :initialized "SUCCEEDED" "INITIALIZED" "FAILED" "PROCESSING" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/incompatibility-messages (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/incompatibility-message))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.delete-project-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.delete-project-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-account-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-network-profiles-result/network-profiles (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profiles))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-network-profiles-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-network-profiles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-network-profiles-result/network-profiles :portkey.aws.devicefarm.-2015-06-23.list-network-profiles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-test-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-test-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-test-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offering-transactions-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-offering-transactions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-offering-transactions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offering-transactions-result/offering-transactions (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-transactions))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-offering-transactions-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-offering-transactions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-offering-transactions-result/offering-transactions :portkey.aws.devicefarm.-2015-06-23.list-offering-transactions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-runs-result/runs (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/runs))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-runs-result/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-runs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-runs-result/runs :portkey.aws.devicefarm.-2015-06-23.list-runs-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-status/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering-transaction-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-status/offering (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/offering))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-status/quantity (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/integer))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.offering-status/effective-on (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/date-time))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/offering-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.offering-status/type :portkey.aws.devicefarm.-2015-06-23.offering-status/offering :portkey.aws.devicefarm.-2015-06-23.offering-status/quantity :portkey.aws.devicefarm.-2015-06-23.offering-status/effective-on]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-network-profiles-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-network-profiles-request/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/network-profile-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-network-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-network-profiles-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-network-profiles-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-network-profiles-request/type :portkey.aws.devicefarm.-2015-06-23.list-network-profiles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/devices (clojure.spec.alpha/coll-of :portkey.aws.devicefarm.-2015-06-23/device))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-network-profile-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-network-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-network-profile-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-configuration/billing-method (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/billing-method))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-configuration/vpce-configuration-arns (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-names))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-configuration/billing-method :portkey.aws.devicefarm.-2015-06-23.create-remote-access-session-configuration/vpce-configuration-arns]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-vpce-configuration-result/vpce-configuration (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/vpce-configuration))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-vpce-configuration-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-vpce-configuration-result/vpce-configuration]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-device-pool-result/device-pool (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/device-pool))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-device-pool-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.devicefarm.-2015-06-23.get-device-pool-result/device-pool]))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.get-project-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/get-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.get-project-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-uploads-request/arn (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-uploads-request/type (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/upload-type))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23.list-uploads-request/next-token (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/pagination-token))
(clojure.spec.alpha/def :portkey.aws.devicefarm.-2015-06-23/list-uploads-request (clojure.spec.alpha/keys :req-un [:portkey.aws.devicefarm.-2015-06-23.list-uploads-request/arn] :opt-un [:portkey.aws.devicefarm.-2015-06-23.list-uploads-request/type :portkey.aws.devicefarm.-2015-06-23.list-uploads-request/next-token]))

(clojure.core/defn list-suites ([list-suites-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-suites-request list-suites-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-suites-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-suites-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSuites", :http.request.configuration/output-deser-fn deser-list-suites-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-suites :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-suites-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-suites-result))

(clojure.core/defn list-artifacts ([list-artifacts-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-artifacts-request list-artifacts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-artifacts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-artifacts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListArtifacts", :http.request.configuration/output-deser-fn deser-list-artifacts-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-artifacts :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-artifacts-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-artifacts-result))

(clojure.core/defn get-device ([get-device-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-device-request get-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-device-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-device-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDevice", :http.request.configuration/output-deser-fn deser-get-device-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-device :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-device-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-device-result))

(clojure.core/defn update-vpce-configuration ([update-vpce-configuration-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-vpce-configuration-request update-vpce-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/update-vpce-configuration-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/update-vpce-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateVPCEConfiguration", :http.request.configuration/output-deser-fn deser-update-vpce-configuration-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception, "InvalidOperationException" :portkey.aws.devicefarm.-2015-06-23/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef update-vpce-configuration :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/update-vpce-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/update-vpce-configuration-result))

(clojure.core/defn delete-upload ([delete-upload-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-upload-request delete-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-upload-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUpload", :http.request.configuration/output-deser-fn deser-delete-upload-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef delete-upload :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-upload-result))

(clojure.core/defn list-network-profiles ([list-network-profiles-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-network-profiles-request list-network-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-network-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-network-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListNetworkProfiles", :http.request.configuration/output-deser-fn deser-list-network-profiles-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-network-profiles :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-network-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-network-profiles-result))

(clojure.core/defn create-device-pool ([create-device-pool-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-device-pool-request create-device-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/create-device-pool-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/create-device-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDevicePool", :http.request.configuration/output-deser-fn deser-create-device-pool-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef create-device-pool :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/create-device-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-device-pool-result))

(clojure.core/defn delete-instance-profile ([delete-instance-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-instance-profile-request delete-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-instance-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-instance-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteInstanceProfile", :http.request.configuration/output-deser-fn deser-delete-instance-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef delete-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-instance-profile-result))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-projects-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-projects-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn deser-list-projects-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-projects-result))

(clojure.core/defn get-account-settings ([] (get-account-settings {})) ([get-account-settings-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-account-settings-request get-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-account-settings-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-account-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountSettings", :http.request.configuration/output-deser-fn deser-get-account-settings-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-account-settings-result))

(clojure.core/defn install-to-remote-access-session ([install-to-remote-access-session-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-install-to-remote-access-session-request install-to-remote-access-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/install-to-remote-access-session-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/install-to-remote-access-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InstallToRemoteAccessSession", :http.request.configuration/output-deser-fn deser-install-to-remote-access-session-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef install-to-remote-access-session :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/install-to-remote-access-session-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/install-to-remote-access-session-result))

(clojure.core/defn stop-remote-access-session ([stop-remote-access-session-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-remote-access-session-request stop-remote-access-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/stop-remote-access-session-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/stop-remote-access-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopRemoteAccessSession", :http.request.configuration/output-deser-fn deser-stop-remote-access-session-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef stop-remote-access-session :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/stop-remote-access-session-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/stop-remote-access-session-result))

(clojure.core/defn delete-device-pool ([delete-device-pool-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-device-pool-request delete-device-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-device-pool-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-device-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDevicePool", :http.request.configuration/output-deser-fn deser-delete-device-pool-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef delete-device-pool :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-device-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-device-pool-result))

(clojure.core/defn list-device-instances ([] (list-device-instances {})) ([list-device-instances-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-device-instances-request list-device-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-device-instances-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-device-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeviceInstances", :http.request.configuration/output-deser-fn deser-list-device-instances-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-device-instances :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-device-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-device-instances-result))

(clojure.core/defn update-project ([update-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/update-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/update-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn deser-update-project-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/update-project-result))

(clojure.core/defn renew-offering ([] (renew-offering {})) ([renew-offering-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-renew-offering-request renew-offering-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/renew-offering-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/renew-offering-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RenewOffering", :http.request.configuration/output-deser-fn deser-renew-offering-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "NotEligibleException" :portkey.aws.devicefarm.-2015-06-23/not-eligible-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef renew-offering :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/renew-offering-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/renew-offering-result))

(clojure.core/defn create-vpce-configuration ([create-vpce-configuration-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-vpce-configuration-request create-vpce-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/create-vpce-configuration-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/create-vpce-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateVPCEConfiguration", :http.request.configuration/output-deser-fn deser-create-vpce-configuration-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef create-vpce-configuration :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/create-vpce-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-vpce-configuration-result))

(clojure.core/defn list-instance-profiles ([] (list-instance-profiles {})) ([list-instance-profiles-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-instance-profiles-request list-instance-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-instance-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-instance-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInstanceProfiles", :http.request.configuration/output-deser-fn deser-list-instance-profiles-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-instance-profiles :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-instance-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-instance-profiles-result))

(clojure.core/defn create-network-profile ([create-network-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-network-profile-request create-network-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/create-network-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/create-network-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateNetworkProfile", :http.request.configuration/output-deser-fn deser-create-network-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef create-network-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/create-network-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-network-profile-result))

(clojure.core/defn create-instance-profile ([create-instance-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-instance-profile-request create-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/create-instance-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/create-instance-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateInstanceProfile", :http.request.configuration/output-deser-fn deser-create-instance-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef create-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/create-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-instance-profile-result))

(clojure.core/defn list-offering-transactions ([] (list-offering-transactions {})) ([list-offering-transactions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-offering-transactions-request list-offering-transactions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-offering-transactions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-offering-transactions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOfferingTransactions", :http.request.configuration/output-deser-fn deser-list-offering-transactions-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "NotEligibleException" :portkey.aws.devicefarm.-2015-06-23/not-eligible-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-offering-transactions :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-offering-transactions-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-offering-transactions-result))

(clojure.core/defn list-runs ([list-runs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-runs-request list-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-runs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRuns", :http.request.configuration/output-deser-fn deser-list-runs-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-runs :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-runs-result))

(clojure.core/defn list-tests ([list-tests-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tests-request list-tests-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-tests-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-tests-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTests", :http.request.configuration/output-deser-fn deser-list-tests-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-tests :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-tests-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-tests-result))

(clojure.core/defn get-test ([get-test-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-test-request get-test-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-test-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-test-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTest", :http.request.configuration/output-deser-fn deser-get-test-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-test :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-test-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-test-result))

(clojure.core/defn schedule-run ([schedule-run-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-schedule-run-request schedule-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/schedule-run-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/schedule-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ScheduleRun", :http.request.configuration/output-deser-fn deser-schedule-run-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "IdempotencyException" :portkey.aws.devicefarm.-2015-06-23/idempotency-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef schedule-run :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/schedule-run-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/schedule-run-result))

(clojure.core/defn list-samples ([list-samples-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-samples-request list-samples-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-samples-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-samples-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSamples", :http.request.configuration/output-deser-fn deser-list-samples-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-samples :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-samples-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-samples-result))

(clojure.core/defn get-device-pool-compatibility ([get-device-pool-compatibility-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-device-pool-compatibility-request get-device-pool-compatibility-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-device-pool-compatibility-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-device-pool-compatibility-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDevicePoolCompatibility", :http.request.configuration/output-deser-fn deser-get-device-pool-compatibility-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-device-pool-compatibility :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-device-pool-compatibility-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-device-pool-compatibility-result))

(clojure.core/defn update-network-profile ([update-network-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-network-profile-request update-network-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/update-network-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/update-network-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNetworkProfile", :http.request.configuration/output-deser-fn deser-update-network-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef update-network-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/update-network-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/update-network-profile-result))

(clojure.core/defn create-upload ([create-upload-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-upload-request create-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/create-upload-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/create-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUpload", :http.request.configuration/output-deser-fn deser-create-upload-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef create-upload :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/create-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-upload-result))

(clojure.core/defn delete-remote-access-session ([delete-remote-access-session-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-remote-access-session-request delete-remote-access-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-remote-access-session-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-remote-access-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRemoteAccessSession", :http.request.configuration/output-deser-fn deser-delete-remote-access-session-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef delete-remote-access-session :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-remote-access-session-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-remote-access-session-result))

(clojure.core/defn get-device-instance ([get-device-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-device-instance-request get-device-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-device-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-device-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDeviceInstance", :http.request.configuration/output-deser-fn deser-get-device-instance-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-device-instance :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-device-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-device-instance-result))

(clojure.core/defn list-remote-access-sessions ([list-remote-access-sessions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-remote-access-sessions-request list-remote-access-sessions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-remote-access-sessions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-remote-access-sessions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRemoteAccessSessions", :http.request.configuration/output-deser-fn deser-list-remote-access-sessions-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-remote-access-sessions :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-remote-access-sessions-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-remote-access-sessions-result))

(clojure.core/defn list-offering-promotions ([] (list-offering-promotions {})) ([list-offering-promotions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-offering-promotions-request list-offering-promotions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-offering-promotions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-offering-promotions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOfferingPromotions", :http.request.configuration/output-deser-fn deser-list-offering-promotions-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "NotEligibleException" :portkey.aws.devicefarm.-2015-06-23/not-eligible-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-offering-promotions :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-offering-promotions-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-offering-promotions-result))

(clojure.core/defn create-remote-access-session ([create-remote-access-session-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-remote-access-session-request create-remote-access-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRemoteAccessSession", :http.request.configuration/output-deser-fn deser-create-remote-access-session-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef create-remote-access-session :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-remote-access-session-result))

(clojure.core/defn update-device-pool ([update-device-pool-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-device-pool-request update-device-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/update-device-pool-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/update-device-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDevicePool", :http.request.configuration/output-deser-fn deser-update-device-pool-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef update-device-pool :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/update-device-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/update-device-pool-result))

(clojure.core/defn stop-run ([stop-run-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-run-request stop-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/stop-run-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/stop-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopRun", :http.request.configuration/output-deser-fn deser-stop-run-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef stop-run :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/stop-run-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/stop-run-result))

(clojure.core/defn update-device-instance ([update-device-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-device-instance-request update-device-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/update-device-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/update-device-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDeviceInstance", :http.request.configuration/output-deser-fn deser-update-device-instance-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef update-device-instance :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/update-device-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/update-device-instance-result))

(clojure.core/defn get-offering-status ([] (get-offering-status {})) ([get-offering-status-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-offering-status-request get-offering-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-offering-status-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-offering-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOfferingStatus", :http.request.configuration/output-deser-fn deser-get-offering-status-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "NotEligibleException" :portkey.aws.devicefarm.-2015-06-23/not-eligible-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-offering-status :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/get-offering-status-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-offering-status-result))

(clojure.core/defn list-uploads ([list-uploads-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-uploads-request list-uploads-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-uploads-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-uploads-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUploads", :http.request.configuration/output-deser-fn deser-list-uploads-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-uploads :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-uploads-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-uploads-result))

(clojure.core/defn update-upload ([update-upload-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-upload-request update-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/update-upload-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/update-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUpload", :http.request.configuration/output-deser-fn deser-update-upload-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef update-upload :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/update-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/update-upload-result))

(clojure.core/defn list-devices ([] (list-devices {})) ([list-devices-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-devices-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-devices-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDevices", :http.request.configuration/output-deser-fn deser-list-devices-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-devices-result))

(clojure.core/defn get-suite ([get-suite-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-suite-request get-suite-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-suite-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-suite-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSuite", :http.request.configuration/output-deser-fn deser-get-suite-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-suite :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-suite-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-suite-result))

(clojure.core/defn stop-job ([stop-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-job-request stop-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/stop-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/stop-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopJob", :http.request.configuration/output-deser-fn deser-stop-job-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef stop-job :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/stop-job-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/stop-job-result))

(clojure.core/defn delete-project ([delete-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn deser-delete-project-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-project-result))

(clojure.core/defn delete-vpce-configuration ([delete-vpce-configuration-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-vpce-configuration-request delete-vpce-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-vpce-configuration-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-vpce-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVPCEConfiguration", :http.request.configuration/output-deser-fn deser-delete-vpce-configuration-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception, "InvalidOperationException" :portkey.aws.devicefarm.-2015-06-23/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-vpce-configuration :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-vpce-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-vpce-configuration-result))

(clojure.core/defn update-instance-profile ([update-instance-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-instance-profile-request update-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/update-instance-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/update-instance-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateInstanceProfile", :http.request.configuration/output-deser-fn deser-update-instance-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef update-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/update-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/update-instance-profile-result))

(clojure.core/defn list-device-pools ([list-device-pools-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-device-pools-request list-device-pools-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-device-pools-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-device-pools-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDevicePools", :http.request.configuration/output-deser-fn deser-list-device-pools-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-device-pools :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-device-pools-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-device-pools-result))

(clojure.core/defn list-unique-problems ([list-unique-problems-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-unique-problems-request list-unique-problems-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-unique-problems-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-unique-problems-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUniqueProblems", :http.request.configuration/output-deser-fn deser-list-unique-problems-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-unique-problems :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-unique-problems-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-unique-problems-result))

(clojure.core/defn get-project ([get-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-project-request get-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetProject", :http.request.configuration/output-deser-fn deser-get-project-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-project :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-project-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-project-result))

(clojure.core/defn delete-network-profile ([delete-network-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-network-profile-request delete-network-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-network-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-network-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNetworkProfile", :http.request.configuration/output-deser-fn deser-delete-network-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef delete-network-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-network-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-network-profile-result))

(clojure.core/defn get-job ([get-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-job-request get-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-job-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJob", :http.request.configuration/output-deser-fn deser-get-job-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-job :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-job-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-job-result))

(clojure.core/defn get-device-pool ([get-device-pool-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-device-pool-request get-device-pool-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-device-pool-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-device-pool-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDevicePool", :http.request.configuration/output-deser-fn deser-get-device-pool-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-device-pool :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-device-pool-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-device-pool-result))

(clojure.core/defn delete-run ([delete-run-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-run-request delete-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/delete-run-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/delete-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRun", :http.request.configuration/output-deser-fn deser-delete-run-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef delete-run :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/delete-run-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/delete-run-result))

(clojure.core/defn purchase-offering ([] (purchase-offering {})) ([purchase-offering-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-purchase-offering-request purchase-offering-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/purchase-offering-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/purchase-offering-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PurchaseOffering", :http.request.configuration/output-deser-fn deser-purchase-offering-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "NotEligibleException" :portkey.aws.devicefarm.-2015-06-23/not-eligible-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef purchase-offering :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/purchase-offering-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/purchase-offering-result))

(clojure.core/defn list-offerings ([] (list-offerings {})) ([list-offerings-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-offerings-request list-offerings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-offerings-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-offerings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOfferings", :http.request.configuration/output-deser-fn deser-list-offerings-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "NotEligibleException" :portkey.aws.devicefarm.-2015-06-23/not-eligible-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-offerings :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-offerings-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-offerings-result))

(clojure.core/defn get-vpce-configuration ([get-vpce-configuration-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-vpce-configuration-request get-vpce-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-vpce-configuration-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-vpce-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetVPCEConfiguration", :http.request.configuration/output-deser-fn deser-get-vpce-configuration-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-vpce-configuration :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-vpce-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-vpce-configuration-result))

(clojure.core/defn list-vpce-configurations ([] (list-vpce-configurations {})) ([list-vpce-configurations-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-vpce-configurations-request list-vpce-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-vpce-configurations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-vpce-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListVPCEConfigurations", :http.request.configuration/output-deser-fn deser-list-vpce-configurations-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-vpce-configurations :args (clojure.spec.alpha/? :portkey.aws.devicefarm.-2015-06-23/list-vpce-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-vpce-configurations-result))

(clojure.core/defn get-network-profile ([get-network-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-network-profile-request get-network-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-network-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-network-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetNetworkProfile", :http.request.configuration/output-deser-fn deser-get-network-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-network-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-network-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-network-profile-result))

(clojure.core/defn get-upload ([get-upload-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-upload-request get-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-upload-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetUpload", :http.request.configuration/output-deser-fn deser-get-upload-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-upload :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-upload-result))

(clojure.core/defn get-instance-profile ([get-instance-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-profile-request get-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-instance-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-instance-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceProfile", :http.request.configuration/output-deser-fn deser-get-instance-profile-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-instance-profile-result))

(clojure.core/defn get-run ([get-run-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-run-request get-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-run-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRun", :http.request.configuration/output-deser-fn deser-get-run-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-run :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-run-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-run-result))

(clojure.core/defn get-remote-access-session ([get-remote-access-session-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-remote-access-session-request get-remote-access-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/get-remote-access-session-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/get-remote-access-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRemoteAccessSession", :http.request.configuration/output-deser-fn deser-get-remote-access-session-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef get-remote-access-session :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/get-remote-access-session-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/get-remote-access-session-result))

(clojure.core/defn create-project ([create-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/create-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/create-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn deser-create-project-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/create-project-result))

(clojure.core/defn list-jobs ([list-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.devicefarm.-2015-06-23/endpoints, :http.request.configuration/target-prefix "DeviceFarm_20150623", :http.request.spec/output-spec :portkey.aws.devicefarm.-2015-06-23/list-jobs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-06-23", :http.request.configuration/service-id "Device Farm", :http.request.spec/input-spec :portkey.aws.devicefarm.-2015-06-23/list-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn deser-list-jobs-result, :http.request.spec/error-spec {"ArgumentException" :portkey.aws.devicefarm.-2015-06-23/argument-exception, "NotFoundException" :portkey.aws.devicefarm.-2015-06-23/not-found-exception, "LimitExceededException" :portkey.aws.devicefarm.-2015-06-23/limit-exceeded-exception, "ServiceAccountException" :portkey.aws.devicefarm.-2015-06-23/service-account-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/tuple :portkey.aws.devicefarm.-2015-06-23/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.devicefarm.-2015-06-23/list-jobs-result))
