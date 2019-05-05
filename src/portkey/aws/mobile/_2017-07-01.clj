(ns portkey.aws.mobile.-2017-07-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-platform)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-bundle-id)

(clojure.core/declare ser-contents)

(clojure.core/declare ser-project-id)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-project-region)

(clojure.core/declare ser-snapshot-id)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-platform [input] #:http.request.field{:value (clojure.core/get {"JAVASCRIPT" "JAVASCRIPT", :javascript "JAVASCRIPT", :windows "WINDOWS", "OSX" "OSX", :osx "OSX", "WINDOWS" "WINDOWS", :swift "SWIFT", "LINUX" "LINUX", "OBJC" "OBJC", :android "ANDROID", :linux "LINUX", "ANDROID" "ANDROID", "SWIFT" "SWIFT", :objc "OBJC"} input), :shape "Platform"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-bundle-id [input] #:http.request.field{:value input, :shape "BundleId"})

(clojure.core/defn- ser-contents [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Contents"})

(clojure.core/defn- ser-project-id [input] #:http.request.field{:value input, :shape "ProjectId"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-project-region [input] #:http.request.field{:value input, :shape "ProjectRegion"})

(clojure.core/defn- ser-snapshot-id [input] #:http.request.field{:value input, :shape "SnapshotId"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-list-projects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-export-project-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "uri", :location-name "projectId"})]}))

(clojure.core/defn- req-update-project-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "querystring", :location-name "projectId"})]} (clojure.core/contains? input :contents) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contents (input :contents)) #:http.request.field{:name "contents", :shape "Contents"}))))

(clojure.core/defn- req-export-bundle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bundle-id (input :bundle-id)) #:http.request.field{:name "bundleId", :shape "BundleId", :location "uri", :location-name "bundleId"})]} (clojure.core/contains? input :project-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "querystring", :location-name "projectId"})) (clojure.core/contains? input :platform) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform (input :platform)) #:http.request.field{:name "platform", :shape "Platform", :location "querystring", :location-name "platform"}))))

(clojure.core/defn- req-create-project-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName", :location "querystring", :location-name "name"})) (clojure.core/contains? input :region) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-region (input :region)) #:http.request.field{:name "region", :shape "ProjectRegion", :location "querystring", :location-name "region"})) (clojure.core/contains? input :contents) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-contents (input :contents)) #:http.request.field{:name "contents", :shape "Contents"})) (clojure.core/contains? input :snapshot-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "snapshotId", :shape "SnapshotId", :location "querystring", :location-name "snapshotId"}))))

(clojure.core/defn- req-describe-project-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "querystring", :location-name "projectId"})]} (clojure.core/contains? input :sync-from-resources) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sync-from-resources)) #:http.request.field{:name "syncFromResources", :shape "Boolean", :location "querystring", :location-name "syncFromResources"}))))

(clojure.core/defn- req-list-bundles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-describe-bundle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bundle-id (input :bundle-id)) #:http.request.field{:name "bundleId", :shape "BundleId", :location "uri", :location-name "bundleId"})]}))

(clojure.core/defn- req-delete-project-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId", :location "uri", :location-name "projectId"})]}))

(clojure.core/declare deser-platform)

(clojure.core/declare deser-bundle-version)

(clojure.core/declare deser-download-url)

(clojure.core/declare deser-share-url)

(clojure.core/declare deser-project-state)

(clojure.core/declare deser-feature)

(clojure.core/declare deser-bundle-list)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-project-summaries)

(clojure.core/declare deser-date)

(clojure.core/declare deser-attributes)

(clojure.core/declare deser-bundle-title)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-resources)

(clojure.core/declare deser-attribute-key)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-bundle-id)

(clojure.core/declare deser-bundle-details)

(clojure.core/declare deser-bundle-description)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-console-url)

(clojure.core/declare deser-project-id)

(clojure.core/declare deser-project-summary)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-icon-url)

(clojure.core/declare deser-project-name)

(clojure.core/declare deser-project-region)

(clojure.core/declare deser-project-details)

(clojure.core/declare deser-snapshot-id)

(clojure.core/declare deser-platforms)

(clojure.core/defn- deser-platform [input] (clojure.core/get {"OSX" :osx, "WINDOWS" :windows, "LINUX" :linux, "OBJC" :objc, "SWIFT" :swift, "ANDROID" :android, "JAVASCRIPT" :javascript} input))

(clojure.core/defn- deser-bundle-version [input] input)

(clojure.core/defn- deser-download-url [input] input)

(clojure.core/defn- deser-share-url [input] input)

(clojure.core/defn- deser-project-state [input] (clojure.core/get {"NORMAL" :normal, "SYNCING" :syncing, "IMPORTING" :importing} input))

(clojure.core/defn- deser-feature [input] input)

(clojure.core/defn- deser-bundle-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bundle-details coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-project-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-summary coll))) input))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-key k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-bundle-title [input] input)

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-attribute-key [input] input)

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-bundle-id [input] input)

(clojure.core/defn- deser-bundle-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "bundleId") (clojure.core/assoc :bundle-id (deser-bundle-id (input "bundleId"))) (clojure.core/contains? input "title") (clojure.core/assoc :title (deser-bundle-title (input "title"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-bundle-version (input "version"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-bundle-description (input "description"))) (clojure.core/contains? input "iconUrl") (clojure.core/assoc :icon-url (deser-icon-url (input "iconUrl"))) (clojure.core/contains? input "availablePlatforms") (clojure.core/assoc :available-platforms (deser-platforms (input "availablePlatforms")))))

(clojure.core/defn- deser-bundle-description [input] input)

(clojure.core/defn- deser-resource-type [input] input)

(clojure.core/defn- deser-console-url [input] input)

(clojure.core/defn- deser-project-id [input] input)

(clojure.core/defn- deser-project-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-project-name (input "name"))) (clojure.core/contains? input "projectId") (clojure.core/assoc :project-id (deser-project-id (input "projectId")))))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-resource-type (input "type"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-resource-arn (input "arn"))) (clojure.core/contains? input "feature") (clojure.core/assoc :feature (deser-feature (input "feature"))) (clojure.core/contains? input "attributes") (clojure.core/assoc :attributes (deser-attributes (input "attributes")))))

(clojure.core/defn- deser-icon-url [input] input)

(clojure.core/defn- deser-project-name [input] input)

(clojure.core/defn- deser-project-region [input] input)

(clojure.core/defn- deser-project-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-project-name (input "name"))) (clojure.core/contains? input "projectId") (clojure.core/assoc :project-id (deser-project-id (input "projectId"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-project-region (input "region"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-project-state (input "state"))) (clojure.core/contains? input "createdDate") (clojure.core/assoc :created-date (deser-date (input "createdDate"))) (clojure.core/contains? input "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-date (input "lastUpdatedDate"))) (clojure.core/contains? input "consoleUrl") (clojure.core/assoc :console-url (deser-console-url (input "consoleUrl"))) (clojure.core/contains? input "resources") (clojure.core/assoc :resources (deser-resources (input "resources")))))

(clojure.core/defn- deser-snapshot-id [input] input)

(clojure.core/defn- deser-platforms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform coll))) input))

(clojure.core/defn- response-describe-project-result ([input] (response-describe-project-result nil input)) ([resultWrapper1371063 input] (clojure.core/let [rawinput1371062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371064 {"details" (rawinput1371062 "details")}] (clojure.core/cond-> {} (letvar1371064 "details") (clojure.core/assoc :details (deser-project-details (clojure.core/get-in letvar1371064 ["details"])))))))

(clojure.core/defn- response-list-projects-result ([input] (response-list-projects-result nil input)) ([resultWrapper1371066 input] (clojure.core/let [rawinput1371065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371067 {"projects" (rawinput1371065 "projects"), "nextToken" (rawinput1371065 "nextToken")}] (clojure.core/cond-> {} (letvar1371067 "projects") (clojure.core/assoc :projects (deser-project-summaries (clojure.core/get-in letvar1371067 ["projects"]))) (letvar1371067 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1371067 ["nextToken"])))))))

(clojure.core/defn- response-update-project-result ([input] (response-update-project-result nil input)) ([resultWrapper1371069 input] (clojure.core/let [rawinput1371068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371070 {"details" (rawinput1371068 "details")}] (clojure.core/cond-> {} (letvar1371070 "details") (clojure.core/assoc :details (deser-project-details (clojure.core/get-in letvar1371070 ["details"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper1371072 input] (clojure.core/let [rawinput1371071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371073 {"message" (rawinput1371071 "message")}] (clojure.core/cond-> {} (letvar1371073 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371073 ["message"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1371075 input] (clojure.core/let [rawinput1371074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371076 {"message" (rawinput1371074 "message")}] (clojure.core/cond-> {} (letvar1371076 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371076 ["message"])))))))

(clojure.core/defn- response-export-bundle-result ([input] (response-export-bundle-result nil input)) ([resultWrapper1371078 input] (clojure.core/let [rawinput1371077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371079 {"downloadUrl" (rawinput1371077 "downloadUrl")}] (clojure.core/cond-> {} (letvar1371079 "downloadUrl") (clojure.core/assoc :download-url (deser-download-url (clojure.core/get-in letvar1371079 ["downloadUrl"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1371081 input] (clojure.core/let [rawinput1371080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371082 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "message" (rawinput1371080 "message")}] (clojure.core/cond-> {} (letvar1371082 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-error-message (clojure.core/get-in letvar1371082 ["Retry-After"]))) (letvar1371082 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371082 ["message"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1371084 input] (clojure.core/let [rawinput1371083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371085 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "message" (rawinput1371083 "message")}] (clojure.core/cond-> {} (letvar1371085 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-error-message (clojure.core/get-in letvar1371085 ["Retry-After"]))) (letvar1371085 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371085 ["message"])))))))

(clojure.core/defn- response-describe-bundle-result ([input] (response-describe-bundle-result nil input)) ([resultWrapper1371087 input] (clojure.core/let [rawinput1371086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371088 {"details" (rawinput1371086 "details")}] (clojure.core/cond-> {} (letvar1371088 "details") (clojure.core/assoc :details (deser-bundle-details (clojure.core/get-in letvar1371088 ["details"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1371090 input] (clojure.core/let [rawinput1371089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371091 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "message" (rawinput1371089 "message")}] (clojure.core/cond-> {} (letvar1371091 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-error-message (clojure.core/get-in letvar1371091 ["Retry-After"]))) (letvar1371091 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371091 ["message"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1371093 input] (clojure.core/let [rawinput1371092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371094 {"message" (rawinput1371092 "message")}] (clojure.core/cond-> {} (letvar1371094 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371094 ["message"])))))))

(clojure.core/defn- response-create-project-result ([input] (response-create-project-result nil input)) ([resultWrapper1371096 input] (clojure.core/let [rawinput1371095 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371097 {"details" (rawinput1371095 "details")}] (clojure.core/cond-> {} (letvar1371097 "details") (clojure.core/assoc :details (deser-project-details (clojure.core/get-in letvar1371097 ["details"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1371099 input] (clojure.core/let [rawinput1371098 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371100 {"message" (rawinput1371098 "message")}] (clojure.core/cond-> {} (letvar1371100 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371100 ["message"])))))))

(clojure.core/defn- response-delete-project-result ([input] (response-delete-project-result nil input)) ([resultWrapper1371102 input] (clojure.core/let [rawinput1371101 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371103 {"deletedResources" (rawinput1371101 "deletedResources"), "orphanedResources" (rawinput1371101 "orphanedResources")}] (clojure.core/cond-> {} (letvar1371103 "deletedResources") (clojure.core/assoc :deleted-resources (deser-resources (clojure.core/get-in letvar1371103 ["deletedResources"]))) (letvar1371103 "orphanedResources") (clojure.core/assoc :orphaned-resources (deser-resources (clojure.core/get-in letvar1371103 ["orphanedResources"])))))))

(clojure.core/defn- response-export-project-result ([input] (response-export-project-result nil input)) ([resultWrapper1371105 input] (clojure.core/let [rawinput1371104 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371106 {"downloadUrl" (rawinput1371104 "downloadUrl"), "shareUrl" (rawinput1371104 "shareUrl"), "snapshotId" (rawinput1371104 "snapshotId")}] (clojure.core/cond-> {} (letvar1371106 "downloadUrl") (clojure.core/assoc :download-url (deser-download-url (clojure.core/get-in letvar1371106 ["downloadUrl"]))) (letvar1371106 "shareUrl") (clojure.core/assoc :share-url (deser-share-url (clojure.core/get-in letvar1371106 ["shareUrl"]))) (letvar1371106 "snapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (clojure.core/get-in letvar1371106 ["snapshotId"])))))))

(clojure.core/defn- response-account-action-required-exception ([input] (response-account-action-required-exception nil input)) ([resultWrapper1371108 input] (clojure.core/let [rawinput1371107 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371109 {"message" (rawinput1371107 "message")}] (clojure.core/cond-> {} (letvar1371109 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1371109 ["message"])))))))

(clojure.core/defn- response-list-bundles-result ([input] (response-list-bundles-result nil input)) ([resultWrapper1371111 input] (clojure.core/let [rawinput1371110 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1371112 {"bundleList" (rawinput1371110 "bundleList"), "nextToken" (rawinput1371110 "nextToken")}] (clojure.core/cond-> {} (letvar1371112 "bundleList") (clojure.core/assoc :bundle-list (deser-bundle-list (clojure.core/get-in letvar1371112 ["bundleList"]))) (letvar1371112 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1371112 ["nextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.describe-project-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/max-results))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-projects-request/max-results :portkey.aws.mobile.-2017-07-01.list-projects-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-result/projects (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-summaries))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-projects-result/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-projects-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-projects-result/projects :portkey.aws.mobile.-2017-07-01.list-projects-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.update-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/update-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.update-project-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/platform #{"JAVASCRIPT" :javascript :windows "OSX" :osx "WINDOWS" :swift "LINUX" "OBJC" :android :linux "ANDROID" "SWIFT" :objc})

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/download-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/share-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-state #{:syncing "NORMAL" :normal "SYNCING" :importing "IMPORTING"})

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-result/download-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/download-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-bundle-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.export-bundle-result/download-url]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/feature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.-2017-07-01.export-project-request/project-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-list (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/bundle-details))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/retry-after-seconds :portkey.aws.mobile.-2017-07-01.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.update-project-request/contents (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/contents))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.update-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.-2017-07-01.update-project-request/project-id] :opt-un [:portkey.aws.mobile.-2017-07-01.update-project-request/contents]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.service-unavailable-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.service-unavailable-exception/retry-after-seconds :portkey.aws.mobile.-2017-07-01.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-request/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-bundle-request/platform (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/platform))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-bundle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.-2017-07-01.export-bundle-request/bundle-id] :opt-un [:portkey.aws.mobile.-2017-07-01.export-bundle-request/project-id :portkey.aws.mobile.-2017-07-01.export-bundle-request/platform]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/region (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-region))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/contents (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/contents))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-request/snapshot-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/create-project-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.create-project-request/name :portkey.aws.mobile.-2017-07-01.create-project-request/region :portkey.aws.mobile.-2017-07-01.create-project-request/contents :portkey.aws.mobile.-2017-07-01.create-project-request/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-summaries (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/project-summary))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-bundle-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-bundle-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.describe-bundle-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.too-many-requests-exception/retry-after-seconds :portkey.aws.mobile.-2017-07-01.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/attributes (clojure.spec.alpha/map-of :portkey.aws.mobile.-2017-07-01/attribute-key :portkey.aws.mobile.-2017-07-01/attribute-value))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-title (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-project-request/sync-from-resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/boolean))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.-2017-07-01.describe-project-request/project-id] :opt-un [:portkey.aws.mobile.-2017-07-01.describe-project-request/sync-from-resources]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.create-project-result/details (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-details))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/create-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.create-project-result/details]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resources (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/resource))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/attribute-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/contents clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.delete-project-result/deleted-resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resources))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.delete-project-result/orphaned-resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resources))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/delete-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.delete-project-result/deleted-resources :portkey.aws.mobile.-2017-07-01.delete-project-result/orphaned-resources]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-result/download-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/download-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-result/share-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/share-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.export-project-result/snapshot-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/export-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.export-project-result/download-url :portkey.aws.mobile.-2017-07-01.export-project-result/share-url :portkey.aws.mobile.-2017-07-01.export-project-result/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/title (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-title))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/version (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-version))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/description (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-description))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/icon-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/icon-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.bundle-details/available-platforms (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/platforms))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.bundle-details/bundle-id :portkey.aws.mobile.-2017-07-01.bundle-details/title :portkey.aws.mobile.-2017-07-01.bundle-details/version :portkey.aws.mobile.-2017-07-01.bundle-details/description :portkey.aws.mobile.-2017-07-01.bundle-details/icon-url :portkey.aws.mobile.-2017-07-01.bundle-details/available-platforms]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/bundle-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/console-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-request/max-results (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/max-results))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-request/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-bundles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-bundles-request/max-results :portkey.aws.mobile.-2017-07-01.list-bundles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-summary/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-summary/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.project-summary/name :portkey.aws.mobile.-2017-07-01.project-summary/project-id]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.describe-bundle-request/bundle-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/describe-bundle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.-2017-07-01.describe-bundle-request/bundle-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.account-action-required-exception/message (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/account-action-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.account-action-required-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/type (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resource-type))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resource-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/arn (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/feature (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/feature))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.resource/attributes (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/attributes))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.resource/type :portkey.aws.mobile.-2017-07-01.resource/name :portkey.aws.mobile.-2017-07-01.resource/arn :portkey.aws.mobile.-2017-07-01.resource/feature :portkey.aws.mobile.-2017-07-01.resource/attributes]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/icon-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-result/bundle-list (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/bundle-list))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.list-bundles-result/next-token (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/next-token))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/list-bundles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.list-bundles-result/bundle-list :portkey.aws.mobile.-2017-07-01.list-bundles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.delete-project-request/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mobile.-2017-07-01.delete-project-request/project-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/name (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-name))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/project-id (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-id))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/region (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-region))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/state (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/project-state))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/created-date (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/date))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/last-updated-date (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/date))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/console-url (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/console-url))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01.project-details/resources (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/resources))
(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/project-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mobile.-2017-07-01.project-details/name :portkey.aws.mobile.-2017-07-01.project-details/project-id :portkey.aws.mobile.-2017-07-01.project-details/region :portkey.aws.mobile.-2017-07-01.project-details/state :portkey.aws.mobile.-2017-07-01.project-details/created-date :portkey.aws.mobile.-2017-07-01.project-details/last-updated-date :portkey.aws.mobile.-2017-07-01.project-details/console-url :portkey.aws.mobile.-2017-07-01.project-details/resources]))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/snapshot-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/platforms (clojure.spec.alpha/coll-of :portkey.aws.mobile.-2017-07-01/platform))

(clojure.spec.alpha/def :portkey.aws.mobile.-2017-07-01/boolean clojure.core/boolean?)

(clojure.core/defn describe-bundle " Get the bundle details for the requested bundle id." ([describe-bundle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-bundle-request describe-bundle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/describe-bundle-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bundles/{bundleId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/describe-bundle-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBundle", :http.request.configuration/output-deser-fn response-describe-bundle-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception}})))))
(clojure.spec.alpha/fdef describe-bundle :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/describe-bundle-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/describe-bundle-result))

(clojure.core/defn describe-project " Gets details about a project in AWS Mobile Hub." ([describe-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/describe-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/project", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/describe-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProject", :http.request.configuration/output-deser-fn response-describe-project-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/describe-project-result))

(clojure.core/defn list-projects " Lists projects in AWS Mobile Hub." ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/list-projects-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/list-projects-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn response-list-projects-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.mobile.-2017-07-01/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/list-projects-result))

(clojure.core/defn update-project " Update an existing project." ([update-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/update-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/update", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/update-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn response-update-project-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception, "AccountActionRequiredException" :portkey.aws.mobile.-2017-07-01/account-action-required-exception, "LimitExceededException" :portkey.aws.mobile.-2017-07-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/update-project-result))

(clojure.core/defn export-bundle " Generates customized software development kit (SDK) and or tool packages used\nto integrate mobile web or mobile app clients with backend AWS resources." ([export-bundle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-export-bundle-request export-bundle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/export-bundle-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bundles/{bundleId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/export-bundle-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExportBundle", :http.request.configuration/output-deser-fn response-export-bundle-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception}})))))
(clojure.spec.alpha/fdef export-bundle :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/export-bundle-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/export-bundle-result))

(clojure.core/defn delete-project " Delets a project in AWS Mobile Hub." ([delete-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/delete-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/delete-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn response-delete-project-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/delete-project-result))

(clojure.core/defn list-bundles " List all available bundles." ([] (list-bundles {})) ([list-bundles-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-bundles-request list-bundles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/list-bundles-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bundles", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/list-bundles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBundles", :http.request.configuration/output-deser-fn response-list-bundles-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-bundles :args (clojure.spec.alpha/? :portkey.aws.mobile.-2017-07-01/list-bundles-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/list-bundles-result))

(clojure.core/defn export-project " Exports project configuration to a snapshot which can be downloaded and shared.\nNote that mobile app push credentials are encrypted in exported projects, so\nthey can only be shared successfully within the same AWS account." ([export-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-export-project-request export-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/export-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/exports/{projectId}", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/export-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExportProject", :http.request.configuration/output-deser-fn response-export-project-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception}})))))
(clojure.spec.alpha/fdef export-project :args (clojure.spec.alpha/tuple :portkey.aws.mobile.-2017-07-01/export-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/export-project-result))

(clojure.core/defn create-project " Creates an AWS Mobile Hub project." ([] (create-project {})) ([create-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mobile.-2017-07-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mobile.-2017-07-01/create-project-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.mobile.-2017-07-01/create-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn response-create-project-result, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.mobile.-2017-07-01/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.mobile.-2017-07-01/service-unavailable-exception, "UnauthorizedException" :portkey.aws.mobile.-2017-07-01/unauthorized-exception, "TooManyRequestsException" :portkey.aws.mobile.-2017-07-01/too-many-requests-exception, "BadRequestException" :portkey.aws.mobile.-2017-07-01/bad-request-exception, "NotFoundException" :portkey.aws.mobile.-2017-07-01/not-found-exception, "LimitExceededException" :portkey.aws.mobile.-2017-07-01/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/? :portkey.aws.mobile.-2017-07-01/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.mobile.-2017-07-01/create-project-result))
